library(rvest)
library(httr)
library(KoNLP)
library(stringr)
library(tm)
library(qgraph)
library(xml2)
library(dplyr)
library(networkD3)
install.packages("DT")
library(DT)

library(igraph)
library(tidyverse)
install.packages("threejs")
library(threejs)
library(readxl)
install.packages("ggpubr")
library(ggpubr)
library(forcats)
install.packages("extrafont")
library(extrafont)
loadfonts()

shinyServer(function(input, output) {
  
  ## --------------------------------------------------------------------##
  ## Tab1 :: IRIS, IRIS_
  IRIS_selectedData <- reactive({
    iris[, c(input$IRIS_xcol, input$IRIS_ycol)]
  })
  
  IRIS_kclusters <- reactive({
    kmeans(IRIS_selectedData(), input$IRIS_clusters)
  })
  
  output$IRIS_plot1 <- renderPlot({
    palette(c("#E41A1C", "#377EB8", "#4DAF4A", "#984EA3",
              "#FF7F00", "#FFFF33", "#A65628", "#F781BF", "#999999"))
    
    #par(mar = c(5.1, 4.1, 0, 1))
    plot(IRIS_selectedData(),
         col = IRIS_kclusters()$cluster,
         pch = 20, cex = 3)
    points(IRIS_kclusters()$centers, pch = 4, cex = 4, lwd = 4)
  })
  
  ## --------------------------------------------------------------------##
  ## Tab2 :: Data EDA,  prefix - EDA_
  function_eda_dataset <- eventReactive(input$EDA_action, {
    df <- read.csv(input$EDA_file1$datapath,
                   header = input$EDA_header,
                   sep = input$EDA_sep,
                   quote = input$EDA_quote)
    
    result <- list()
    result$df <- df
    
    return(result)
  })
  
  output$EDA_contents <- renderTable({
    
    tryCatch(
      {
        df <- function_eda_dataset()$df
      },
      error = function(e) {
        # return a safeError if a parsing error occurs
        stop(safeError(e))
      }
    )
    
    if(input$EDA_disp == "head") {
      return(head(df))
    }
    else {
      return(df)
    }
  })
  
  output$EDA_summary <- renderPrint({
    df <- function_eda_dataset()$df
    summary(df)
  })
  
  output$EDA_view <- renderTable({
    head(function_eda_dataset()$df, n = input$EDA_obs)
  })
  
  ## --------------------------------------------------------------------##
  ## Tab3 :: Text Mining ,  prefix - TM_
  function_get_tm_rslt <- eventReactive(input$TM_start_action, {
    url_base <- input$TM_txt_url   # ?¬ë¡¤ë§ ??€?ƒ URL
    all.reviews <- c() 
    withProgress(message = 'crawling...', value = 0, {
      for(page in 1:input$TM_crawling_page_slider){                            ## 300?Ž˜?´ì§€ ê¹Œì?€ë§? ?ˆ˜ì§? (ë³¸ì¸?´ ?‚˜ë¦„ë?€ë¡? ?„¤? •) 
        incProgress(1/input$TM_crawling_page_slider, detail = paste("crawling page : ", page))
        
        url <- paste(url_base, page, sep='')         ## url_base?˜ ?’¤?— ?Ž˜?´ì§€ë¥? 1~n ê¹Œì?€ ?Š˜ë¦¬ë©´?„œ ? ‘ê·?
        htxt <- read_html(url)                       ## html ì½”ë“œ ë¶ˆëŸ¬?˜¤ê¸?
        comments <- html_nodes(htxt, 'div') %>% html_nodes('p')  ## comment ê°€ ?žˆ?Š” ?œ„ì¹? ì°¾ì•„ ?“¤?–´ê°€ê¸? 
        reviews <- html_text(comments)               ## ?‹¤? œ ë¦¬ë·°?˜ text ?ŒŒ?¼ë§? ì¶”ì¶œ
        reviews <- repair_encoding(reviews, from = 'utf-8')  ## ?¸ì½”ë”© ë³€ê²?
        if( length(reviews) == 0 ){ break }          ## ë¦¬ë·°ê°€ ?—†?Š” ?‚´?š©??€ ? œê±?
        reviews <- str_trim(reviews)                 ## ?•ž?’¤ ê³µë°±ë¬¸ìž ? œê±?
        all.reviews <- c(all.reviews, reviews)       #ê²°ê³¼ê°? ??€?ž¥
      }
    })
    
    ## ?°?´?„° ?™•?¸
    # all.reviews
    
    ##ë¶ˆí•„?š” ?‚´?š© ?•„?„°ë§?
    all.reviews <- all.reviews[!str_detect(all.reviews,"?‰? ")]   # ?ˆ˜ì§‘ì— ë¶ˆí•„?š”?•œ ?‹¨?–´ê°€ ?¬?•¨?œ ?‚´?š© ? œê±?, stopWordë¡œë„ ê°€?Š¥
    Encoding(all.reviews)
    options(encoding="utf-8")
    
    ## ëª…ì‚¬/?˜•?š©?‚¬ ì¶”ì¶œ ?•¨?ˆ˜ ?ƒ?„±
    ko.words <- function(doc){
      d <- as.character(doc)
      pos <- paste(SimplePos22(d))   ##SimplePos09
      extracted <- str_match(pos, '([ê°€-?ž£]+)/[NC]')
      keyword <- extracted[,2]
      keyword[!is.na(keyword)]
    }
    
    options(mc.cores=1)    ## ?‹¨?¼ Core ë§? ?™œ?š©?•˜?„ë¡? ë³€ê²? (?˜µ?…˜)
    cps <- Corpus(VectorSource(all.reviews))  
    
    stopWord <- c("?…?Š¤?Š¸", "ë¶„ì„")
    
    tdm <- TermDocumentMatrix(cps,
                              control=list(tokenize=ko.words,    ## token ë¶„ë¥˜?‹œ ?™œ?š©?•  ?•¨?ˆ˜ëª? ì§€? •
                                           removePunctuation=T,  ## êµ¬ë‘?  ? œê±?
                                           stopwords=stopWord,   ## ë¶ˆí•„?š” ?‹¨?–´ ? œê±?
                                           removeNumbers=T,      ## ?ˆ«?ž ? œê±?
                                           wordLengths=c(4, 10), ## ?‹¨?–´ ê¸¸ì´ ì¡°ì •, ?•œê¸€??€ 2?ž
                                           weighting=weightBin   ## ?‹¨?–´ê°€ ?…?Š¤?Š¸?— ì¶œí˜„?•˜ë©? 1, ?•„?‹ˆë©? 0?„ ë°˜í™˜
                              ))  
    
    #ìµœì¢…ê²°ê³¼ ?™•?¸
    dim(tdm)
    tdm.matrix <- as.matrix(tdm)
    Encoding(rownames(tdm.matrix)) <- "UTF-8"
    word.count <- rowSums(tdm.matrix)  ##ê°? ?‹¨?–´ë³? ?•©ê³„ë?? êµ¬í•¨
    word.order <- order(word.count, decreasing=T)  #?‹¤?Œ?œ¼ë¡? ?‹¨?–´?“¤?„ ?“°?¸ ?šŸ?ˆ˜?— ?”°?¼ ?‚´ë¦¼ì°¨?ˆœ?œ¼ë¡? ? •? ¬
    freq.words <- tdm.matrix[word.order[1:20], ] #Term Document Matrix?—?„œ ?žì£? ?“°?¸ ?‹¨?–´ ?ƒ?œ„ 20ê°œì— ?•´?‹¹?•˜?Š” ê²ƒë§Œ ì¶”ì¶œ
    co.matrix <- freq.words %*% t(freq.words)  #?–‰? ¬?˜ ê³±ì…ˆ?„ ?´?š©?•´ Term Document Matrixë¥? Co-occurence Matrixë¡? ë³€ê²?
    
    
    node_df <- data_frame(node=rownames(co.matrix), value=as.numeric(diag(co.matrix))) %>% mutate(idx=row_number()-1)
    link_df <- as_data_frame(as.table(co.matrix)) %>%
      filter(n > 4) %>%
      rename(source=`Terms`, target=`Terms.1`) %>%
      left_join(node_df %>% rename(source_idx=idx) %>% select(-value), by=c('source'='node')) %>%
      left_join(node_df %>% rename(target_idx=idx) %>% select(-value), by=c('target'='node'))
    
    
    
    result <- list()
    result$all.reviews <- all.reviews
    result$co.matrix <- co.matrix
    result$node_df <- node_df
    result$link_df <- link_df
    return(result)
  })
  
  output$TM_tbl_reviews <- DT::renderDataTable({
    
    all.reviews <- function_get_tm_rslt()$all.reviews
    all.reviews <- all.reviews[all.reviews != ""]
    return(as.data.frame(all.reviews))
    
  })
  
  output$TM_qgraph <- renderPlot({
    
    par(family="Apple SD Gothic Neo")   ## mac option
    co.matrix <- function_get_tm_rslt()$co.matrix
    qgraph(co.matrix,
           labels=rownames(co.matrix),   ##label ì¶”ê?€
           diag=F,                       ## ?ž?‹ ?˜ ê´€ê³„ëŠ” ? œê±°í•¨
           layout='spring',              ##?…¸?“œ?“¤?˜ ?œ„ì¹˜ë?? spring?œ¼ë¡? ?—°ê²°ëœ ê²? ì²˜ëŸ¼ ê´€? ¨?´ ê°•í•˜ë©? ê°™ì´ ë¶™ì–´ ?žˆê³? ?—†?œ¼ë©? ë©€ë¦? ?–¨?–´ì§€?„ë¡? ?‘œ?‹œ?¨
           edge.color='blue',
           vsize=log(diag(co.matrix))*2) ## diag?Š” matrix?—?„œ ??€ê°ì„ ë§? ì¶”ì¶œ. ?•´?‹¹ ?‹¨?–´ê°€ ?–¼ë§ˆë‚˜ ?‚˜?™”?Š”ì§€ë¥? ?•Œ ?ˆ˜ ?žˆ?Œ. 
    ## vsize?Š” ?›?˜ ?¬ê¸°ë?? ê²°ì •. ?‹¨?–´?˜ ë¹ˆë„?ˆ˜ë¥? ?¸?žë¡? ?„˜ê¹€. logë¥? ? ?š©?•˜?—¬ ì°¨ì´ë¥? ì¤„ì—¬ì¤?. 
  })
  
  output$TM_nw3d <- renderForceNetwork(
    
    forceNetwork(Links=as.data.frame(function_get_tm_rslt()$link_df), Nodes=as.data.frame(function_get_tm_rslt()$node_df),
                 Source='source_idx', Target='target_idx',
                 NodeID='node', Group='node', Nodesize='value', Value='n',
                 radiusCalculation=JS("Math.sqrt(d.nodesize) * 3"),
                 opacityNoHover=TRUE, linkDistance=100,
                 zoom=TRUE, opacity=0.8, fontSize=15,
                 fontFamily="Apple SD Gothic Neo")
  )
  
  
  ## --------------------------------------------------------------------##
  ## Tab4 :: mers ,  prefix - MRS_ 
  ## source :: https://statkclee.github.io/network/ml-mers-infection.html
  
  function_get_mers_info <- eventReactive(input$MRS_action, { 
    
    
    mers_vert <- read_excel(input$MRS_file$datapath, sheet="?™•ì§„ìž")
    colnames(mers_vert) <-c("?™•ì§„ìž", "?„±ë³?", "?‚˜?´", "?™•ì§„ì¼", "?˜„?ƒ?ƒœ", "?˜„?ƒ?ƒœ_?Œ? •?¼?ž", 
                            "ê°ì—¼ë³‘ì›", "ê°ì—¼ì§€?—­", "ê°ì—¼ ?´?œ ", "ë¹„ê³ ")
    
    mers_edge <- read_excel(input$MRS_file$datapath, sheet="?™•ì§„ìžê°? link")
    
    ## 1.2. ?„¤?Š¸?›Œ?¬ ?°?´?„° ë³€?™˜
    mers_ng <- graph_from_data_frame(d = mers_edge, vertices = mers_vert, directed = TRUE)
    
    
    # 2. ?„¤?Š¸?›Œ?¬ ?°?´?„° ë³€?™˜ ------
    V(mers_ng)$color <- ifelse(V(mers_ng)$¼ºº° == "f", "red", "blue")
    
    # 5. ë³‘ì› ?‹œê°í™” ------
    V(mers_ng)$color <- fct_lump(V(mers_ng)$ê°ì—¼ë³‘ì›, 7)
    
    result <- list()
    result$mers_ng <- mers_ng
    return(result)
  })
  
  output$MERS_graphjs <- renderScatterplotThree({
    mers_ng <- function_get_mers_info()$mers_ng
    graphjs(mers_ng,
            vertex.shape = V(mers_ng)$name,
            vertex.size = 0.1,
            edge.color = 'darkgray',
            main = "¸Þ¸£½º ÀüÆÄ ³×Æ®¿öÅ©"
    )
  })
})