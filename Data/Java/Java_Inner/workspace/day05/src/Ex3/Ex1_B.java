package Ex3;

public class Ex1_B extends Ex1_A{
	int bb = 2;
	public Ex1_B() {
		System.out.println("자식 생성자 호출");
	}
public static void main(String[] args) {
	//상속 관계에서는 [자식 클래스를 객체]로 생성한다.
	Ex1_B ref = new Ex1_B();
	//부모 외 자식이 생성이 된다.
	System.out.println(ref.aa);
	System.out.println(ref.bb);
	
	//부모가 먼저 생성이 된다.
}
}
