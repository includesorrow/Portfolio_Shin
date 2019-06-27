/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author KOSTA
 */
public class Ex3_FileOutputStreamDemo {
    public static void main(String[] args)throws IOException{
        //파일이 존재하지 않으면
        String path = "C:\\bigdataStudy\\java\\demo\\message.txt";
        FileOutputStream fos = null;
        try{
            //파일을 생성한다
            //두번째 인자에 데이터를 append
       
        fos = new FileOutputStream(path,true);
        fos.write(66);
        fos.write(65);
        }   catch (FileNotFoundException ex){
            ex.printStackTrace();
        } finally{
            if(fos != null) fos.close();
        }
             
    }
    
    
}
