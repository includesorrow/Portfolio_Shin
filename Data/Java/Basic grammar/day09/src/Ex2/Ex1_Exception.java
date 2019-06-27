/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex2;

import ex1.MyInter1;
import java.util.Scanner;

/**
 *
 * @author KOSTA
 */
public class Ex1_Exception {
    
    public static void main(String[] args) {
        System.out.println("수를 입력:");
        int num = 0;
        int res = 0;
        Scanner sc = new Scanner(System.in);
        try{
            num = Integer.parseInt(sc.nextLine()); // 예외가 발생(1)
            res = 10 / num;
            System.out.println("res : " + res);
        } catch(Exception e){
            //e에는 예외의 처리객체의 주소값
            if(e instanceof NumberFormatException){
                System.out.println("0안됨");
            }
            else if(e instanceof ArithmeticException){
                System.out.println("숫자입력");
            }
            
//            
//            System.out.println(e);
//            
//            System.out.println("나머지 예외");
        }
        
//        catch (NumberFormatException | ArithmeticException e){ //이렇게도 할 수는 있다.
//            System.out.println("숫자만 입력하세요");
//            
//        } catch(ArithmeticException e) {
//            System.out.println("0으로 나눌 수가 없습니다.");
//        }
        
        System.out.println("실행 종료! 마무리영역");
    }
    
}
