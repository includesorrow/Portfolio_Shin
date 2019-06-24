package ex2.model.domain;

public class ProductVO {
	private String name;
	public ProductVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int price;	 
	public ProductVO(String name, int price){
		this.name=name;
		this.price=price;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Product [name = ");
		sb.append(name).append(",price = ");
		sb.append(price).append("]");
		return sb.toString();
		
	}

}
