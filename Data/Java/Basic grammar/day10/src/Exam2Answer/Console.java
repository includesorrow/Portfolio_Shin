/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam2Answer;

/**
 *
 * @author KOSTA
 */

 

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author younghoonkim
 */
public class Console {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("�ݾ��� �Է��ϼ���:");
        int money=Integer.parseInt(sc.nextLine());
        
        Service service=new Service();
        service.playLotto(money);
       
    }
    
}
