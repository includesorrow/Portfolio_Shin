package ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloMain {
	//ApplicationContext -> BeanFactory�� ��ӹ��� �����̳�
	//����ȭ ����, ���� ���� ����Ѵٵ���.....
	//GenericXmlApplicateionContext : jdk5 ���� �������ִ� ���׸��� ���� ���ִ� �����̳� ������ü
	//spring3.0���� ����!
	public static void main(String[] args) {
		// 1. �����̳� ��� �� ����
		ApplicationContext ctx = new GenericXmlApplicationContext("ex1/hello.xml");
		// 2. �����̳ʿ� ��ϵ� �ʿ��� ���Ը� ����
		HelloBean hBean = ctx.getBean("hello", HelloBean.class);
		// 3. �� ���
		String msg = hBean.printMessage();
		System.out.println(msg);
		HelloBean hBean2 = ctx.getBean("hello", HelloBean.class);
		// �̱��� �������͸��� ����Ǳ� ������ �˾Ƽ� �̱������� ����(�⺻��)
		System.out.println("��: "+(hBean==hBean2));	//true
	}
}
