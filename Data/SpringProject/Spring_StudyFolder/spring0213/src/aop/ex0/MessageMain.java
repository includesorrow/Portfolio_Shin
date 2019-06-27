package aop.ex0;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;

public class MessageMain {
	public static void main(String[] args) {
		//1. Target ��ü�� ���� - ��ź ��Ʈ�� ���
		MessageImple target = new MessageImple();
		//2. Advice ��ü�� ���� - ��ź
		MessageAdvice advice = new MessageAdvice();
		//3. 1,2�� ������Ű�� ���� ���� ��ü�� ���� ProxyFactoryBean
		ProxyFactoryBean pBean = new ProxyFactoryBean();
		//3-1. ProxyFactoryBean���� Ÿ��, Advice���� �˷��ֵ��� �Ѵ�.
		pBean.setTarget(target);
		//pBean.addAdvice(advice);
		//3-2. Pointcut�� Advice�� ������ Advisor�� ����
		NameMatchMethodPointcut pointcut = new NameMatchMethodPointcut();
		
		//pri �����ϴ� ��� �޼��带 pointcut���� ����
		pointcut.setMappedNames("mess*");
		pBean.addAdvisor(new DefaultPointcutAdvisor(pointcut, advice));
		
		//�����Ͻ� ������ ��û
		MessageInter prMessage = (MessageInter) pBean.getObject();
//		prMessage.test();
//		prMessage.print();
//		prMessage.print2();
		System.out.println(prMessage.message());
	}
}
