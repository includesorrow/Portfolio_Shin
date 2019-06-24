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
public class Ex0_NullPointerExceptionDemo {
    private MyInter inter;
    public Ex0_NullPointerExceptionDemo(MyInter inter){
        this.inter = inter;
    }
    public void execute(){
        //예외발생
        inter.myMethod();
    }
    public static void main(String[] args) {
        MyInter inter = null;
        new Ex0_NullPointerExceptionDemo(inter).execute();
    }
}
