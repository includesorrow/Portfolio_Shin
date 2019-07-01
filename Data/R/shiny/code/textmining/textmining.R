library(nnet)
#install.packages(c('rvest','httr','KoNLP','stringr','tm','qgraph','xml2','dplyr','networkD3'))
library(rvest)
library(httr)
library(KoNLP)
library(stringr)
library(tm)
library(qgraph)
library('xml2')
library(dplyr)
library(networkD3)

#par(family="Apple SD Gothic Neo")   ## for mac

url_base <- 'https://movie.daum.net/moviedb/grade?movieId=99611&type=netizen&page='   # Å©·Ñ¸µ ´ë»ó URL
all.reviews <- c() 

for(page in 1:300){                            ## 300ÆäÀÌÁö ±îÁö¸¸ ¼öÁý (º»ÀÎÀÌ ³ª¸§´ë·Î ¼³Á¤) 
  url <- paste(url_base, page, sep='')         ## url_baseÀÇ µÚ¿¡ ÆäÀÌÁö¸¦ 1~n ±îÁö ´Ã¸®¸é¼­ Á¢±Ù
  htxt <- read_html(url)                       ## html ÄÚµå ºÒ·¯¿À±â
  comments <- html_nodes(htxt, 'div') %>% html_nodes('p')  ## comment °¡ ÀÖ´Â À§Ä¡ Ã£¾Æ µé¾î°¡±â 
  reviews <- html_text(comments)               ## ½ÇÁ¦ ¸®ºäÀÇ text ÆÄÀÏ¸¸ ÃßÃâ
  reviews <- repair_encoding(reviews, from = 'utf-8')  ## ÀÎÄÚµù º¯°æ
  if( length(reviews) == 0 ){ break }          ## ¸®ºä°¡ ¾ø´Â ³»¿ëÀº Á¦°Å
  reviews <- str_trim(reviews)                 ## ¾ÕµÚ °ø¹é¹®ÀÚ Á¦°Å
  all.reviews <- c(all.reviews, reviews)       #°á°ú°ª ÀúÀå
}

## µ¥ÀÌÅÍ È®ÀÎ
all.reviews

##ºÒÇÊ¿ä ³»¿ë ÇÊÅÍ¸µ
all.reviews <- all.reviews[!str_detect(all.reviews,"ÆòÁ¡")]   # ¼öÁý¿¡ ºÒÇÊ¿äÇÑ ´Ü¾î°¡ Æ÷ÇÔµÈ ³»¿ë Á¦°Å, stopWord·Îµµ °¡´É
Encoding(all.reviews)
options(encoding="utf-8")

## ¸í»ç/Çü¿ë»ç ÃßÃâ ÇÔ¼ö »ý¼º
ko.words <- function(doc){
  d <- as.character(doc)
  pos <- paste(SimplePos22(d))   ##SimplePos09
  extracted <- str_match(pos, '([°¡-ÆR]+)/[NC]')
  keyword <- extracted[,2]
  keyword[!is.na(keyword)]
}

options(mc.cores=1)    ## ´ÜÀÏ Core ¸¸ È°¿ëÇÏµµ·Ï º¯°æ (¿É¼Ç)
cps <- Corpus(VectorSource(all.reviews))  

stopWord <- c("ÅØ½ºÆ®", "ºÐ¼®")

tdm <- TermDocumentMatrix(cps,
                          control=list(tokenize=ko.words,    ## token ºÐ·ù½Ã È°¿ëÇÒ ÇÔ¼ö¸í ÁöÁ¤
                                       removePunctuation=T,  ## ±¸µÎÁ¡ Á¦°Å
                                       stopwords=stopWord,   ## ºÒÇÊ¿ä ´Ü¾î Á¦°Å
                                       removeNumbers=T,      ## ¼ýÀÚ Á¦°Å
                                       wordLengths=c(4, 10), ## ´Ü¾î ±æÀÌ Á¶Á¤, ÇÑ±ÛÀº 2ÀÚ
                                       weighting=weightBin   ## ´Ü¾î°¡ ÅØ½ºÆ®¿¡ ÃâÇöÇÏ¸é 1, ¾Æ´Ï¸é 0À» ¹ÝÈ¯
                          ))  

#ÃÖÁ¾°á°ú È®ÀÎ
dim(tdm)
tdm.matrix <- as.matrix(tdm)
Encoding(rownames(tdm.matrix)) <- "UTF-8"
word.count <- rowSums(tdm.matrix)  ##°¢ ´Ü¾îº° ÇÕ°è¸¦ ±¸ÇÔ
word.order <- order(word.count, decreasing=T)  #´ÙÀ½À¸·Î ´Ü¾îµéÀ» ¾²ÀÎ È½¼ö¿¡ µû¶ó ³»¸²Â÷¼øÀ¸·Î Á¤·Ä
freq.words <- tdm.matrix[word.order[1:20], ] #Term Document Matrix¿¡¼­ ÀÚÁÖ ¾²ÀÎ ´Ü¾î »óÀ§ 20°³¿¡ ÇØ´çÇÏ´Â °Í¸¸ ÃßÃâ
co.matrix <- freq.words %*% t(freq.words)  #Çà·ÄÀÇ °ö¼ÀÀ» ÀÌ¿ëÇØ Term Document Matrix¸¦ Co-occurence Matrix·Î º¯°æ

## 1. qgraph ½Ã°¢È­
qgraph(co.matrix,
       labels=rownames(co.matrix),   ##label Ãß°¡
       diag=F,                       ## ÀÚ½ÅÀÇ °ü°è´Â Á¦°ÅÇÔ
       layout='spring',              ##³ëµåµéÀÇ À§Ä¡¸¦ springÀ¸·Î ¿¬°áµÈ °Í Ã³·³ °ü·ÃÀÌ °­ÇÏ¸é °°ÀÌ ºÙ¾î ÀÖ°í ¾øÀ¸¸é ¸Ö¸® ¶³¾îÁöµµ·Ï Ç¥½ÃµÊ
       edge.color='blue',
       vsize=log(diag(co.matrix))*2) ## diag´Â matrix¿¡¼­ ´ë°¢¼±¸¸ ÃßÃâ. ÇØ´ç ´Ü¾î°¡ ¾ó¸¶³ª ³ª¿Ô´ÂÁö¸¦ ¾Ë ¼ö ÀÖÀ½. 
## vsize´Â ¿øÀÇ Å©±â¸¦ °áÁ¤. ´Ü¾îÀÇ ºóµµ¼ö¸¦ ÀÎÀÚ·Î ³Ñ±è. log¸¦ Àû¿ëÇÏ¿© Â÷ÀÌ¸¦ ÁÙ¿©ÁÜ. 


## 2. networkD3 ½Ã°¢È­, ÃâÃ³ : https://junhewk.github.io/text/2017/08/08/cooccurence-matrix-with-Naver-blog/
node_df <- data_frame(node=rownames(co.matrix), value=as.numeric(diag(co.matrix))) %>%
  mutate(idx=row_number()-1)
link_df <- as_data_frame(as.table(co.matrix)) %>%
  filter(n > 4) %>%
  rename(source=`Terms`, target=`Terms.1`) %>%
  left_join(node_df %>% rename(source_idx=idx) %>% select(-value), by=c('source'='node')) %>%
  left_join(node_df %>% rename(target_idx=idx) %>% select(-value), by=c('target'='node'))

forceNetwork(Links=as.data.frame(link_df), Nodes=as.data.frame(node_df),
             Source='source_idx', Target='target_idx',
             NodeID='node', Group='node')

forceNetwork(Links=as.data.frame(link_df), Nodes=as.data.frame(node_df),
             Source='source_idx', Target='target_idx',
             NodeID='node', Group='node', Nodesize='value', Value='n',
             radiusCalculation=JS("Math.sqrt(d.nodesize) * 3"),
             opacityNoHover=TRUE, linkDistance=100,
             zoom=TRUE, opacity=0.8, fontSize=15,
             fontFamily="Apple SD Gothic Neo")
