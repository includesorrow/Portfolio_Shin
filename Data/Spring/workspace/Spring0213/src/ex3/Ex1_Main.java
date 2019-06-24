package ex3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Ex1_Main {

	public static void main(String[] args) {
		ApplicationContext ctx =
				new GenericXmlApplicationContext("ex3/auto.xml");
	PrintInter pi = ctx.getBean("autoBean",PrintInter.class);
	System.out.println(pi.printName());
	}
	
	
	
}
