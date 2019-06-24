/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam;

import java.util.Scanner;


/**
 *
 * @author KOSTA
 */
public class LinkedListExample {
    
    ArrayList al = new ArrayList();
    LinkedList ll = new LinkedList();
    
    
    
    public void list(){
                
        Scanner sc = new Scanner(System.in);
        int soc = Integer.parseInt(sc.nextLine());
                
        
        if(soc==1){
            al.list();
            
            
            
        }
        else if(soc==2){
            ll.list();
        }
    }
    
    
    

Scanner sc = new Scanner(System.in);
//List<String> list1 = new ArrayList<String>();
//List<String> list2 = new LinkedList<String>();


    public static void main(String[] args) {
    LinkedListExample lle = new LinkedListExample();
    lle.list();

        
        
    }




    
}
