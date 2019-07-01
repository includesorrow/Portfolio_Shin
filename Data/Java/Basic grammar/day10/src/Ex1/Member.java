/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex1;

/**
 *
 * @author KOSTA
 */
public class Member {
    
    private String id;
    private int age;
    private int pw;

     public Member(){
         
     }
        public Member(String id, int age, int pw) {
            this.id = id;
            this.age = age;
            this.pw = pw;
        }


    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPw() {
        return pw;
    }

    public void setPw(int pw) {
        this.pw = pw;
    }

   
    
    
}
