package ex2.model.dao;

import ex2.model.domain.ProductVO;
import ex2.model.service.ProductDao;

public class ProductDaoImple implements ProductDao {
	
	// Spring Bean으로 선언한 후 값을 지정하고 현재 객체에서 주소값으로 주입을 받음
	
	private ProductVO product;
	
	
	public void setProduct(ProductVO product) {
		this.product = product;
	}


	@Override
	public ProductVO getProduct() {
		//가상데이터를 가진 주소를 반환
		return product;
	}

}
