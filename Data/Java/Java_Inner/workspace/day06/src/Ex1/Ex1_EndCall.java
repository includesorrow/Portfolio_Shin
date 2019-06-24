package Ex1;

public class Ex1_EndCall extends Ex1_CellPhone{
	//필드
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	//생성자
	
	Ex1_EndCall(String getMessage){}
	
	
	
	//메소드
	void EndCallMessage() {
		System.out.println("전화가 끝났습니다.");
	}
	
	
	void EndCallChoice() {
		System.out.println("다시 전화를 거시겠습니까?");
	}
	
	

}
