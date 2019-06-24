package ex2.model.service;

import ex2.model.domain.ProductVO;

public class ProductServiceImple implements ProductService {

	private ProductDao productDao;
	
	@Override
	public ProductVO getProduct() {
		return productDao.getProduct();
	}

	public ProductDao getProductDao() {
		return productDao;
	}

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

}
