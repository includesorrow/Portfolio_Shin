package ex5;

public class MyBeanImple implements MyBeanInter{

	@Override
	public String myGetMessage(String name) {
		StringBuffer sb = new StringBuffer();
		sb.append("Message : ").append("test").append(name);
		sb.append("핵심 로직 수행!");
		return sb.toString();
	}

	
}
