package ex2;

public class Ex1_Child extends Ex1_Parent {
	
	//2. Object의 메서드를 재정의한것
	@Override
	public String toString() {
		return String.valueOf("상속받은 금액 :" + getPay());
	}
	
	//1. 재정의를 해야한 Ex1_Parent를 상속받을 수 있다.
	@Override
	public void moveMountain() {
		System.out.println("산을 성공적으로 옳긴 후 " + toString() + "받았다.");
	}
}
