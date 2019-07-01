package Ex1;
//기본 : 인터페이스의 정의 : 상수와 추상메서드로 구성되어 있다.
//jdk 7버전 이상부터 디폴트, 스태틱 추가됨
public interface Ex2_Inter {
	public static final int num1 = 10;//상수
	abstract public void test(); //추상메서드
	//축약형. 둘중 하나 쓰는데 밑에 쓰는게 더 편하긴 함. 
	public int num2 = 20; // 상수
	public void test2(); // 추상메서드
}

//인터페이스엔 변수가 못들어 감.