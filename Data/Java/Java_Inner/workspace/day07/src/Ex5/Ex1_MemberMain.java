package Ex5;

public class Ex1_MemberMain {
	public static void main(String[] args) {
		/*핵심포인트
		 * 내부 클래스를 생성하려고 할 때는
		 * 외부 클래스를 생성한 후 그 주소를 참조해서
		 * 다시 내부 클래스를 생성하는 방식이다.
		 * 
		 */
		
		//1. 외부클래스 생성
		Ex1_MemberInner outer = new Ex1_MemberInner();
		//2. 외부클래스의 주소값을 저장한 참조 변수  outer를 내부클래스를 생성
		outer.SuperA();
		Ex1_MemberInner.Inner inner;
		inner = outer.new Inner();
		inner.printData();
		inner.SuperB();
		System.out.println("===================");
		//연습문제
		//외부클래스를 생성한 후 내부 클래스를 생성하고자 할 때
		//한줄로 생성하고 바로 프린트data
		inner.printData();
		
		
		//밑에는정답
		//익명으로 객체를 생성하는 방법으로 printData()를 호출
		new Ex1_MemberInner().new Inner().printData();
	}
}
