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



//익명 내부클래스로 정의될 인터페이스
//@FunctionalInterface
//하나의 추상 메서드로 선언된 인터페이스만 람다식의 타겟이 된다.

@FunctionalInterface
public interface MyInter {
    public void myMethod();
   // public void myMethod2();
    //myMethod2 이거 해제하면 오류남. 반드시 추상메서드가 하나인 표기법임. 
}
