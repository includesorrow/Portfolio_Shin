package r;



import org.rosuda.REngine.Rserve.RConnection;
//import twitter4j

public class RJavaMain {

//   private static Logger log=Logger.getLogger(RJavaMain.class); 

 public static void main(String[] args)throws Exception {

   RConnection rc=new RConnection();

    //명령문 전송

   rc.voidEval("data<-read.table(\"/home/sist/data.txt\")");
   rc.voidEval("jpeg(\"/home/sist/movie2.jpg\")");//png,jpeg.tiff
   rc.voidEval("par(mfrow=c(1,2))");//1행이열 
   rc.voidEval("barplot(data$V2,names.arg=data$V1,col=rainbow(7))");
   rc.voidEval("pie(data$V2, labels= data$V1,col=rainbow(9))");
   rc.voidEval("dev.off()");//Java에서만 사용
   rc.close();
//   log.debug("완료!");
 }
}