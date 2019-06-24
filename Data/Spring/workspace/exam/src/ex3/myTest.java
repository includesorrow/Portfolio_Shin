package ex3;

public class myTest {
	private int num;
	private String msg;
	public myTest(String msg) {
		super();
		this.msg = msg;
		System.out.println("스트링 호출");
		//1000을 넣었는데 스트링을 디폴드 값으로 가진다.
		//즉, 스트링을 우선순위로 가진다.
	}
	public String printMyTest() {
		StringBuffer sb = new StringBuffer();
		sb.append("num :").append(num);
		sb.append("msg :").append(num);
		return sb.toString();
	}

}
