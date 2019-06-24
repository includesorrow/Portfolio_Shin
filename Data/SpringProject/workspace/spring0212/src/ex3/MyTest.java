package ex3;
//Spring은 생성자를 오버로딩때 String이 기본타입
public class MyTest {
	private int num;
	private String msg;
	
	public MyTest(int num) {
		this.num = num;
		System.out.println("int 호출");
	}
	public MyTest(String msg) {
		this.msg = msg;
		System.out.println("String 호출");
	}
	
	public String printMyTest() {
		StringBuffer sb = new StringBuffer();
		sb.append("num: ").append(num);
		sb.append(" msg: ").append(msg);
		return sb.toString();
	}
}
