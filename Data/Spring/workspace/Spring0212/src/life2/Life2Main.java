package life2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import life.LifeCycleInter;

public class Life2Main {
	public static void main(String[] args) {
		//정석이 아닌 방법인데 이것도 사용할줄 알아야 함.
		
		ApplicationContext ctx
		= new GenericXmlApplicationContext(
					"life2/life2.xml");
		LifeCycleInter life2 = ctx.getBean("life2",LifeCycleInter.class);
		 
		life2.execute();
		
		 

		}
}
