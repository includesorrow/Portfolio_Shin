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
        //��� Ŭ������ �⺻������ �ֻ��� Ŭ������ Object�� ��ӹ޴´�.
        
        
        
        
        
        //���� (List����, Collection -> ��ü�� �����ϰ� �Ǿ��ִ�.
        //��� ��ü => Object(�ְ������ü)
        
        //�������̵� : �θ� �ִ� �ڿ��� �ڽ��� ���ľ��� ���ؼ� �ϴ� ��. 
        //�������̵带 �ϴϱ� �������̵� ���� �ʾƵ� ������. �����ǰ� ������. 
        Vector v = new Vector();
        System.out.println("�ʱ� �뷮 : " + v.capacity());
        System.out.println("�ʱ� ������ : " + v.size());
        
        //add�� ȣ���ؼ� Vector�� ����
        v.add("Test1");
        v.add("Test2");
        v.add("Test1");
        System.out.println("�ʱ� �뷮 : " + v.capacity());
        System.out.println("�ʱ� ������ : " + v.size());
        
        //��õfor��
        for(Object e : v){
            System.out.println(e);
        }
        
        System.out.println("-----------");
        
        //�ݺ���(��õ)
        Iterator it = v.iterator();
        while (it.hasNext()){      //���� ��Ұ� ������ true
            Object o = it.next();  //����� ���� �������� ���
            System.out.println(o);
    }
        
        
    }
    
 
}
