package aop.ex1;

import org.aspectj.lang.ProceedingJoinPoint;

public class CheckAdvice {
	public void checkTime(ProceedingJoinPoint pjp) throws Throwable{
		long start = System.currentTimeMillis();
		
		//Ÿ���� �޼��带 ȣ��
		
		pjp.proceed();
		long end = System.currentTimeMillis();
		System.out.println((end-start)+"��");
	
		//�������� ������ �˰� ������ ������ �Է��� �ʿ� ���� ����� �����̽��� �˾Ƽ� ĳġ��.
	}
	
	
}
