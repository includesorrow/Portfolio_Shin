package Ex1;

public class Ex2_Main {
	
	
	public static void testaa() {
		
	}
	//메인에 testaa(); 호출이 안됨.
	//ex2_main을 생성하던가 static을 생성하던가 해야함
	
	public static void main(String[] args) {
		//testaa();
		//testaa라는 메서드를 호출함.
		
		//생성자 호출
		
		Ex2_Static ref1 = new Ex2_Static();
		Ex2_Static ref2 = new Ex2_Static();
		Ex2_Static ref3 = new Ex2_Static();
		//각 객체의 메소드 호출

		
		ref1.startTest(); // num1 - 1
		ref2.startTest(); // num1 - 2
		//출력

		System.out.println("static num1 : " + ref1.getNum1());
		System.out.println("non static num2 : " + ref1.getNum2());
		System.out.println("-----------------------------");
		System.out.println("static num 1 : " + ref2.getNum1());
		System.out.println("non static num2 : " + ref2.getNum2());
		
		System.out.println("statnum1 : " + ref1.getNum1());

		System.out.println("statnum1 : " + ref2.getNum1());
		
		
		System.out.println("startnum1 : " + ref3.getNum1());
		
		
		System.out.println(Ex2_Static.getNum1());
		
		
		
		
		
		/*
		 * static num1 : 2
		 * non static num 2 : 1
		 * static num1 : 2
		 * nonstatic num 2 : 1
		 * 
		 * 
		 */
}
}
