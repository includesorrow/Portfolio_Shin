/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author KOSTA
 */
public class Ex1_File {
    public static void main(String[] args) {
        //ù��° ���
        String path = "C:\\bigdataStudy\\java\\demo.txt" ;
        //���� ��ü�� ���� : �ش� �����̳� ��ΰ� ��� �߻����� ��� ����
        File f = new File(path);
        //�ֿ� �޼ҵ� ����
        System.out.println("demo1.txt�� �����ϴ°�? " + f.exists());
        if(f.exists()){
            System.out.println("��������");
        }
        
        System.out.println("demo1.txt�� �����ΰ�?" + f.isFile());
        System.out.println("������ �����Ѱ�?" + f.canExecute());
        System.out.println("�ۼ��� �����Ѱ�?" + f.canWrite());
        System.out.println("������"+ f.getAbsolutePath());
        System.out.println("���� �̸�" + f.getName());
        System.out.println("���丮��?" + f.isDirectory());
        System.out.println("������ ����" + f.length());
    
        
        
        
        //��� �������� �ʾƵ� ���� �ȳ���
        File f2 = new File("C:\\bigdataStudy\\java\\demo.txt");
        if(!f.exists()){
            try {
                System.out.println("���� aa�� ����ڽ��ϴ�.");
                //0byte¥�� ������ ����� �ش�. unix���� touch ��ɾ�
                f2.createNewFile();
            }
            catch(IOException  ex){
                ex.printStackTrace();
            }
            
        }
        else{
            System.out.println("�̹� �����մϴ�.");
        }
    
        
        
        
        //F3�̶� ���ϰ�ü��
        //"C:\\KOSTA188||DEMO||WORKS||WORK1������ �ѹ��� ����� �ʹ�.
        //mkdirs - �߻����� ���� ���丮���� ����
        File f3 = new File("C:\\KOSTA188||DEMO||WORKS||WORK1");
        if(!f3.exists()){
            f3.mkdirs();
        }else{
            System.out.println("�̹� �����մϴ�." + f3.getAbsolutePath());
        }
    }
    
}
