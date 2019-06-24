package exam;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class BeforeAdvice {
	@Before("execution(* exam.LoginTest.*(..))")
	public void beforeMethod() {
	}
	
	
	@AfterReturning(
			pointcut = "execution(* exam.SecurityImple.securityMethod(..))",
			returning = "ret")
	
	public void myReturnMethod(JoinPoint jp, Object ret) {
		
	}
	
	
	
}
