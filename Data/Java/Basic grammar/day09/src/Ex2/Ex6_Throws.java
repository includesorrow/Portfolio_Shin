/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex2;

/**
 *
 * @author KOSTA
 */
public class Ex6_Throws {
    public static void main(String[] args) {
        try{
            execute(0);
            
        }catch (Exception e){
            System.out.println("�츮ȸ�� ǥ����");
        }
    }
    
    //�츮ȸ�� ����Ʈ�� �ڵ� ����
    
    private static void execute(int num) throws ArithmeticException{
        int nums = 10 / num;
        System.out.println("nums : " + nums);
    }
 
           
    
}
