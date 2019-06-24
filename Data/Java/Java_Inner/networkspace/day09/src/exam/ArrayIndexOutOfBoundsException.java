/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

/**
 *
 * @author KOSTA
 */
public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        String data1 = args[0];
        String data2 = args[1];
        
        System.out.println("args[0]"+args[0]);
        System.out.println("args[1]"+args[1]);
        if(args.length == 2){
            data1 = args[0];
        }
    }
}
