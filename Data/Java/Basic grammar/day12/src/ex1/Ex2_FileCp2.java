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
        
        
        //2����Ʈ���� ����
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try{
            
        //1�� ��Ʈ���� �ּҸ� ���ڷ� ����!
        
        bis = new BufferedInputStream(new FileInputStream(path1));
        bos = new BufferedOutputStream(new FileOutputStream(path2));
//fis = new FileInputStream(path1); //1����Ʈ�� �о��
        //fos = new FileOutputStream(path2); //11����Ʈ�� �����Ѵ�.
        int readV = 0;
        //bis�κ��� ���ۿ� ��� �о� ���̸鼭
        //bos�κ��� �о�� ��η� ���۴����� �����Ѵ�.
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
        System.out.println("������ �ð�" + (end - start));
    }
    
    
}
