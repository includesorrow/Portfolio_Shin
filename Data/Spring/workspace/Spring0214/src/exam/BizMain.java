package exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import aop.ex2.BizService;

public class BizMain {
public static void main(String[] args) {
	ApplicationContext ctx =
			new GenericXmlApplicationContext("exam/exam.xml");
	BizServices bean = ctx.getBean("bean",BizServices.class);
	bean.securityMethod();  
}
}
