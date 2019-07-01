package Ex4;

public class IndoCook extends Cook implements ServiceCook{
	// 인도쿡은 Cook이라는 부모를 두고 있으며 ServiceCook을 인터페이스로 지정
	public String Food() {
		return "인도음식";
	} 
	//인도음식으로 값 반환.

	/*public void orderindoCook(String name) {
	System.out.println(name + "님이 인도 요리를 주문했습니다.");
	
}*/
	
}
