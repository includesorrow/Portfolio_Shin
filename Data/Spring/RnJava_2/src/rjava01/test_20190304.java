package rjava01;
import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.rosuda.REngine.REXP;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.REngineException;
import org.rosuda.REngine.RFactor;
import org.rosuda.REngine.RList;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;

public class test_20190304 {

	
	public static void main(String[] args){

        
        RConnection connection = null;
        String hochul = "ko.words <- function(doc){ d <- as.character(doc) \r\n pos <- paste(SimplePos22(d)) \r\n  extracted <- str_match(pos, '([가-힣]+)/[NC]') \r\n  keyword <- extracted[,2] \r\n keyword[!is.na(keyword)]}";
        String query = "query <- (" + "select usedwords_contents as x from review_usedwords where movie_number='20129370'" + ")";
        String queryconetent = "select used";
        String test="Encoding(rownames(tdm.matrix)) <- "+'"'+"UTF-8"+'"';
        /*
         * 한번만 로드해야 할 목록
         */
        try {
        	connection = new RConnection();
        	connection.eval("library(rJava)");
        	connection.eval("library(DBI)");
        	connection.eval("library(RJDBC)");
        	connection.eval("library(rvest)");
        	connection.eval("library(httr)");
        	connection.eval("library(KoNLP)");
        	connection.eval("library(stringr)");
        	connection.eval("library(tm)");
        	connection.eval("library(qgraph)");
        	connection.eval("library(dplyr)");
        	connection.eval("library(xml2)");
        	// 라이브러리 호출
        	
        	
        	connection.eval("connect.db <- list(data.frame(dbname=c('DB1', 'DB2'), host=c('localhost', '172.188.1.2'),port=c(1521, 9999), sid=c('xe', 'ddbb'), username=c('midproject', 'BDUSER'), password=c('midproject', 'PPWW'),stringsAsFactors=FALSE))");
        	connection.eval("connect.db$connect.to <- 1");
        	connection.eval("options(java.parameters='-Xmx32g')");
        	connection.eval("connect.drv <- JDBC('oracle.jdbc.driver.OracleDriver', 'C:/bigdata/KOSTA/KOSTA/Oracle/File/lib/ojdbc6.jar')");
        	connection.eval("connect.info <- dbConnect(connect.drv, paste('jdbc:oracle:thin:@', connect.db[[1]]$host[connect.db$connect.to], ':', connect.db[[1]]$port[connect.db$connect.to], ':', connect.db[[1]]$sid[connect.db$connect.to], sep=''), connect.db[[1]]$username[connect.db$connect.to], connect.db[[1]]$password[connect.db$connect.to])");
        	// R  <-> DB 연동
        	
        	connection.eval("gc(verbose=TRUE)");
        	//메모리 가비지 컬렉션
        	
        	
        	
        	
        	
        	
        /*
         * 한번만 로드해야 할 목록 끝
         */
        	
        	connection.eval("query <- (\"select usedwords_contents as x from review_usedwords where movie_number='20129370'\")");
        	connection.eval("result <- dbGetQuery(connect.info,query)");	
        	
        	
        	
        	
//        	connection.eval(hochul);
        	// 명사 / 형용사 추출 함수 생성
        	connection.eval("tdm <- TermDocumentMatrix(cps, control=list(tokenize=ko.words, removePunctuation=T,  stopwords=stopWord, removeNumbers=T,  wordLengths=c(4, 10), weighting=weightBin   )) ");
        	
        	connection.eval("cps <- Corpus(VectorSource(result[[\"X\"]]))  ");
        	//cps에 벡터소스 생성
        	connection.eval("dim(tdm)");
        	connection.eval("tdm.matrix <- as.matrix(tdm)");
        	
        	connection.eval("Encoding(rownames(tdm.matrix)) <- 'UTF-8'");
        	connection.eval("word.count <- rowSums(tdm.matrix) ");
        	connection.eval("word.order <- order(word.count, decreasing=T)");
        	connection.eval("freq.words <- tdm.matrix[word.order[1:20], ]");
        	connection.eval("co.matrix <- freq.words %*% t(freq.words)");
        	connection.eval("wordcounttest <- sort(word.count,decreasing = TRUE)");

        	/*
        	 *   ## token 분류시 활용할 함수명 지정
        	 *   ## 구두점 제거
        	 *   ## 불필요 단어 제거	
        	 *   ## 숫자 제거
        	 *   ## 단어 길이 조정, 한글은 2자
        	 *   ## 단어가 텍스트에 출현하면 1, 아니면 0을 반환
        	 */
        	
        	
        	connection.eval("wordlist <- as.list(wordcounttest)");
        	connection.eval("nameslist <- names(wordlist)");
        	
        	
        	
        	int namelistlength = connection.eval("length(nameslist)").asInteger();
        	int taglistlength = connection.eval("length(wordcounttest)").asInteger();
        	//개수 세주기
        	
        	String[] namelist = connection.eval("nameslist").asStrings();
        	
        	System.out.println(namelist[1]);
        	
        	
//        	for(int i=0; i<namelistlength; i++) {
//        	System.out.println(namelist[i]);	
//        	}
//        	//태그 목록 출력
        	
        	int[] countlist = connection.eval("wordcounttest").asIntegers();
        	System.out.println(countlist[1]+"asdfasdf");
        	for(int i=0;i<taglistlength; i++) {
        		System.out.println(countlist[i]);
        	}
        	
        	
        	
        	
//        	System.out.println("zzzz" + zzzzz);
//        	System.out.println(zzzzz[2]);
        	
        	
//        	List list = new List();
//        	Map<String,Integer> map = new HashMap<String,Integer>();
         	
//        	 connection.eval("wc");
			
//        	 System.out.println("zx" + zx);
//        	
//        	 REXP asdf = connection.eval("wc");
        	 
//        	 RList ffff = connection.eval("wc").asList();
//        	 System.out.println("ffff"+ffff);
        	
////        	System.out.println("string 출력" + tdestlist);
//        
//        	String[] l = connection.eval("zxcv").asStrings();

        	
//        	
//        	
//        	
//        	String [][] s = new String[cols][];
//        	
//        	for (int i = 0; i < cols; i++) {
//        		s[i] = l.at(i).asStrings();
//        	}
//        	for(int i = 0; i < cols; i++) {
//        		for ( int j = 0; j < rows; j++) {
//        			System.out.println(s[i][j]);
//        		}
//        	}
//        	
//        	
        	
        	
        	
        	
        	
        	
        	
        	/*
        	 *   RList l = c.eval("{d=data.frame(\"TestData\",c(11:20));

lapply(d,as.character)}").asList();

               int cols = l.size();

               int rows = l.at(0).length();

 

               String[][] s = new String[cols][];

 

               for (int i = 0; i < cols; i++) {

                       s[i] = l.at(i).asStrings();

               }

              

               for (int i = 0; i < cols; i++) {

                       for (int j = 0; j < rows; j++) {

                              System.out.println(s[i][j]);

                       }
        	 */
        	
        	
        	
        	
        	
        	
        }catch (RserveException e) {
            e.printStackTrace();
        } catch (REngineException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (REXPMismatchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
//        catch (REXPMismatchException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
//        catch (REXPMismatchException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
//        catch (REXPMismatchException e) {
//            e.printStackTrace();
//        } 
        finally {
            connection.close();
        }
       
        
        
        try {
 
            connection = new RConnection();
 
            String vector = "c(1,2,3,4)";
            connection.eval("meanVal=mean(" + vector + ")");
            double mean = connection.eval("meanVal").asDouble();
            System.out.println("The mean of given vector is=" + mean);
            connection.eval("aa <- '출력'");
            System.out.println(connection.eval("aa").asString());
 
            connection.close();
        } catch (RserveException e) {
            e.printStackTrace();
        } catch (REXPMismatchException e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
 
	}
}
