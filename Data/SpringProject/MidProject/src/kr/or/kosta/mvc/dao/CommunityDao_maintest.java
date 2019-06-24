package kr.or.kosta.mvc.dao;

import org.rosuda.REngine.REXP;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;

import kr.or.kosta.dto.InserttagVO;

public class CommunityDao_maintest {
		
	public static int[] countlist;
	public static int[] meanlist;
	public static double[] moviemeanlist;
	//영화별 평균 리스트
	
	
	public static void main(String[] args) {
		
	
        /*
         * 한번만 로드해야 할 목록  a
         */
		
			try {
				System.out.println("연결시작");
			RConnection connection =  null;
            
            
            
        	connection = new RConnection();
        	//R과 스프링 연결
        	connection.eval("library(caret)");
        	connection.eval("library(readxl)");
        	connection.eval("library(dplyr)");
        	//R에서 라이브러리 호출
        	
        	connection.parseAndEval("amazon2<-read_xlsx('C:/RTest/amazon.xlsx')");
        	//엑셀파일 불러오기
        	connection.eval("amazon2 <- amazon2[,-1]");
        	
        	connection.eval("amazonkmeans <- kmeans(amazon2, centers=10, iter.max=10000)");
        	//k_means 알고리즘 적용
        	connection.eval("amazonkmeans$cluster");
        	//데이터리스트 받아오기
        	connection.eval("kmeanscenters<-amazonkmeans$centers");
        	//kmeanscenters로 재정의
        	
        	
        	
        	
        	
        	countlist = connection.eval("amazonkmeans$cluster").asIntegers();
//        	System.out.println(countlist[1]);
//        	        	for(int i=0; i<=33; i++) {
//        	System.out.println(countlist[i]);
//        	
//        	        	}
        	
        	
        	
        	/*
        	 * 영화 평균

        	 */
//        	System.out.println("asdf");
//        	for(int i = 1; i <= 33; i++) {
//        		System.out.println(i);
//        		moviemeanlist[i] = connection.eval("mean(amazonkmeans$centers[,"+i+"])").asDouble();
//        	     System.out.println(moviemeanlist[i]);
//        	}
        	
        	connection.eval("for(i in 1:34){ a[i] <- mean(amazonkmeans$centers[,i])}");
        	moviemeanlist = connection.eval("a").asDoubles();
        	
        	
        	
        	for(int i=1; i<=34; i++) {
        	System.out.println(moviemeanlist[i]);
        	
        			System.out.println("-----");
        	}
        	
        	
        	
        	System.out.println("---");
System.out.println(meanlist[3]);  
        	




			


////---------------------------------------------
//
//		connection.eval("amazon2df <- as.data.frame(amazon2)");
//		connection.eval();
//		connection.eval();
//		connection.eval();
//		connection.eval();
//		

//----------------------------------------------




        	        	
        	        	
        	        	
        	        	
        	        	
        	        	
        	        	
        	        	connection.close();
        	System.out.println("엔딩");
    		
			}catch(Exception e) {
				e.getStackTrace();
			}
		
//			return RCommunitylist;
			
		
       
			
}
}

        


 


