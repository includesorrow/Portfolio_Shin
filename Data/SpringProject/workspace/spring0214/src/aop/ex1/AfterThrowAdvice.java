package aop.ex1;

public class AfterThrowAdvice {

	//JoinPoint jp ����.....
	public void commThrow(Exception ew) {
		System.out.println("���� �޼��� : "+ew.getMessage());
	}
}
