package life2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import life.LifeCycleInter;

public class Life2Main {
	public static void main(String[] args) {
		//������ �ƴ� ����ε� �̰͵� ������� �˾ƾ� ��.
		
		ApplicationContext ctx
		= new GenericXmlApplicationContext(
					"life2/life2.xml");
		LifeCycleInter life2 = ctx.getBean("life2",LifeCycleInter.class);
		 
		life2.execute();
		
		 

		}
}
