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
	//��ȭ�� ��� ����Ʈ
	
	
	public static void main(String[] args) {
		
	
        /*
         * �ѹ��� �ε��ؾ� �� ���  a
         */
		
			try {
				System.out.println("�������");
			RConnection connection =  null;
            
            
            
        	connection = new RConnection();
        	//R�� ������ ����
        	connection.eval("library(caret)");
        	connection.eval("library(readxl)");
        	connection.eval("library(dplyr)");
        	//R���� ���̺귯�� ȣ��
        	
        	connection.parseAndEval("amazon2<-read_xlsx('C:/RTest/amazon.xlsx')");
        	//�������� �ҷ�����
        	connection.eval("amazon2 <- amazon2[,-1]");
        	
        	connection.eval("amazonkmeans <- kmeans(amazon2, centers=10, iter.max=10000)");
        	//k_means �˰��� ����
        	connection.eval("amazonkmeans$cluster");
        	//�����͸���Ʈ �޾ƿ���
        	connection.eval("kmeanscenters<-amazonkmeans$centers");
        	//kmeanscenters�� ������
        	
        	
        	
        	
        	
        	countlist = connection.eval("amazonkmeans$cluster").asIntegers();
//        	System.out.println(countlist[1]);
//        	        	for(int i=0; i<=33; i++) {
//        	System.out.println(countlist[i]);
//        	
//        	        	}
        	
        	
        	
        	/*
        	 * ��ȭ ���

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
        	System.out.println("����");
    		
			}catch(Exception e) {
				e.getStackTrace();
			}
		
//			return RCommunitylist;
			
		
       
			
}
}

        


 


