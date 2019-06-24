package kr.or.kosta.mvc.controller;

import org.rosuda.JRI.REXP;
import org.rosuda.JRI.Rengine;
 
public class Plotting {
    
    public String plot() throws Exception{
        
        Rengine rengine = new Rengine(new String[] {"--vanilla"}, false,null);
        
        //rengine.eval("install.packages(\"base64enc\")");
        REXP loaded = rengine.eval("library(base64enc)");
        if(loaded==null) throw new Exception("���̺귯�� �ε� �Ұ�");
        
        rengine.eval("png(\"C:/Users/KOSTA/Desktop/temp.png\")");    
        rengine.eval("plot(rnorm(100))");    
        rengine.eval("dev.off()");
        rengine.eval("encoded_png<-sprintf(\"<img src='data:image/png;base64,%s'/>\", base64encode(\"C:/Users/KOSTA/Desktop/temp.png\"))");
        
        REXP image = rengine.eval("encoded_png");    
        rengine.end();
        
        return image.asString();
    }
    
}