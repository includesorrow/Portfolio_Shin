package ex2.model.dao;

import ex2.model.domain.ProductVO;
import ex2.model.service.ProductDao;

public class ProductDaoImple implements ProductDao {
	
	// Spring Bean���� ������ �� ���� �����ϰ� ���� ��ü���� �ּҰ����� ������ ����
	
	private ProductVO product;
	
	
	public void setProduct(ProductVO product) {
		this.product = product;
	}


	@Override
	public ProductVO getProduct() {
		//�������͸� ���� �ּҸ� ��ȯ
		return product;
	}

}
