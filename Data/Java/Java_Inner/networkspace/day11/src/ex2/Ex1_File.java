/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author KOSTA
 */
public class Ex1_File {
    public static void main(String[] args) {
        //첫번째 경우
        String path = "C:\\bigdataStudy\\java\\demo.txt" ;
        //파일 객체를 생성 : 해당 파일이나 경로가 없어도 추상적인 경로 가능
        File f = new File(path);
        //주요 메소드 연습
        System.out.println("demo1.txt가 존재하는가? " + f.exists());
        if(f.exists()){
            System.out.println("ㅇㅇ존재");
        }
        
        System.out.println("demo1.txt가 파일인가?" + f.isFile());
        System.out.println("실행이 가능한가?" + f.canExecute());
        System.out.println("작성이 가능한가?" + f.canWrite());
        System.out.println("절대경로"+ f.getAbsolutePath());
        System.out.println("파일 이름" + f.getName());
        System.out.println("디렉토리니?" + f.isDirectory());
        System.out.println("파일의 길이" + f.length());
    
        
        
        
        //경로 존재하지 않아도 오류 안난다
        File f2 = new File("C:\\bigdataStudy\\java\\demo.txt");
        if(!f.exists()){
            try {
                System.out.println("존재 aa를 만들겠습니다.");
                //0byte짜리 파일을 만들어 준다. unix에서 touch 명령어
                f2.createNewFile();
            }
            catch(IOException  ex){
                ex.printStackTrace();
            }
            
        }
        else{
            System.out.println("이미 존재합니다.");
        }
    
        
        
        
        //F3이란 파일객체로
        //"C:\\KOSTA188||DEMO||WORKS||WORK1폴더를 한번에 만들고 싶다.
        //mkdirs - 추상적인 하위 디렉토리까지 생성
        File f3 = new File("C:\\KOSTA188||DEMO||WORKS||WORK1");
        if(!f3.exists()){
            f3.mkdirs();
        }else{
            System.out.println("이미 존재합니다." + f3.getAbsolutePath());
        }
    }
    
}
