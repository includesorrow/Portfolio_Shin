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
    
    //�ε���� ���������� �θ�� ��� �������� �������̽��� ��´�.
    
    	public String Food() {
            
            if(intValue == 1){
                return "ī��";
            }
            else if(intValue == 2){
                return "��";
            }
            else if(intValue == 3){
                return "ź�θ�";
            }
                return null;
            
            
            
		} 
}
