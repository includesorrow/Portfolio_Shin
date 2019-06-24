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
public class IndoCook extends RandomValue implements ServiceCook{
    
    //인도쿡에서 랜덤벨류를 부모로 잡고 서비스쿡을 인터페이스로 잡는다.
    
    	public String Food() {
            
            if(intValue == 1){
                return "카레";
            }
            else if(intValue == 2){
                return "난";
            }
            else if(intValue == 3){
                return "탄두리";
            }
                return null;
            
            
            
		} 
}
