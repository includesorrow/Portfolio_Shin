package aop.ex1;

import org.aspectj.lang.JoinPoint;
import org.springframework.beans.factory.annotation.Autowired;

public class TodayBeforeAdvice {

	
	//오토와이어드
	//자동으로 빈을 주입받음
	//advice도 DI를 받을 수가 있다.
	
	@Autowired
	private MyPublic mypublic;
	
	public void beforeToday(JoinPoint jp) {
		System.out.println(mypublic.todayMethod());
	}
	
}
