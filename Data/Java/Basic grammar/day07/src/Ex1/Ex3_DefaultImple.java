package Ex1;

public class Ex3_DefaultImple implements Ex3_Jdk8{
//강제로 재정의 되는 것은 추상 메서드
	
	@Override
	public void num1() {
	System.out.println("본사의 비법을 써 봅시다.");
	System.out.println("---------------------");
	System.out.println(test2());
	System.out.println("--------------------");
	//인터페이스가 가지고 있는 static 메서드도 호출 해 봅시다.
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		Ex3_Jdk8 ref = new Ex3_DefaultImple();
		ref.num1();
		ref.test2();
	}
	
	
	
}
