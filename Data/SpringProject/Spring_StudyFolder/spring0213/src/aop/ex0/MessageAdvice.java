package aop.ex0;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

// Around Advice를 적용해보기 위해서 aopAlliance 제공하는 API를 적용!
public class MessageAdvice implements MethodInterceptor {
// Around일 경우에는
	// 공통관심사항1 ----- Advice 적용영역
	// 핵심로직 수행  ----- 메서드호출
	// 공통관심사항2 ----- Advice 적용영역
	
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("타겟 보다 먼저 처리될 로직!");
		
		//메서드 호출 : Around일 경우에만 핵심 비지니스로직의 메서드를 호출한다.
		Object rev = invocation.proceed();
		
		System.out.println("타겟이 수행 될 후 처리될 로직!");
		return rev;
	}

}
