/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam3;

/**
 *
 * @author KOSTA
 */
public class WinLose extends Num implements Interface{
 //   Num num = new Num(); //num. �Ⱦ��ų� �̰� �Ƚᵵ��.
    
    
    
    
    
    
    
    public String game(){
        if(getResult()==true){
            setWin(getWin());
        return "�����մϴ�. �¸��ϼ̽��ϴ�.";
        }
        else if(getResult()==false){
            setLose(getLose());
            return "����� �й��Ͽ����ϴ�.";
        }
        
        return null;
    }
        public String Prize(){
        if(getWinrate() >= 0.7){
            
        return "�����մϴ�. ��ǰ�� ���� �ڰ��� �ֽ��ϴ�.";
         
        }
        else if(getWinrate()<0.7){
            return "����� ��ǰ�� ���� �ڰ��� �����ϴ�.";}
        return null;
        }
        
//        public int asdf(){
//        int rate;
//        rate = getWin()/(getWin()+getLose());
//        return rate;
//    }
//    
//    
//    public String Lose(){
//        setLose(num.getWin());
//        return "����� �й��Ͽ����ϴ�.";
//    }
   
    
    
    
}
