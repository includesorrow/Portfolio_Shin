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
public class Num {
    private int win;
    private int lose;
    private double winrate;

    
    
    public boolean getResult() {
         int comnum= (int)(Math.random()*2)+1;
         if(comnum == 1){
             return true;
         }
         else {
             return false;
         }
         
    }
    
    public int getWin() {
        
        return win;
    }

    public void setWin(int win) {
        
        win++;
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        lose++;
        this.lose = lose;
    }
    public void setL(int lose){
        lose++;
        lose = this.lose;
    }
    
    
    
    public double getWinrate() {
        double wr;
        double win = (double) getWin();
        double lose = (double) getLose();
        wr = win/(win+lose);
        
        return wr;
    }

    public void setWinrate(double winrate) {
//        winrate = ((getWin())/getWin()+getLose());
        
        this.winrate = winrate;
    }
    

    
}
