/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author KOSTA
 */
public class Ex1_FileCp {
 
    public static void main(String[] args) throws IOException{
        long start = System.currentTimeMillis();
        String path1 = "C:\\bigdataStudy\\java\\jdk.exe";
        String path2 = "C:\\bigdataStudy\\java\\myjdk.exe";
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try{
            
        
        fis = new FileInputStream(path1); //1바이트씩 읽어내고
        fos = new FileOutputStream(path2); //11바이트씩 저장한다.
        int readV = 0;
        //fis로 부터 1byte씩 읽어 들이면서
        //fos로 읽어온 경로로 1byte씩 저장한다.
        while((readV = fis.read()) != -1){
            fos.write(readV);
        }
        
        }   catch(FileNotFoundException ex){
        }   catch(IOException ex){
            
        } finally{
            if(fis != null) fis.close();
            if(fos != null) fos.close();
        }
        long end = System.currentTimeMillis();
        System.out.println("복사한 시간" + (end - start));
    }
    
    
}
