package life;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import ex3.MyTest;

public class LifeCycleMain {
	
	/*
	 * 1. ������ ȣ��
	 * 2. di
	 * 3. init()
	 * 4. ����Ͻ��޼��� ȣ��
	 * 5. destory()
	 */
	public static void main(String[] args) {
		
	
	ApplicationContext ctx
	= new GenericXmlApplicationContext(
				"life/life.xml");
	LifeCycleInter life = ctx.getBean("life1",LifeCycleInter.class);
	 
	life.execute();
	
	

	}

}
