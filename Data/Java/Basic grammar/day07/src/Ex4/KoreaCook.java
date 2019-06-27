package Ex4;

public class KoreaCook extends Cook implements ServiceCook{
	/*
	 * 클래스 생성
	 * Cook이라는 부모클래스를 상속하였다.
	 * 또한 ServiceCook이란 인터페이스를 참조하였다.
*/	 
	public String Food() {
		return "한국음식";
		//스트링 Food는 한국음식을 리턴한다.
	}
//public void orderkorCook(String name) {
	//System.out.println(name + "님이 한국 요리를 주문했습니다.");
	
//}

}
