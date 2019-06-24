package aop.ex1;

import org.aspectj.lang.ProceedingJoinPoint;

//Around Advice
public class CheckAdvice {
	public void chkectTime(ProceedingJoinPoint pjp) throws Throwable {
		long start = System.currentTimeMillis();
		// target객체의 메서드를 호출
		pjp.proceed();
		long end = System.currentTimeMillis();
		System.out.println((end - start) + "초");
	}
}
