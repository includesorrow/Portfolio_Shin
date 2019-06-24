package Ex1;

public class Ex3_SubCar {
	
	
	
	//자식 클래스에 메서드를 추가
	public void testsub() {
		System.out.println("자식클래스에서의 메서드 호출");
		
	}
	public static void main(String[] args) {
		/*
		 * 부모를 참조 자료형으로 자식 클래스를 객체로 생성
		 * 부모의 자원만 참조가 가능하고
		 * 자식 객체인 ex3_SubCar() 지원은 참조가 불가능해진다.
		 * 
		 * 
		 */
//		Ex3_SuperCar ref = new Ex3_SubCar();
//		System.out.println(ref instanceof Ex3_SubCar);
//		ref.carColor(); //자식의 메서드가 실행 )오버라이딩)
//		ref.testSuper(); 
		//ref.testsub() // -> 참조자료형이 부모클래스이기 때문에 참조할 수 없다. (but 생성은 됨
	}

}
