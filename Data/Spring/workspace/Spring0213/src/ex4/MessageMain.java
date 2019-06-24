package ex4;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;

public class MessageMain {
public static void main(String[] args) {
	//1. Target 객체를 생성 (폭탄을 터트릴 장소)
	MessageImple target = new MessageImple();
	//2. Advice 객체를 생성 (폭탄의 유형)
	MessageAdvice advice = new MessageAdvice();
	//3. 1,2,를 위빙시키기 위한 관리 객체를 생성 ProxyFactoryBean 
	ProxyFactoryBean pBean = new ProxyFactoryBean();
	//프록시 팩토리 빈의 역할을 이해만 하고 있어라. advice랑 타겟이랑.
	//위빙 : 떨어지는중
	//joinpoint : 위치
	
	//3-1. ProxyFactoryBean에게 타겟, Advice들을 알려주도록 한다.
	pBean.setTarget(target);
	//세터이므로 DI라고 판단할줄 알아야 함
	//pBean.addAdvice(advice);
	//3-2 PintCut과 Advice를 결합한 Advisor를 생성
	
	NameMatchMethodPointcut pointcut=
			new NameMatchMethodPointcut();
	
	//pri로 시작하는 모든 메서드를 pointcut으로 설정
	pointcut.setMappedName("mess*");
	pBean.addAdvisor(new DefaultPointcutAdvisor(pointcut, advice));
	//비즈니스 로직을 요청
	MessageInter prMessage = (MessageInter) pBean.getObject();
	//prMessage.test();
	//prMessage.print2();
	System.out.println(prMessage.message());
}
	//pointcut
	//advice를 어떤 곳에다가 적용할 것인가??????????????????
	//nameMatchMethod << 포인트컷임.그냥써보는거라고 생각하세요
	//pri* << Pri(nt 1, nt2 등 다 떠오는거임)
	
	//pBean 어쩌고까지는 프록시 설정하는거임. 그 이후는 프록시가 들고있기 때문에
	//프록시에게 연결해서 요청하는 작업을 수행할 얘정임.
	//이 개념을 di & AOP라고 함.
	//AOP를 관리해 주는 애가 프록시인데 그걸 관련지어서 하는거임
	//이거 나중에보이지도않음 일단 개념 아는 거임
}
