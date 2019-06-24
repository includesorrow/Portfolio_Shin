package ex4;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;

public class MessageMain {
public static void main(String[] args) {
	//1. Target ��ü�� ���� (��ź�� ��Ʈ�� ���)
	MessageImple target = new MessageImple();
	//2. Advice ��ü�� ���� (��ź�� ����)
	MessageAdvice advice = new MessageAdvice();
	//3. 1,2,�� ������Ű�� ���� ���� ��ü�� ���� ProxyFactoryBean 
	ProxyFactoryBean pBean = new ProxyFactoryBean();
	//���Ͻ� ���丮 ���� ������ ���ظ� �ϰ� �־��. advice�� Ÿ���̶�.
	//���� : ����������
	//joinpoint : ��ġ
	
	//3-1. ProxyFactoryBean���� Ÿ��, Advice���� �˷��ֵ��� �Ѵ�.
	pBean.setTarget(target);
	//�����̹Ƿ� DI��� �Ǵ����� �˾ƾ� ��
	//pBean.addAdvice(advice);
	//3-2 PintCut�� Advice�� ������ Advisor�� ����
	
	NameMatchMethodPointcut pointcut=
			new NameMatchMethodPointcut();
	
	//pri�� �����ϴ� ��� �޼��带 pointcut���� ����
	pointcut.setMappedName("mess*");
	pBean.addAdvisor(new DefaultPointcutAdvisor(pointcut, advice));
	//����Ͻ� ������ ��û
	MessageInter prMessage = (MessageInter) pBean.getObject();
	//prMessage.test();
	//prMessage.print2();
	System.out.println(prMessage.message());
}
	//pointcut
	//advice�� � �����ٰ� ������ ���ΰ�??????????????????
	//nameMatchMethod << ����Ʈ����.�׳ɽẸ�°Ŷ�� �����ϼ���
	//pri* << Pri(nt 1, nt2 �� �� �����°���)
	
	//pBean ��¼������� ���Ͻ� �����ϴ°���. �� ���Ĵ� ���Ͻð� ����ֱ� ������
	//���Ͻÿ��� �����ؼ� ��û�ϴ� �۾��� ������ ������.
	//�� ������ di & AOP��� ��.
	//AOP�� ������ �ִ� �ְ� ���Ͻ��ε� �װ� ������� �ϴ°���
	//�̰� ���߿������������� �ϴ� ���� �ƴ� ����
}
