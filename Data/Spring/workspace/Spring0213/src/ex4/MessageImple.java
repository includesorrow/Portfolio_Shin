package ex4;

public class MessageImple implements MessageInter{
	private String message;
	
	public MessageImple() {
		System.out.println("������!");
		message="���� AOP�� �̷��Ŵ�. �ѹ� �غ��� ��!";
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
	System.out.println("test �޼��尡 ȣ~~~��");
	}

	@Override
	public String message() {
		System.out.println("$$$$$$$$$$$$$$$$");
		return "�� �� �� �� �� �� �� �� "+message;
	}

}
