package ex3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Ex2_Main {
	public static void main(String[] args) {
		ApplicationContext ctx =
				new GenericXmlApplicationContext("ex3/resource.xml");
	PrintInter pi = ctx.getBean("res",PrintInter.class);
	System.out.println(pi.printName());
		
	}
}