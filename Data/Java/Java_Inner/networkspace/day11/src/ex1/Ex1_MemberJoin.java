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
        //Map�� ������ �迭��
        String[] msg = {"AA", "BB", "CC", "AA", "DD", "EE", "FF"};
        HashMap<Integer,String> map = new HashMap<>();
        //Integer = Ű��


        int cnt = 0; //�迭�� ���� index��
        //�迭�� ������ŭ Map�� ����
        
        for(String e : msg){
            map.put(cnt+1, e); // cnt + 1 : Map�� Ű���� 1����
            cnt++;
        }
        System.out.println("Map" + map.size());

        //���!
        //Ű���� ���� ��ü�� �ּҸ� ��ȯ�Ѵ� => set���� ����
        
        
        Set<Integer> keys = map.keySet();
        for(Integer e : keys){
           //map.put(k,v) , map.get(key)
            System.out.println(map.get(e));
        }
        //�����
        //Map.Entry<Integer,String> : key�� value�� �޾ƿ��� ����
        //�������̽�, �ڷ��� -> e key, value �����ϴ� ��ü �ּ�
        //entrySet() : key, value�� ������ �� Map.Entry<Integer,String>
        //��ȯ�ؼ� ��ȯ�Ѵ�.
        for(Map.Entry<Integer,String> e : map.entrySet()){
        System.out.println("key : " + e.getKey());
            System.out.println("Valye : " + e.getValue());
    }
        
        
    }
    
}
