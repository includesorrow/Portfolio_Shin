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
    //�ڸ������ ���������� �θ�� ��� �������� �������̽��� ��´�.

    private String menu;
    
    
    	public String Food() {
            
            if(intValue == 1){
                return "�����";
            }
            else if(intValue == 2){
                return "�����";
            }
            else if(intValue == 3){
                return "��ġ�";
            }
                return null;
             
}
        
}
