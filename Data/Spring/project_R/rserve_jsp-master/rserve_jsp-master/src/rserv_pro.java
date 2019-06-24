import org.rosuda.REngine.REXP;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;

/**
 * Created by parkjihyoung on 15. 5. 24..
 */
public class rserv_pro {

    static public void main(String args[]) throws RserveException, REXPMismatchException {

        RConnection c = new RConnection();
        REXP x = c.eval("1+2");
        System.out.print(x.asString());

    }
}
