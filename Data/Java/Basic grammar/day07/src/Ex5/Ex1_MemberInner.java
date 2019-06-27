package Ex5;

public class Ex1_MemberInner extends SuperA{
//기본 접근 제한자
	int numA;
	//클래스 내부에서만 접근이 가능
	private int numB;
	static int numC;
	public Ex1_MemberInner() {
		numA=10; numB=100; numC=200;
	}
	
	//멤버영역에 클래스를 정의 : 멤버 내부클래스
	public class Inner extends SuperB{
		public void printData() {
			System.out.println("intA : " + numA);
			System.out.println("int B : " + numB);//private인데도 들어가짐. 
			System.out.println("int C : " + numC);
		}
	}
}
