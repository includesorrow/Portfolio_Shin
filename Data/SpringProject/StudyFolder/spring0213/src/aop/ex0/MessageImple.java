package aop.ex0;

public class MessageImple implements MessageInter {

	String message;

	public MessageImple() {
		message = "������ AOP�� �̷��Ŵ� �� �� �غ��� ��!";
	}

	@Override
	public void print() {
		System.out.println("Print �޼��尡 ȣ��!");
	}

	@Override
	public void print2() {
		System.out.println("Print2 �޼��尡 ȣ��!");
	}

	@Override
	public void test() {
		System.out.println("test �޼��尡 ȣ��!");
	}

	@Override
	public String message() {
		System.out.println("$$$$$$$$$$$$$$$$");
		return "�ʢʢʢʢʢ� " + message;
	}

}
