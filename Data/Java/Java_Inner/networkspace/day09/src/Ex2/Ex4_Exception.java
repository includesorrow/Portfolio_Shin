/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

/**
 *
 * @author KOSTA
 */
public class Ex4_Exception {
    public Ex4_Exception(){
        Properties prop = new Properties();
        String path = "";
        //자동으로 close를 해주는 기능
        //jdk7버전부터 지원해 준다.
        //해당 클래스가 Closeable 인터페이스를 구현한 클래스들이 해당
//        try(FileInputStream fi = new FileInputStream(path);){
//            prop.load(fi);
//        }catch(FileNotFoundException ex){
//                
//                }catch(10)
    
    
    
    }
    
}
