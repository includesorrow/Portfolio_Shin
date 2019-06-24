package ex1;

//스프링에서 최초로 Bean을 등록해서
//Spring Container를 사용해서 호출될 Bean

public class Ex1_Bean {
	private String msg;
	
	public Ex1_Bean() {
		System.out.println("hellobean 생성!");
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String printMessage() {
		return "hi" + msg;
	}

}
