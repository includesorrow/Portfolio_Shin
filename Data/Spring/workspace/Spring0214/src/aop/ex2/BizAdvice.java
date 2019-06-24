package aop.ex2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//<aop:config> 즉, ProxyFactoryBean 선언
@Aspect
public class BizAdvice {
	@Before("execution(* aop.ex2.BizServiceImple.*(..))")
	public void beforeMethod() {
		System.out.println("★★★★★★★★★★★★★★★★★★★");
	}
	
	
	@AfterReturning(
		pointcut="execution(* aop.ex2.BizServiceImple.second(..))",
		returning="ret")
	
	public void myReturnMethod(JoinPoint jp, Object ret) {
		String namev = jp.getSignature().getName();
		System.out.println("Name : " + namev);
		System.out.println("반환값 :" );
		System.out.println(ret);
	}
	
	//Aspect은 생략하면 안된다. 프록시 패턴으로 해서 안으로 들어가겠다.
	//프록시팩토리빈이 안에 감춰저있는데, 어노테이션은 그 프록시 팩토리 빈을 추가시키겠다는 의미
	//절때 생략하면 안된다.
	//일단 차차 알아두는것. 먼저 생랴하지 말것
	//리터닝은 리턴받는 함수의 인자가 중요하다
	
}
