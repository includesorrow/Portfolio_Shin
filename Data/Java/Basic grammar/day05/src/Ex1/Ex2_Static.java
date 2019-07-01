package Ex1;

public class Ex2_Static {
	/*
	 * static은 공유
	 * 오직 하나만 생성해서 여러 객체가 공유해서 사용할 수 있는 자원
	 * static공간에 정의되고 있기 때문에 생성없이 접근 및 사용된다.
	 * static이 붙으면 실제 모든 자원은 JVM영역중에 STATIC영역에 위치한다.
	 */
	
	private static int num1;	//static 변수(멤버필드)
	private int num2;			//인스턴스 변수 (멤버필드)
	public void startTest() {
		num1++;
		num1++;
		num2++;
		num2++;
	}
	
	public static int getNum1() { //static이 붙으면 static메소드
		return num1;
	}
	
	public int getNum2() { //인스턴스 메소드
		return num2;
	}
	
	
	
	
	
	
	
	
	
	
	
}
