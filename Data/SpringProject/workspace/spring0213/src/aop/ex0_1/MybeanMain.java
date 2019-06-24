package aop.ex0_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MybeanMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("aop/ex0_1/mybean.xml");
		MyBeanInter mbi = ctx.getBean("pfBean", MyBeanInter.class);
		mbi.myGetMessage("±è±æµ¿");
	}
}
