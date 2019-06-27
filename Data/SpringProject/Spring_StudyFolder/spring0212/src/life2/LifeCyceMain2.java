package life2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class LifeCyceMain2 {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("life2/life2.xml");
		LifeCycleInter2 life = ctx.getBean("life2", LifeCycleInter2.class);
		life.execute();
	}
}
