/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex2;


/**
 *
 * @author KOSTA
 * throws�� ���ܸ� ȣ���� ������ ������.
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
        System.out.println("����!");
    }
}
