package ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import ex1_1.PrintInter;

public class Ex1_Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("ex2/resource.xml");
		PrintInter pi = ctx.getBean("res", Ex1_ResourceService.class);
		System.out.println(pi.printName());
	}
}
