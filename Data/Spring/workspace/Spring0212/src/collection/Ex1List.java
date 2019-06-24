package collection;

import java.util.List;

public class Ex1List {
//bean과 bean 사이의 컨퓨저를 할 때 빈을 묶어서 다른 빈을 주입하거나 할 때 사용한다
	//DAO SELECT결과들 -> LIST로 반환받음
	//그 결과값을 다루진 않음.
	
	private List<String> items;
	private List<Float> itemsf;
	
	public List<String> getItems() {
		return items;
	}
	public void setItems(List<String> items) {
		this.items = items;
	}
	public List<Float> getItemsf() {
		return itemsf;
	}
	public void setItemsf(List<Float> itemsf) {
		this.itemsf = itemsf;
	}
	public String printEx1List() {
		StringBuffer sb = new StringBuffer();
		sb.append("string : ").append(items);
		sb.append("float : ").append(itemsf);
		return sb.toString();
	}
	
}
