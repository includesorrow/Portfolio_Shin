/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex2;


/**
 *
 * @author KOSTA
 * throws는 예외를 호출한 쪽으로 위임함.
 */
public class Ex5_Throws {
    public static void main(String[] args) {
        
    
        try {
            execute();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
    public static void execute() throws InterruptedException{
        Thread.sleep(1000);
        System.out.println("실행!");
    }
}
