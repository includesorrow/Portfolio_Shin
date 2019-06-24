package ex4;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


//Around Adivce�� �����غ��� ���ؼ� aop Alliance �����ϴ� API�� ����
public class MessageAdvice implements MethodInterceptor{
/*
 * Around�� ��쿡��
 * ������ɻ���1 :  adivce ���� ����
 * �ٽɷ�������  : �޼���ȣ��
 * ������ɻ���2 : Advice ���뿵��
 * 
 * 
 */
	
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable{
		System.out.println("Ÿ�ٺ��� ���� ó���� ����!");
		//beforeAdvice�̴�.
		//methodinvocation < ������ ����. (aware�� ������ ������)
	//�޼��� ȣ�� : Around�� ��쿡�� �ٽ� ����Ͻ� ������ �޼��带 ȣ���Ѵ�
	Object rev = invocation.proceed();

	///invocation.proceed() < joinpoint�� ����Ǿ��ִ� ��ü�κ��� ȣ��
	System.out.println("Ÿ���� ����� �� ó���� ����!");
	
	//After Advice�̴�.
	return rev;
	}
	
	//aop alliance.....around advice
	//sysout 2���� �ִµ� before after


}