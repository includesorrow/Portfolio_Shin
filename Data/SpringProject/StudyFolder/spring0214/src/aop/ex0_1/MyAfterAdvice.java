package aop.ex0_1;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class MyAfterAdvice implements AfterReturningAdvice {
	// 타겟 메서드가 실행된 이후 ㄴ어ㅏㄴ란얼
	
	@Override
	public void afterReturning(Object returns, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		System.out.println("메서드의 정보");
		System.out.println("Method : "+arg1.getReturnType());
		System.out.println("Return : "+returns.toString());
	}
}
