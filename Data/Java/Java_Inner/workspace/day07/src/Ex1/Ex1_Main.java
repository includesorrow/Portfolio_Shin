package Ex1;

public class Ex1_Main extends Ex1_WindowDemo{
	public static void main(String[] args) {
		//2. 추상 메서드를 직접 익명 내부 클래스로 재정의를 할 경우
		new Ex1_WindowDemo() {
			@Override
			public void exec1() {
				System.out.println("다른 방법");
			}
		}.exec1();
	}
	@Override
	public void exec1() {
	System.out.println("결정적으로 필요한 메서드를 정의해서 사용");	
	}
	@Override
	public void exec3() {
		// TODO Auto-generated method stub
		super.exec3();
	}
}
