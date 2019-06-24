/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam;

import java.util.List;

/**
 *
 * @author KOSTA
 */
public class ArrayList implements LinkedInterface{
    
    public void list(){
        List<String> list1 = new java.util.ArrayList<>();
                
        long startTime;
        long endTime;
        
        startTime = System.nanoTime();
        for(int i =0; i<10000; i++){
            list1.add(0,String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList 걸린시간: " + (endTime-startTime) + "ns");

        
        
    }
}
