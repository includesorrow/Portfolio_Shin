package aop.ex0_1;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class MyAfterAdvice implements AfterReturningAdvice {
	// Ÿ�� �޼��尡 ����� ���� ���������
	
	@Override
	public void afterReturning(Object returns, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		System.out.println("�޼����� ����");
		System.out.println("Method : "+arg1.getReturnType());
		System.out.println("Return : "+returns.toString());
	}
}
