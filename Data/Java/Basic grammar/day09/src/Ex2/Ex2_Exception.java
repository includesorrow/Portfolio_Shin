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
            //�����Ͻ� ���ܴ� �ַ� ��ġ�� �ܺ� ����̹� ����
            //�����Ϸ��� �����ϴ� �����̴�.
            Thread.sleep(5000);
            System.out.println("Test");
        }
        catch(InterruptedException ex){
            //���ܰ� �߻����� �� �����ڰ� Ȯ���� �� �ִ� �޽���
            ex.printStackTrace();
        }
        
        
        
        try {
            //�ٸ����(������)
            //Thread.sleep(5000); �� �Է��� ������ ���ʿ��� Ʈ����ĳġ�� ���´�
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Ex2_Exception.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
          
    
}
