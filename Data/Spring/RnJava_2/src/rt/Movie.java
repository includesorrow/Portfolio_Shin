package rt;

import org.rosuda.REngine.REXP;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;

public class Movie {
public REXP x = null;
public RConnection r = null;
public String str = "";
public Movie(){
try{
r = new RConnection(); // R ����. �ƱԸ�Ʈ�� �ƹ��͵� ������ ���÷� ����
}
catch(RserveException e){
e.printStackTrace();
}
}
public byte[] getImage() throws RserveException, REXPMismatchException{
// R���� �м� �� �̹��� ��û
x = r.eval("try(jpeg('test.jpg', quality=100))");
r.eval("source('C:/rstudioproj/r1/analysis.R')");
r.eval("mvchart(1)");
r.eval("graphics.off()");
x = r.eval("r=readBin('test.jpg','raw',1024*1024);unlink('test.jpg');r");
r.close();
return x.asBytes();
}
}