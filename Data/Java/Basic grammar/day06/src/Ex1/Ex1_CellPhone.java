package Ex1;

public class Ex1_CellPhone {

	
	//�ʵ�
	private String model;
	public void setModel(String model) {
		this.model = model;
		
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public String getColor() {
		return color;
	}
	private String color;
	
	//������
	
	
	//�޼ҵ�
	void powerOn() {System.out.println("������ �մϴ�.");}
	void powerOff() {System.out.println("������ ���ϴ�.");}
	void bell() {System.out.println("���� �︳�ϴ�.");}
	void sendVoice(String message) {System.out.println("�ڱ� : " + message);}
	void receiveVoice(String message) {System.out.println("���� : " + message);}
	void hangUp() {System.out.println("��ȭ�� �����ϴ�.");}
	
}
