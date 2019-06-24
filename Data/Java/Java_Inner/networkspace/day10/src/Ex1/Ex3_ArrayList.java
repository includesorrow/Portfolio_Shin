package Ex1;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KOSTA
 */
public class Ex3_ArrayList {
   //AutoBoxing일반자료형을 객체화
   //UnBoxing객체를 일반자료형으로 전환
    
    //1000이 일반자료형인데거기에 nList들어감. 오토박싱으로들어감.
    //jdk7부터 new ArrayList<생략>
    
    Member m = new Member();
    
    
    
    
    
    //문자열 객체만 담을 수 있는 ArrayList
    private ArrayList<String> list;
    
    //정수만...
    private ArrayList<Integer> nList;
    
    
    
    //정답 및 내가 쓴거. 멤버를 타입으로 같는 ArrayList를 선언
    private ArrayList<Member> member;
    
    public Ex3_ArrayList(){
        int n = m.getAge();
        
//        String id;
//        int pwd;   
        
        
        
        
        //jdk 7부터 newArrayList<생략>
        //jdk 8부터 new ArrayList<String>;
        list = new ArrayList<>();
        list.add("Test1");
        list.add("10");
        list.add("3.14");
        nList = new ArrayList<>();
        nList.add(1000);
        nList.add(2000);
        //이것도 정답.
        member = new ArrayList<>();
        ///멤버 생성하기 (이건 내가 못쓴거)
        for(int i=0; i<3; i++){
          
            m.setId("xman"+i);
            m.setPw(20+i);
            m.setAge(30+i);
            member.add(m);
            
        }
        // 질문 : Member m 을 참조하지 않고
        // list에 추가하는 방법이 있는가?
//        for(int i = 0; i < 3 ; i++){
//            mlist.add(new Member("xman" + i, "kim" + i, 30+i));
//        }
        
        
        
        for(int i=0; i<3; i++){
            System.out.println(member.get(i)==m);
            System.out.println(member.get(i).toString()+"     "+member.get(i).getAge());
        }
        for(Member e : member){
            System.out.println("아이디 : " + e.getId());
        }
        
        
        
        member.add(m);
        //for문으로 출력해보기
        
        for(String e : list){
            System.out.println(e);
            
        }
        System.out.println("-------------------");
        for(Integer e : nList){
            System.out.println(e);
        }
        Iterator<String> it1 = list.iterator();
        Iterator<Integer> it2 = nList.iterator();
         while (it1.hasNext()){
             String e = it1.next();
             System.out.println(e);
         }       
         while (it2.hasNext()){
             int e = it2.next();
             System.out.println(e);
         }
    }
    
    public static void main(String[] args) {
        new Ex3_ArrayList();
    }
    
}
