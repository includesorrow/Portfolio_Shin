package ex3;

public class myTest {
	private int num;
	private String msg;
	public myTest(String msg) {
		super();
		this.msg = msg;
		System.out.println("��Ʈ�� ȣ��");
		//1000�� �־��µ� ��Ʈ���� ������ ������ ������.
		//��, ��Ʈ���� �켱������ ������.
	}
	public String printMyTest() {
		StringBuffer sb = new StringBuffer();
		sb.append("num :").append(num);
		sb.append("msg :").append(num);
		return sb.toString();
	}

}
