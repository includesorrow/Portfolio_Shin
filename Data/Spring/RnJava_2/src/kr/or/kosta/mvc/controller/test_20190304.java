package kr.or.kosta.mvc.controller;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;

public class test_20190304 {

	
	public static void main(String[] args) {

        
        RConnection connection = null;
        
        try {
 
            connection = new RConnection();
 
            String vector = "c(1,2,3,4)";
            connection.eval("meanVal=mean(" + vector + ")");
            double mean = connection.eval("meanVal").asDouble();
            System.out.println("The mean of given vector is=" + mean);
            connection.eval("aa <- '�ѱ�'");
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
