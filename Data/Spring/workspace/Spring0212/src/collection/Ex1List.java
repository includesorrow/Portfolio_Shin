package collection;

import java.util.List;

public class Ex1List {
//bean�� bean ������ ��ǻ���� �� �� ���� ��� �ٸ� ���� �����ϰų� �� �� ����Ѵ�
	//DAO SELECT����� -> LIST�� ��ȯ����
	//�� ������� �ٷ��� ����.
	
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
