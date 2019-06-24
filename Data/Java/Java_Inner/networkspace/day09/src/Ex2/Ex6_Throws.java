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
            System.out.println("우리회사 표현식");
        }
    }
    
    //우리회사 바이트만 코드 제공
    
    private static void execute(int num) throws ArithmeticException{
        int nums = 10 / num;
        System.out.println("nums : " + nums);
    }
 
           
    
}
