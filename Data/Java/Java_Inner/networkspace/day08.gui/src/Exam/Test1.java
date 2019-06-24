/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam;

/**
 *
 * @author KOSTA
 */
public class Test1 {
    Test2 t2 = new Test2();
    
    double randomValue = Math.random();
    int intValue = (int)(randomValue * 10)%(t2.getII());
    
          
    
    public static void main(String[] args) {
        
    }
}
