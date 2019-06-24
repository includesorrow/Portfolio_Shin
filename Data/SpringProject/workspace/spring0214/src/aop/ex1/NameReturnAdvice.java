package aop.ex1;

import org.aspectj.lang.JoinPoint;

public class NameReturnAdvice {
	// 반드시 반환값은 이름을 기억해야 합니다.
	public void myReturnMethod(JoinPoint jp, Object ret) {
		// JoinPoint는 Advice가 적용된 메서드
		String namev = jp.getSignature().getName();
		System.out.println("Name : " + namev);
		System.out.println("반환값 : ");
		System.out.println(ret);
	}
}
