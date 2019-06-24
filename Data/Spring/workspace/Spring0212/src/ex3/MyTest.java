package ex3;

public class MyTest {

	private int num;
	private String msg;
	public MyTest(int num) {
		this.num=num;
		System.out.println("int 호출");
	}
	public MyTest(String msg) {
		this.msg=msg;
		System.out.println("String 호출");
		//1000을 넣었는데 스트링을 디폴트값으로 가진다. 즉, 스트링을 우선순위를 가진다.
	}
	public String printMyTest() {
		StringBuffer sb = new StringBuffer();
		sb.append("num : ").append(num);
		sb.append("msg : ").append(num);
		return sb.toString();
	}
	
	
	
}
