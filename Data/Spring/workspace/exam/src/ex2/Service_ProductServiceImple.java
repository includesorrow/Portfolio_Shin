package ex2;

public class Service_ProductServiceImple implements Service_ProductDaoInterface{

	private Service_ProductDao serviceproductdao;

	@Override
	public Domain_ProductVO getProduct() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Service_ProductDao getProductDao() {
		return serviceproductdao;
	}

	public void setServiceproductdao(Service_ProductDao serviceproductdao) {
		this.serviceproductdao = serviceproductdao;
	}
	
	
}
