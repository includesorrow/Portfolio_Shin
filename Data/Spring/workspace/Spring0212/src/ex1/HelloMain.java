package ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloMain {
	public static void main(String[] args) {
		//ApplicationContext -> BeanFactory�� ��ӹ��� �����̳�
		//����ȭ����, ���� ���� ����Ѵٵ���...
		//(Spring3.0~) GenericXmlApplicationContext = 
		//JDK5���� �������ִ� ���׸��� �������ִ� �����̳� ������ü
		//
		
		
		
		//1. �����̳� ��� �� ���� (��� ����� ����)
		ApplicationContext ctx = new GenericXmlApplicationContext("ex1/hello.xml");
		//2. �����̳ʿ� ��ϵ� �ʿ��� ��ü�� ����
		HelloBean hBean = ctx.getBean("hello", HelloBean.class);
		//3. �� ���
		String msg = hBean.printMessage();
		System.out.println(msg);
		
		
		 /* �ֻ��� : BeanFactory (�߻�,���������̱� ������ ��������Ѵ�)
		 * instance ��ȯ
		 * Object getBean(String name) 
		 * 
		 */
		/*
		 * ���α׷��� ����Ǹ� �����̳� ����
		 * �� ������ HelloBean ����
		 * �� new HelloBean()���� ������ ���� �ʰ� �̱�������
		 * static������ �־� �ΰ� �����ϴ� ����� �̱��渮��Ʈ
		 * �׷��� ���۷���
		 ****GETBEAN�� ������ �ƴ�. �̸� �����ϴ� ������.
		 *ApplicationContext ctx = new GenericXmlApplicationContext("ex1/hello.xml");
		 *�̰͸� �־ ����� hELLObEAN ����! �̶�� ������ ��
		 *
		 */
		
		//����
		
		HelloBean hBean2 = ctx.getBean("hello", HelloBean.class);
		HelloBean hBean3 = ctx.getBean("hello", HelloBean.class);
		//�̱��� �������͸��� ����Ǳ� ������ �˾Ƽ� �̱������� ����
		System.out.println("�� : " + (hBean2 == hBean3));
		//TURE�� ���
		
	}
}
