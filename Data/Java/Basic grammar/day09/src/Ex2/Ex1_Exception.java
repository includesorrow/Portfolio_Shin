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
        System.out.println("���� �Է�:");
        int num = 0;
        int res = 0;
        Scanner sc = new Scanner(System.in);
        try{
            num = Integer.parseInt(sc.nextLine()); // ���ܰ� �߻�(1)
            res = 10 / num;
            System.out.println("res : " + res);
        } catch(Exception e){
            //e���� ������ ó����ü�� �ּҰ�
            if(e instanceof NumberFormatException){
                System.out.println("0�ȵ�");
            }
            else if(e instanceof ArithmeticException){
                System.out.println("�����Է�");
            }
            
//            
//            System.out.println(e);
//            
//            System.out.println("������ ����");
        }
        
//        catch (NumberFormatException | ArithmeticException e){ //�̷��Ե� �� ���� �ִ�.
//            System.out.println("���ڸ� �Է��ϼ���");
//            
//        } catch(ArithmeticException e) {
//            System.out.println("0���� ���� ���� �����ϴ�.");
//        }
        
        System.out.println("���� ����! ����������");
    }
    
}
