/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam2;

import java.util.TreeSet;

/**
 *
 * @author KOSTA
 */
public abstract class getLottoNum implements LottoInterface{
    public String getLottoNum(){
        TreeSet<Integer> ts = new TreeSet<>();
        ts = new TreeSet<>();
        while (ts.size() !=6){
            int rnum = (int)(Math.random()*45+1);
            ts.add(rnum);
        }
        for(;ts.size()<7 ;){
        System.out.println(ts);
    }
  //      ts
        return null;
           }
    
    }

