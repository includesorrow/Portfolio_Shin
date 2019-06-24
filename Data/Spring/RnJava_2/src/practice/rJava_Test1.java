package practice;

import org.rosuda.REngine.REXP;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.REngineException;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;

public class rJava_Test1 {
	
	

	public static void main(String[] args) throws REngineException, REXPMismatchException {
		System.out.println("테스트시작");
		
		RConnection r = null;
		REXP x = null;
		String retStr = "";
		
		try {
			System.out.println("connection 시작");
			r = new RConnection();
			System.out.println("connection 성공");
			r.parseAndEval("x<-1");
			r.parseAndEval("y<-2");
			r.parseAndEval("z<-x+y");
			x = r.parseAndEval("z");
			System.out.println(x);
			System.out.println("성공");
		} catch (RserveException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
