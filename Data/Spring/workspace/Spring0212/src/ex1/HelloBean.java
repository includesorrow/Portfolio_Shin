package ex1;

//스프링에서 최초로 bean으로 등록해서
//Spring Container를 사용해서 호출될 빈

public class HelloBean {
	private String msg;
	public HelloBean() {
		System.out.println("HelloBean 생성!");
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String printMessage() {
		return "Hi"+msg;
	}
	
	
}
