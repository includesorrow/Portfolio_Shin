package Ex1;

public interface Ex3_Jdk8 {
	public int num2 = 20; //상수
	public void num1(); // 추상메서드
	//jdk 8부터 지원 , static 메서드
	public static void test() {
		System.out.println("static test");
	}
	//default 메서드!
	default public String test2() {
		return "본사 비법으로 만들어진 조미료";
		//system.out.println("기본 값");
	}
	default public void name() {
		System.out.println("기본 메서드를 정의");
	}
	

}
