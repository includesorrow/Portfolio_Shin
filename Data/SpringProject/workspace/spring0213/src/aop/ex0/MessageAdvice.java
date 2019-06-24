package aop.ex0;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

// Around Advice�� �����غ��� ���ؼ� aopAlliance �����ϴ� API�� ����!
public class MessageAdvice implements MethodInterceptor {
// Around�� ��쿡��
	// ������ɻ���1 ----- Advice ���뿵��
	// �ٽɷ��� ����  ----- �޼���ȣ��
	// ������ɻ���2 ----- Advice ���뿵��
	
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("Ÿ�� ���� ���� ó���� ����!");
		
		//�޼��� ȣ�� : Around�� ��쿡�� �ٽ� �����Ͻ������� �޼��带 ȣ���Ѵ�.
		Object rev = invocation.proceed();
		
		System.out.println("Ÿ���� ���� �� �� ó���� ����!");
		return rev;
	}

}
