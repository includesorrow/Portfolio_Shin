package aop.ex1;

import org.aspectj.lang.ProceedingJoinPoint;

//Around Advice
public class CheckAdvice {
	public void chkectTime(ProceedingJoinPoint pjp) throws Throwable {
		long start = System.currentTimeMillis();
		// target��ü�� �޼��带 ȣ��
		pjp.proceed();
		long end = System.currentTimeMillis();
		System.out.println((end - start) + "��");
	}
}
