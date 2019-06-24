package ex4;

public class MessageImple implements MessageInter{
	private String message;
	
	public MessageImple() {
		System.out.println("생성자!");
		message="오늘 AOP란 이런거다. 한번 해보는 날!";
	}
	
	@Override
	public void print() {
		System.out.println("Print 메서드가 호출!");
	}

	@Override
	public void print2() {
		System.out.println("Print2 메서드가 호출!");
	}

	@Override
	public void test() {
	System.out.println("test 메서드가 호~~~출");
	}

	@Override
	public String message() {
		System.out.println("$$$$$$$$$$$$$$$$");
		return "■ ■ ■ ■ ■ ■ ■ ■ "+message;
	}

}
