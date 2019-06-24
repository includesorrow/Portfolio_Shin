package rjava01;
import org.rosuda.REngine.REXP;
import org.rosuda.REngine.REXPMismatchException;
	import org.rosuda.REngine.Rserve.RConnection;
	import org.rosuda.REngine.Rserve.RserveException;
	
public class test {
	static public void main(String args[]) throws RserveException, REXPMismatchException {

	    RConnection c = new RConnection();
	    REXP x = c.eval("1+2");
	    System.out.print(x.asString());	
	
		try {
			
			  c.eval("library(shiny)");
			  c.eval("library(ggplot2)");
			  c.eval("ui <- fluidPage(\r\n" + 
			  		"    sliderInput(\"obs\", \"No. of Random Numbers\", min = 30, max = 100, value = 50),\r\n" + 
			  		"    plotOutput(\"myPlot\")\r\n" + 
			  		")");
	        
	           // data reading        
				System.out.println("¼º°ø");
	   		
	           
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			c.close();
		}
	

	}

}

