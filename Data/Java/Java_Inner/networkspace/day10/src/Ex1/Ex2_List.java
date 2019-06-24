/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KOSTA
 */
public class Ex2_List {
    private List list;
     public Ex2_List(){
         
        list = new ArrayList();
        list.add("String AAA");
        list.add(new Integer(30));
        list.add(new Character('A'));
        list.add(new Float(3.14f));
        list.add("String");
        System.out.println("Size : " + list.size());
        
            for(Object e : list){
                 if(e instanceof String){
            System.out.println("String :" );}
                 else if(e instanceof Integer)
                     System.out.println("Integer : ");
    }
            
            
            
            
        
    
     
     
     }
     public static void main(String[] args) {
        
        new Ex2_List();
        }
    }

       
        
    
//        ex.list.size();
//        ex.list.get(0);
////        System.out.println(ex.list.size());
//        System.out.println(ex.list.get(0));
////        System.out.println(ex.list.get(4) + ex.list.get(0));
//        System.out.println(ex.list.get(1));
        
    
    

