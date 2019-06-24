package aop.ex1;

import org.aspectj.lang.ProceedingJoinPoint;

public class CheckAdvice {
	public void checkTime(ProceedingJoinPoint pjp) throws Throwable{
		long start = System.currentTimeMillis();
		
		//타겟의 메서드를 호출
		
		pjp.proceed();
		long end = System.currentTimeMillis();
		System.out.println((end-start)+"초");
	
		//시작점과 끝점을 알고 싶은데 일일히 입력할 필요 없이 어라운드 어드바이스로 알아서 캐치함.
	}
	
	
}
