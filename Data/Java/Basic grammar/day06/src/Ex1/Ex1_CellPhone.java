package Ex1;

public class Ex1_CellPhone {

	
	//필드
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
	
	//생성자
	
	
	//메소드
	void powerOn() {System.out.println("전원을 켭니다.");}
	void powerOff() {System.out.println("전원을 끕니다.");}
	void bell() {System.out.println("벨이 울립니다.");}
	void sendVoice(String message) {System.out.println("자기 : " + message);}
	void receiveVoice(String message) {System.out.println("상대방 : " + message);}
	void hangUp() {System.out.println("전화를 끊습니다.");}
	
}
