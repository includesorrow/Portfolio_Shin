install.packages("rJava")
install.packages("DBI")
install.packages("RJDBC")

library(rJava)
library(DBI)
library(RJDBC) 


library(rvest)
library(httr)
library(KoNLP)
library(stringr)
library(tm)
library(qgraph)
library(dplyr)
library(networkD3)
library(xml2)
library(xlsx)
library(ROracle)


library(Rserve)
Rserve()


########################
# Database information #
########################

connect.db <- list(data.frame(dbname=c('DB1', 'DB2'), host=c('localhost', '172.188.1.2'),port=c(1521, 9999), sid=c('xe', 'ddbb'), username=c('midproject', 'BDUSER'), password=c('midproject', 'PPWW'),stringsAsFactors=FALSE))
connect.db$connect.to <- 1 # 접속할 DB/username의 row number를 지정





#####################
#######################################################
# RJDBC connection # 한글 encoding 문제 발생하지 않음 #
#######################################################

library(DBI)
library(rJava)
library(RJDBC)
options(java.parameters='-Xmx32g') # rJava의 memory limit default를 512MB->32GB로 확장
connect.drv <- JDBC('oracle.jdbc.driver.OracleDriver', 'C:/bigdata/KOSTA/KOSTA/Oracle/File/lib/ojdbc6.jar') # jdbc 경로
connect.info <- dbConnect(connect.drv, paste('jdbc:oracle:thin:@', connect.db[[1]]$host[connect.db$connect.to], ':', connect.db[[1]]$port[connect.db$connect.to], ':', connect.db[[1]]$sid[connect.db$connect.to], sep=''), connect.db[[1]]$username[connect.db$connect.to], connect.db[[1]]$password[connect.db$connect.to])
# 주의: 쿼리 맨 끝의 세미콜론(;)은 삭제할 것
query.data <- dbGetQuery(connect.info, "SELECT * FROM movie")
#dbDisconnect(connect.info) # DB 접속 종료
head(query.data, n=5)
format(object.size(query.data), units='auto')
gc(verbose=TRUE) # 메모리 Garbage Collection (큰 object 삭제 후 실행하면 메모리를 OS에 돌려주는 역할을 함)
####################








# #all.result <- c()
query <- ("select usedwords_contents as x from review_usedwords where movie_number='20129370'")
result <- dbGetQuery(connect.info,query)
# #all.result <- c(all.result,result)
# 
# #all.result
# result <- as.character(result())
# result
# 
# 
# 
# 
# result <- as.character(result)
# all.result <- as.character(result)
# #all.result <- c(all.result,result)
# summary(all.reviews)
# summary(all.result)
# class(all.reviews)
# class(all.result)
# #write.csv(result,file='C:/dummy/Movie/csv/Tag_EUC-KR_ASDFASDF.csv',fileEncoding = "EUC-KR")


## 명사/형용사 추출 함수 생성
ko.words <- function(doc){
  d <- as.character(doc)
  pos <- paste(SimplePos22(d))
  extracted <- str_match(pos, '([가-힣]+)/[NC]')
  keyword <- extracted[,2]
  keyword[!is.na(keyword)]}



options(mc.cores=1)    ## 단일 Core 만 활용하도록 변경 (옵션)
cps <- Corpus(VectorSource(result[["X"]]))  


tdm <- TermDocumentMatrix(cps,
                          control=list(tokenize=ko.words,    ## token 분류시 활용할 함수명 지정
                                       removePunctuation=T,  ## 구두점 제거
                                       stopwords=stopWord,   ## 불필요 단어 제거
                                       removeNumbers=T,      ## 숫자 제거
                                       wordLengths=c(4, 10), ## 단어 길이 조정, 한글은 2자
                                       weighting=weightBin   ## 단어가 텍스트에 출현하면 1, 아니면 0을 반환
                          ))  


#reviews <- str_trim(reviews)                 ## 앞뒤 공백문자 제거
#all.reviews <- c(all.reviews, reviews)       #결과값 저장


# 
# stopWord <- c("텍스트","분석")
# stopword  


#최종결과 확인
dim(tdm)
tdm.matrix <- as.matrix(tdm)
Encoding(rownames(tdm.matrix)) <- 'UTF-8'
word.count <- rowSums(tdm.matrix)  ##각 단어별 합계를 구함
word.order <- order(word.count, decreasing=T)  #다음으로 단어들을 쓰인 횟수에 따라 내림차순으로 정렬
freq.words <- tdm.matrix[word.order[1:20], ] #Term Document Matrix에서 자주 쓰인 단어 상위 20개에 해당하는 것만 추출
co.matrix <- freq.words %*% t(freq.words)  #행렬의 곱셈을 이용해 Term Document Matrix를 Co-occurence Matrix로 변경

word.count

wordcounttest <- sort(word.count,decreasing = TRUE)

wordcounttest



wordlist <- as.list(wordcounttest)


wordlist10 <- head(wordlist, n=10)

wordlist10

nameslist <- names(wordlist)
nameslist10 <- head(nameslist,n=10)

nameslist10[0:1]


insertquery <- ("insert into price valeus(10,10000)")
result <- dbGetQuery(connect.info,insertquery)














nameslist


nameslist <- names(wordlist)
length(nameslist)
wordlist




class(word.count)

wordcounttest[0]

wordcounttest

length(wordcounttest)

class(wordcounttest)

matrixtest <- as.data.frame.list(wordcounttest)

matrixtest






write.csv(warray,file='C:/dummy/Movie/csv/Tag_EUC-SFDAKR_GOGOGSOGSDOFSOssdfasfdF.csv',fileEncoding = "EUC-KR")

write.csv(wordcounttest,file='C:/dummy/Movie/csv/Tag_EUC-SFDAKR_GOGOGSOGSDOFSOsdfF.csv',fileEncoding = "EUC-KR")

## 1. qgraph 시각화
qgraph(co.matrix,
       labels=rownames(co.matrix),   ##label 추가
       diag=F,                       ## 자신의 관계는 제거함
       layout='spring',              ##노드들의 위치를 spring으로 연결된 것 처럼 관련이 강하면 같이 붙어 있고 없으면 멀리 떨어지도록 표시됨
       edge.color='blue',
       vsize=log(diag(co.matrix))*2) ## diag는 matrix에서 대각선만 추출. 해당 단어가 얼마나 나왔는지를 알 수 있음. 
## vsize는 원의 크기를 결정. 단어의 빈도수를 인자로 넘김. log를 적용하여 차이를 줄여줌. 






write.csv(word.count,file='C:/dummy/Movie/csv/Tag_EUC-KR_GOGOGSOGSDOFSOF.csv',fileEncoding = "EUC-KR")

write.xlsx(word.count,file='c:/dummy/Movie/xlsx/Tag_test1.xlsx')



aaa <- c(10,1000)
aaa <- as.data.frame(aaa)
aaa<- as.list(aaa)

insertinto<- sqlAppendTable(connect.info,price,aaa,FALSE)
insertinto
insertresult <- dbGetQuery(connect.info,insertinto)

pasteinto <-("insert into active_check(active_check_number) values(10)")
dbSendQuery(connect.info,pasteinto)



inserttag1 <- ("insert into tag_table(tag_category_num,tag_table_num,tag_name,active_Check_number) values(4,'Re0001',nameslist10[0:1]")
asdf <- ("insert into tag_table (tag_category_num,tag_table_num,tag_name,active_check_number) values(4,'re0001','nameslist10[0:1]',1")

nameslist10[0:1]

dbSendQuery(connect.info,asdf)
query <- ("select usedwords_contents as x from review_usedwords where movie_number='20129370'")



ora <- Oracle()




result.data = data.frame(tag_category_num = c(4,4,4,4,4,4,4,4,4,4), tag_table_num=c('Re000001','Re000002','Re000003','Re000004','Re000005','Re000006','Re000007','Re000008','Re000009','Re000010'),tag_name = c(nameslist10[1],nameslist10[2],nameslist10[3],nameslist10[4],nameslist10[5],nameslist10[6],nameslist10[7],nameslist10[8],nameslist10[9],nameslist10[10]), active_check_number=c(1,1,1,1,1,1,1,1,1,1))


my.data

result.data

#my.data = data.frame(empno = c(8001, 8002), ename = c('MUKHIN', 'ABOYOUN'))
#more.data = data.frame(empno = c(8003), ename = c('JAMES'))


rs <- dbSendQuery(con, "insert into foo (empno, ename) values (:1, :2)",
          data = my.data)

insertquery <- dbWriteTable(connect.info,"insert into tag_table (tag_category_num,tag_table_num,tag_name,active_check_number) values (:1, :2,:3)", data = result.data)
dbSendquery(connect.info,insertquery)
  
dbWriteTable(connect.info,"tag_table",result.data)


rs <- dbSendQuery(connect.info,"insert into tag_table (tag_category_num, tag_table_num, tag_name, active_check_number) values(:1,:2,:3,:4,:5,:6,:7,:8,:9,:10)",data = result.data )      

                  
                  result.data[0:2]










summary(connect.info)
connect.info


                      
                      
  dbWriteTable()