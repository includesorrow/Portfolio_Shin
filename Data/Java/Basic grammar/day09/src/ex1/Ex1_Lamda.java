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
public class Ex1_Lamda{
    public static void main(String[] args){
        //�͸���Ŭ����
        MyInter myInter = new MyInter() {
    @Override
            public void myMethod() {
            //    Runnable runnable = () -> {System.out.println("MyTest");};
//@Override
            //public void myMethod() {
            //    System.out.println("Mytest");
            }
        };
        
    myInter.myMethod();
    System.out.println("--------------");
    //�ŰԺ����� ���ϰ��� ���� void�� ��� ���ٽ�
      MyInter myInter1 =()  -> {
        System.out.println("MyTest1");
    };
    myInter1.myMethod();
    
    
}
}