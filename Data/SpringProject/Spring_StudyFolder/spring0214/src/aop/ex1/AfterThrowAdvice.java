package aop.ex1;

public class AfterThrowAdvice {

	//JoinPoint jp 생략.....
	public void commThrow(Exception ew) {
		System.out.println("예외 메세지 : "+ew.getMessage());
	}
}
