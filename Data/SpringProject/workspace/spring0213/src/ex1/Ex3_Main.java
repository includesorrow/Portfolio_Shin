package ex1;

import java.util.Properties;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Ex3_Main {
	public static void main(String[] args) {

		ApplicationContext ctx = new GenericXmlApplicationContext("ex1/map.xml");
		Ex3_Prop prop = ctx.getBean("propBean", Ex3_Prop.class);
		Properties pr = prop.getProp();

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("�޼��� �Է� : ");
			String msg = sc.nextLine();
			String val = pr.getProperty(msg, "�� �� ���� �ܾ��Դϴ�.");
			System.out.println("�亯 : " + val + "\n");
		}
	}
}
