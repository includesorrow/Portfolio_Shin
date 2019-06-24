/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex2;

/**
 *
 * @author KOSTA
 */
public class Ex3_Exception {
    
    private int[] var = {100, 200, 300};
    public Ex3_Exception(){
        try{
            for(int i = 0; i <= var.length; i++){
                System.out.println(i + "" + var[i]);
            }
        }catch(Exception e){
            //예외의 메시지를 출력
            e.printStackTrace();
            System.out.println("배열의 범위를 넘었습니다.");
            return; //이거 제거해도 되긴 함. 근데 
        }finally{
            //예외처리와 상관없이 무조건 수행이 되는 영역!
            System.out.println("실행 종료! 마무리 영역");
        }
        System.out.println("실행 종료! 마무리 영역");
    }
    public static void main(String[] args) {
        Ex3_Exception ex = new Ex3_Exception();
        Ex3_Exception ex1 = ex;
        
    }
    
}
