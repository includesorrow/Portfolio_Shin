package ex1;

//���������� ���ʷ� Bean�� ����ؼ�
//Spring Container�� ����ؼ� ȣ��� Bean

public class Ex1_Bean {
	private String msg;
	
	public Ex1_Bean() {
		System.out.println("hellobean ����!");
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String printMessage() {
		return "hi" + msg;
	}

}
