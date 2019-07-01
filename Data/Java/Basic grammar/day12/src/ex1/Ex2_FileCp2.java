/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author KOSTA
 */
public class Ex2_FileCp2 {
 
    public static void main(String[] args) throws IOException{
        long start = System.currentTimeMillis();
        String path1 = "C:\\bigdataStudy\\java\\jdk.exe";
        String path2 = "C:\\bigdataStudy\\java\\myjdk.exe";
        //FileInputStream fis = null;
        //FileOutputStream fos = null;
        
        
        //2차스트림을 선언
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try{
            
        //1차 스트림의 주소를 인자로 전달!
        
        bis = new BufferedInputStream(new FileInputStream(path1));
        bos = new BufferedOutputStream(new FileOutputStream(path2));
//fis = new FileInputStream(path1); //1바이트씩 읽어내고
        //fos = new FileOutputStream(path2); //11바이트씩 저장한다.
        int readV = 0;
        //bis로부터 버퍼에 담아 읽어 들이면서
        //bos로부터 읽어온 경로로 버퍼단위로 저장한다.
        while((readV = bis.read()) != -1){
            bos.write(readV);
        }
        
        }   catch(FileNotFoundException ex){
        }   catch(IOException ex){
            
        } finally{
            if(bis != null) bis.close();
            if(bos != null) bos.close();
        }
        long end = System.currentTimeMillis();
        System.out.println("복사한 시간" + (end - start));
    }
    
    
}
