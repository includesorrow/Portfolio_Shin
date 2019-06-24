package ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Ex1_Main {
	public static void main(String[] args) {
		
	
	/*
	 * ApplicationContext
	 * - BeanFactory�� ��ӹ��� �����̳�
	 * ����ȭ �������ش�.
	 * GenericXmlApplicationContext
	 * JDK 5���� �������ִ� ���׸��� �������ִ� �����̳� ���� ��ü
	 */
	

	//1. �����̳� ��� �� ����(��� ����� ����)
	ApplicationContext ctx = new GenericXmlApplicationContext("ex1/ex1xml.xml");
	
	//2. �����̳ʿ� ��ϵ� �ʿ��� ��ü�� ����
	Ex1_Bean ex1bean = ctx.getBean("hello",Ex1_Bean.class);
	//����⸸ �ϴ��� �����ڰ� �ε��� �ȴ�. 
	//�׷��� �����ڰ� �ε��� �ǹǷ� �����ڰ� ����� �ȴ�.
	
	//3. �� ���
	
	
	
	String msa = ex1bean.printMessage();
	System.out.println(msa);
	//ex1bean�� �ִ� �޽����� ����Ʈ���ְ� �ʹ�.
	//�ٵ� �װ� msa�� �����Ѵ�.
	//ex1bean�� ctx(�����̳� �ȿ� �ִ�) bean�� ������ �´�.
	//���� ���� : "hello", Ex1_Bean.class�� �ִ� hello�� �� ���̵� ������ �´�.
	
	
}}
