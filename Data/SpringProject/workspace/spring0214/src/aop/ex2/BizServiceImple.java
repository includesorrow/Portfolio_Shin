package aop.ex2;

public class BizServiceImple implements BizService {

	@Override
	public void bizMethod1() {
		System.out.println("¼öÇà!");
	}

	@Override
	public String second() {
		StringBuffer sb = new StringBuffer();
		sb.append("-------").append("\n");
		sb.append(" ±è±æµ¿").append("\n");
		sb.append("-------").append("\n");
		return sb.toString();
	}

}
