package ex1;

//���������� ���ʷ� bean���� ����ؼ�
//Spring Container�� ����ؼ� ȣ��� ��

public class HelloBean {
	private String msg;
	public HelloBean() {
		System.out.println("HelloBean ����!");
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String printMessage() {
		return "Hi"+msg;
	}
	
	
}
