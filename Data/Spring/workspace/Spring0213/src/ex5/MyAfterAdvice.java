package ex5;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class MyAfterAdvice implements AfterReturningAdvice{
	//Ÿ�� �޼��尡 ���� �� ���Ŀ� ����(mybean�� �߰��ϱ�)

	@Override
	public void afterReturning(Object returns, Method arg1, Object[] arg2,Object arg3) throws Throwable {
			System.out.println("�޼����� ����");
			System.out.println("Method" + arg1.getReturnType());
			System.out.println("Return" + returns.toString());
	}
	
	
}
