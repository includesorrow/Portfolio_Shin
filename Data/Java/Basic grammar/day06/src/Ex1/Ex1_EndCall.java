package Ex1;

public class Ex1_EndCall extends Ex1_CellPhone{
	//�ʵ�
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	//������
	
	Ex1_EndCall(String getMessage){}
	
	
	
	//�޼ҵ�
	void EndCallMessage() {
		System.out.println("��ȭ�� �������ϴ�.");
	}
	
	
	void EndCallChoice() {
		System.out.println("�ٽ� ��ȭ�� �Žðڽ��ϱ�?");
	}
	
	

}
