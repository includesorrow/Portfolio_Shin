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
   //AutoBoxing�Ϲ��ڷ����� ��üȭ
   //UnBoxing��ü�� �Ϲ��ڷ������� ��ȯ
    
    //1000�� �Ϲ��ڷ����ε��ű⿡ nList��. ����ڽ����ε�.
    //jdk7���� new ArrayList<����>
    
    Member m = new Member();
    
    
    
    
    
    //���ڿ� ��ü�� ���� �� �ִ� ArrayList
    private ArrayList<String> list;
    
    //������...
    private ArrayList<Integer> nList;
    
    
    
    //���� �� ���� ����. ����� Ÿ������ ���� ArrayList�� ����
    private ArrayList<Member> member;
    
    public Ex3_ArrayList(){
        int n = m.getAge();
        
//        String id;
//        int pwd;   
        
        
        
        
        //jdk 7���� newArrayList<����>
        //jdk 8���� new ArrayList<String>;
        list = new ArrayList<>();
        list.add("Test1");
        list.add("10");
        list.add("3.14");
        nList = new ArrayList<>();
        nList.add(1000);
        nList.add(2000);
        //�̰͵� ����.
        member = new ArrayList<>();
        ///��� �����ϱ� (�̰� ���� ������)
        for(int i=0; i<3; i++){
          
            m.setId("xman"+i);
            m.setPw(20+i);
            m.setAge(30+i);
            member.add(m);
            
        }
        // ���� : Member m �� �������� �ʰ�
        // list�� �߰��ϴ� ����� �ִ°�?
//        for(int i = 0; i < 3 ; i++){
//            mlist.add(new Member("xman" + i, "kim" + i, 30+i));
//        }
        
        
        
        for(int i=0; i<3; i++){
            System.out.println(member.get(i)==m);
            System.out.println(member.get(i).toString()+"     "+member.get(i).getAge());
        }
        for(Member e : member){
            System.out.println("���̵� : " + e.getId());
        }
        
        
        
        member.add(m);
        //for������ ����غ���
        
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
