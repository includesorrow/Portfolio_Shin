package ex2;

public class Domain_ProductVO {
	public Domain_ProductVO() {
		super();
	}
	
	private String name;
	private int price;
	
	
	
	public Domain_ProductVO(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
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
