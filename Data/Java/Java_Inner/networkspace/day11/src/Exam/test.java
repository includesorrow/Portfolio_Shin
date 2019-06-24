/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam;

import java.io.File;

/**
 *
 * @author KOSTA
 */
public class test {
    public static void main(String[] args) {
        
    
        File path = new File("C:\\bigdataStudy\\java");
        File[] fileList = path.listFiles(); 
        
        if(fileList.length > 0){
        for(int i=0; i < fileList.length; i++){
        System.out.println(fileList[i]);
    }
}
}
}
