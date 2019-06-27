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
public class LinkedList implements LinkedInterface{
    public void list(){
            List<String> list2 = new java.util.LinkedList<>();
                
        long startTime;
        long endTime;
        
        startTime = System.nanoTime();
        for(int i =0; i<10000; i++){
            list2.add(0,String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList 걸린시간: " + (endTime-startTime) + "ns");

    }
}
