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
public class Ex2_Lambda {
    
       public Ex2_Lambda(MyInter1 myInter1){
         myInter1.myMethod(200);
     }
    public static void main(String[] args) {
        //익명 내부클래스의 값으로 생성자에게 전달
        Ex2_Lambda ref = new Ex2_Lambda((argN)->{
            int res = argN * 2;
           System.out.println(res); 
        });
        
        //평범한코드
        MyInter1 myInter2 = argN ->
                   System.out.println("Result3 : " + argN*2);
        myInter2.myMethod(1000);
        
        
//        new MyInter1() {
//            @Override
//            public void myMethod(int argN){
//                int res = argN * 2;
//                System.out.println("Result1:" + res);
//            }
//        }.myMethod(100);
  //      System.out.println("---------------------");
    ///람다식
    
    
    
    
    //****틀린것
//   MyInter1 myInter1 = (int argN) -> {
//   int res = argN *2;
//       System.out.println("Result1 : " +res);
//   
//   };
//   myInter1.myMethod(100);
//        
    //정답    
  



    }
    
}

