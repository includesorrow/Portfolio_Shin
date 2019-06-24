/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex1;
import java.util.Iterator;
import java.util.Vector;
/**
 *
 * @author KOSTA
 */
public class Ex1_Vector {
    
    public Ex1_Vector() {
        //모든 클래스는 기본적으로 최상위 클래스인 Object를 상속받는다.
        
        
        
        
        
        //생성 (List구조, Collection -> 객체만 저장하게 되어있다.
        //모든 객체 => Object(최고상위객체)
        
        //오버라이드 : 부모에 있는 자원을 자식이 고쳐쓰기 위해서 하는 것. 
        //오버라이드를 하니깐 오버라이드 적지 않아도 가능함. 재정의가 가능함. 
        Vector v = new Vector();
        System.out.println("초기 용량 : " + v.capacity());
        System.out.println("초기 사이즈 : " + v.size());
        
        //add를 호출해서 Vector에 저장
        v.add("Test1");
        v.add("Test2");
        v.add("Test1");
        System.out.println("초기 용량 : " + v.capacity());
        System.out.println("초기 사이즈 : " + v.size());
        
        //추천for문
        for(Object e : v){
            System.out.println(e);
        }
        
        System.out.println("-----------");
        
        //반복자(추천)
        Iterator it = v.iterator();
        while (it.hasNext()){      //다음 요소가 있으면 true
            Object o = it.next();  //요소의 값을 가져오는 멘션
            System.out.println(o);
    }
        
        
    }
    
 
}
