/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam;

/**
 *
 * @author KOSTA
 */
public class KoreaCook extends RandomValue implements ServiceCook {
    //코리아쿡에서 랜덤벨류를 부모로 잡고 서비스쿡을 인터페이스로 잡는다.

    private String menu;
    
    
    	public String Food() {
            
            if(intValue == 1){
                return "된장찌개";
            }
            else if(intValue == 2){
                return "비빔밥";
            }
            else if(intValue == 3){
                return "김치찌개";
            }
                return null;
             
}
        
}
