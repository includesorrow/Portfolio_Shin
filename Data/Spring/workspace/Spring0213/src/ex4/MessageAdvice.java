package ex4;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


//Around Adivce를 적용해보기 위해서 aop Alliance 제공하는 API를 적용
public class MessageAdvice implements MethodInterceptor{
/*
 * Around일 경우에는
 * 공통관심사항1 :  adivce 적용 영역
 * 핵심로직수행  : 메서드호출
 * 공통관심사항2 : Advice 적용영역
 * 
 * 
 */
	
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable{
		System.out.println("타겟보다 먼저 처리될 로직!");
		//beforeAdvice이다.
		//methodinvocation < 주입을 받음. (aware와 동일한 개념임)
	//메서도 호출 : Around일 경우에만 핵심 비즈니스 로직의 메서드를 호출한다
	Object rev = invocation.proceed();

	///invocation.proceed() < joinpoint로 연결되어있는 객체로부터 호출
	System.out.println("타겟이 수행된 후 처리될 로직!");
	
	//After Advice이다.
	return rev;
	}
	
	//aop alliance.....around advice
	//sysout 2개가 있는데 before after


}