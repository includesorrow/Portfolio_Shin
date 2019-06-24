package kr.or.kosta.mvc.aop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

@Component 
@Aspect 
public class TodayAspect {
	
	@Before("execution(* kr.or.kosta.mvc.controller.*.today*(..))")
	public void before(JoinPoint jp) {
		Object[] fd = jp.getArgs();
		if(fd[0] instanceof Model) {
			Model m = (Model) fd[0];
			m.addAttribute("today", new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		}
	}

	

	//argument를 Model m 으로 해주겠다는 의미
	//AOP설계
	/*
	 * todayMessage(Model m, ~~~이런식으로 해야함)
	 * todayMessage(String mm, model m << 이런식은 안됨.
	 * 모델로 처리되기 전에 전처리할꺼냐 후처리할꺼냐를 쓰는데 before니깐 전처리이다. 
	 */
	
	/*
	 * 매개변수는 위와 같이 joinPoint.getArgs() 를 통해, 본래 메소드가 받은 매개 변수를 받아 올 수 있고, Object 이므로 형 변환을 해줘야 한다.
	 */
	
	
}
