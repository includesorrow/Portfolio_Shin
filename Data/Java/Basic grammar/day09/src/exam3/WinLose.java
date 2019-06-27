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
 //   Num num = new Num(); //num. 안쓰거나 이거 안써도됨.
    
    
    
    
    
    
    
    public String game(){
        if(getResult()==true){
            setWin(getWin());
        return "축하합니다. 승리하셨습니다.";
        }
        else if(getResult()==false){
            setLose(getLose());
            return "당신은 패배하였습니다.";
        }
        
        return null;
    }
        public String Prize(){
        if(getWinrate() >= 0.7){
            
        return "축하합니다. 상품을 받을 자격이 있습니다.";
         
        }
        else if(getWinrate()<0.7){
            return "당신은 상품을 받을 자격이 없습니다.";}
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
//        return "당신은 패배하였습니다.";
//    }
   
    
    
    
}
