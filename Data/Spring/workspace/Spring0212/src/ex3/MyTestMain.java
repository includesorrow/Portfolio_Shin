package ex3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import ex2.model.domain.ProductVO;
import ex2.model.service.ProductService;

public class MyTestMain {
public static void main(String[] args) {
	
		ApplicationContext ctx
		= new GenericXmlApplicationContext(
					"ex3/mytest.xml");
		MyTest mytest = ctx.getBean("mytest",MyTest.class);
		//ProductVO product = prService.getProduct();
		
		System.out.println(mytest.printMyTest());
	
}
}
