/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author KOSTA
 */
public class MyMessageDemo {
    public String makeMessage(String name){
        StringBuffer sb = new StringBuffer();
        sb.append("안녕하세요").append(name).append("님 반가워요");
        return sb.toString();
    }
    
    private String message;
    
    public String makeMessage(String name,boolean gender){
      StringBuffer sb = new StringBuffer();  
        if(gender = true){
            sb.append("여성! : 안녕하세요").append(name).append("반갑습니다.");
        }
        else{
            
            sb.append("남성! : 안녕하세요").append(name).append("반갑습니다.");
        }
      return sb.toString();
    }
//    public static void main(String[] args) {
//        MyMeesageDemo mmd = new MyMessageDemo();
//        String message = mmd.makeMessage("김길동");
//        System.out.println("message");
//    }
}
