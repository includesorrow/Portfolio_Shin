/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummy;

/**
 *
 * @author KOSTA
 */
public class dummy {
     public static boolean getRandomBoolean() {
    return Math.random() < 0.5;
    //I tried another approaches here, still the same result

     }

   public static void main(String[] args) {
   System.out.println(getRandomBoolean());  
   int n = (int) (Math.random() * 2) + 1;
       System.out.println(n);
   }
}
