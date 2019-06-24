package aop.ex1;

public class AfterThrowAdvice {

	//jointpoint jp 생략
	
	//예외존재해야함
	public void commThrow(Exception ew) {
		System.out.println("예외 메시지 : " + ew.getMessage());
	}
}
