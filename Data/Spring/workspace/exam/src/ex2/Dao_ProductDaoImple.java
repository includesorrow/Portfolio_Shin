package ex2;

public class Dao_ProductDaoImple implements Service_ProductDaoInterface{

	//Spring bean���� ������ �� ���� ����
	//���� ��ü���� �ּҰ��� ������ ����.
	
	private Domain_ProductVO productvo;

	public void setProductvo(Domain_ProductVO productvo) {
		this.productvo = productvo;
	}

	@Override
	public Domain_ProductVO getProduct() {
		//���� �����͸� ���� �ּҸ� ��ȯ��Ų��.
		return productvo;
	}
	
	
	
}
