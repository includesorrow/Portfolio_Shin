package aop.ex1;

import org.aspectj.lang.JoinPoint;

public class NameReturnAdvice {

	//반드시 반환값은 이름을 기억해야합니다.
	
	public void myReturnMethod(JoinPoint jp, Object ret) {
		//joinpoint는 Advice가 적용된 메서드
		String namev = jp.getSignature().getName();
		System.out.println("Name : " + namev);
		System.out.println("반환값 : ");
		System.out.println(ret);
		
	}
	
	
	/*Object ret가 중요하다.
	/얘ㄱ가 반환되는 값의 이름을 기억읋해야한다.
	그래야 mapping이 가능하다.
	*/
}
