package aop.ex1;

public class AfterThrowAdvice {

	//jointpoint jp ����
	
	//���������ؾ���
	public void commThrow(Exception ew) {
		System.out.println("���� �޽��� : " + ew.getMessage());
	}
}
