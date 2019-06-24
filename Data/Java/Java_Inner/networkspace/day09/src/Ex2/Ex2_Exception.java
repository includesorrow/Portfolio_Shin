/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KOSTA
 */
public class Ex2_Exception {
    public static void main(String[] args) {
        try{
            //컴파일시 예외는 주로 장치나 외부 드라이버 관련
            //컴파일러가 인지하는 예외이다.
            Thread.sleep(5000);
            System.out.println("Test");
        }
        catch(InterruptedException ex){
            //예외가 발생했을 때 개발자가 확인할 수 있는 메시지
            ex.printStackTrace();
        }
        
        
        
        try {
            //다른방법(쉬운방법)
            //Thread.sleep(5000); 을 입력한 다음에 왼쪽에서 트라이캐치문 떠온다
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Ex2_Exception.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
          
    
}
