/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex1;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author KOSTA
 */
public class Ex4_Set {
    public static void main(String[] args) {
        //set 인터페이스 - 정렬이 보장되지 않는 중복값을 방지하는 컬렉션
        //중복을 제거하면서 반복자, 향상된 for문 등 지원
        HashSet<String> h1 = new HashSet<>();
        //TreeSet<String> h1 = new TreeSet<>(); //오름차순
        //LinkedHashSet<String> h1 = new LinkedHashSet<>(); //입력순
        h1.add("Ztest");
        h1.add("Btest");
        h1.add("Atest");
        h1.add("Ctest");
        h1.add("Btest");
        System.out.println("크기 : " + h1.size());
        for(String e : h1){
            System.out.println(e);
        }
        
        System.out.println("---------------------");
        Iterator<String> it = h1.iterator();
        while (it.hasNext()){
            String next = it.next();
            System.out.println(next);
            
            
        }
    }
    
    
}
