package ex2;

public class Dao_ProductDaoImple implements Service_ProductDaoInterface{

	//Spring bean으로 선언한 후 값을 지정
	//현재 객체에서 주소값을 주입을 받음.
	
	private Domain_ProductVO productvo;

	public void setProductvo(Domain_ProductVO productvo) {
		this.productvo = productvo;
	}

	@Override
	public Domain_ProductVO getProduct() {
		//가상 데이터를 가진 주소를 반환시킨다.
		return productvo;
	}
	
	
	
}
