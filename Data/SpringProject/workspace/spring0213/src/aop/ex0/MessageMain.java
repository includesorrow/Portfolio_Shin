package aop.ex0;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;

public class MessageMain {
	public static void main(String[] args) {
		//1. Target 객체를 생성 - 폭탄 터트릴 장소
		MessageImple target = new MessageImple();
		//2. Advice 객체를 생성 - 폭탄
		MessageAdvice advice = new MessageAdvice();
		//3. 1,2를 위빙시키기 위한 관리 객체를 생성 ProxyFactoryBean
		ProxyFactoryBean pBean = new ProxyFactoryBean();
		//3-1. ProxyFactoryBean에게 타켓, Advice들을 알려주도록 한다.
		pBean.setTarget(target);
		//pBean.addAdvice(advice);
		//3-2. Pointcut과 Advice를 결합한 Advisor를 생성
		NameMatchMethodPointcut pointcut = new NameMatchMethodPointcut();
		
		//pri 시작하는 모든 메서드를 pointcut으로 설정
		pointcut.setMappedNames("mess*");
		pBean.addAdvisor(new DefaultPointcutAdvisor(pointcut, advice));
		
		//비지니스 로직을 요청
		MessageInter prMessage = (MessageInter) pBean.getObject();
//		prMessage.test();
//		prMessage.print();
//		prMessage.print2();
		System.out.println(prMessage.message());
	}
}
