package ex3;

public class MyTest {

	private int num;
	private String msg;
	public MyTest(int num) {
		this.num=num;
		System.out.println("int ȣ��");
	}
	public MyTest(String msg) {
		this.msg=msg;
		System.out.println("String ȣ��");
		//1000�� �־��µ� ��Ʈ���� ����Ʈ������ ������. ��, ��Ʈ���� �켱������ ������.
	}
	public String printMyTest() {
		StringBuffer sb = new StringBuffer();
		sb.append("num : ").append(num);
		sb.append("msg : ").append(num);
		return sb.toString();
	}
	
	
	
}
