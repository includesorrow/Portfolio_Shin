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
        sb.append("�ȳ��ϼ���").append(name).append("�� �ݰ�����");
        return sb.toString();
    }
    
    private String message;
    
    public String makeMessage(String name,boolean gender){
      StringBuffer sb = new StringBuffer();  
        if(gender = true){
            sb.append("����! : �ȳ��ϼ���").append(name).append("�ݰ����ϴ�.");
        }
        else{
            
            sb.append("����! : �ȳ��ϼ���").append(name).append("�ݰ����ϴ�.");
        }
      return sb.toString();
    }
//    public static void main(String[] args) {
//        MyMeesageDemo mmd = new MyMessageDemo();
//        String message = mmd.makeMessage("��浿");
//        System.out.println("message");
//    }
}
