package aop.ex0_1;

public class MyBeanImple implements MyBeanInter {

	@Override
	public String myGetMessage(String name) {
		StringBuffer sb = new StringBuffer();
		sb.append("test 핵심로직 수행!");
		return sb.toString();
	}

}
