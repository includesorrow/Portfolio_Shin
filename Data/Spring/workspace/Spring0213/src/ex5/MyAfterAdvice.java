package ex5;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class MyAfterAdvice implements AfterReturningAdvice{
	//타겟 메서드가 실행 된 이후에 적용(mybean에 추가하기)

	@Override
	public void afterReturning(Object returns, Method arg1, Object[] arg2,Object arg3) throws Throwable {
			System.out.println("메서드의 정보");
			System.out.println("Method" + arg1.getReturnType());
			System.out.println("Return" + returns.toString());
	}
	
	
}
