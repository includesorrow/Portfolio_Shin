/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author KOSTA
 */
public class Ex1_MemberJoin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Map에 저장할 배열값
        String[] msg = {"AA", "BB", "CC", "AA", "DD", "EE", "FF"};
        HashMap<Integer,String> map = new HashMap<>();
        //Integer = 키값


        int cnt = 0; //배열의 시작 index값
        //배열의 갯수만큼 Map에 저장
        
        for(String e : msg){
            map.put(cnt+1, e); // cnt + 1 : Map의 키값이 1부터
            cnt++;
        }
        System.out.println("Map" + map.size());

        //출력!
        //키값을 가진 객체의 주소를 반환한다 => set으로 추출
        
        
        Set<Integer> keys = map.keySet();
        for(Integer e : keys){
           //map.put(k,v) , map.get(key)
            System.out.println(map.get(e));
        }
        //축약형
        //Map.Entry<Integer,String> : key와 value를 받아오기 위한
        //인터페이스, 자료형 -> e key, value 저장하는 객체 주소
        //entrySet() : key, value를 추출한 후 Map.Entry<Integer,String>
        //전환해서 반환한다.
        for(Map.Entry<Integer,String> e : map.entrySet()){
        System.out.println("key : " + e.getKey());
            System.out.println("Valye : " + e.getValue());
    }
        
        
    }
    
}
