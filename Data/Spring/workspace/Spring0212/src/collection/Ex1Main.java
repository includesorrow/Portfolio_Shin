package collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class Ex1Main {
	public static void main(String[] args) {
		
		
		ApplicationContext ctx
		= new GenericXmlApplicationContext(
					"collection/list.xml");
		//MyTest mytest = ctx.getBean("mytest",MyTest.class);
		//ProductVO product = prService.getProduct();
		Ex1List ex1list = ctx.getBean("list1",Ex1List.class);
//		Ex1List ex1list2 = ctx.getBean("");
		System.out.println(ex1list.printEx1List());
		System.out.println();
		//System.out.println(mytest.printMyTest());
		

		}
}
