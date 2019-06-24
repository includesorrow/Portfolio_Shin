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
public class Test2 extends Test1 implements ServiceCook{
        
       static int ii = 4;

    public int getII() {
        return ii;
    }
            
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


