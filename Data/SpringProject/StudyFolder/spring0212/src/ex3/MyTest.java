package ex3;
//Spring�� �����ڸ� �����ε��� String�� �⺻Ÿ��
public class MyTest {
	private int num;
	private String msg;
	
	public MyTest(int num) {
		this.num = num;
		System.out.println("int ȣ��");
	}
	public MyTest(String msg) {
		this.msg = msg;
		System.out.println("String ȣ��");
	}
	
	public String printMyTest() {
		StringBuffer sb = new StringBuffer();
		sb.append("num: ").append(num);
		sb.append(" msg: ").append(msg);
		return sb.toString();
	}
}
