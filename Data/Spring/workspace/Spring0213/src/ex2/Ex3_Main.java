package ex2;

import java.util.Properties;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import ex1.Ex2_Map;

public class Ex3_Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("�޽��� �Է�");
	String msg = sc.nextLine();
	
	ApplicationContext ctx = new GenericXmlApplicationContext("ex2/ex2map.xml");
	Ex3_Prop ex3prop = ctx.getBean("propBean", Ex3_Prop.class);
	Properties prop = ex3prop.getProp();
	String val = prop.getProperty(msg, "�� �� ���� �ܾ��̳׿�.");
	System.out.println("�亯 : " + val);
	
}
	 
	
	
}
