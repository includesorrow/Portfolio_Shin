package life;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
/*
 * 1. 생성자호출
 * 2. di
 * 3. init()
 * 4. 비지니스메서드 호출
 * 5. destory()
 */
public class LifeCycleMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("life/life.xml");
		LifeCycleInter life = ctx.getBean("life1", LifeCycleInter.class);
		life.execute();
	}
}
