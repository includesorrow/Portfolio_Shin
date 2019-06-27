package aop.ex1;

import org.aspectj.lang.JoinPoint;

public class NameReturnAdvice {
	// �ݵ�� ��ȯ���� �̸��� ����ؾ� �մϴ�.
	public void myReturnMethod(JoinPoint jp, Object ret) {
		// JoinPoint�� Advice�� ����� �޼���
		String namev = jp.getSignature().getName();
		System.out.println("Name : " + namev);
		System.out.println("��ȯ�� : ");
		System.out.println(ret);
	}
}
