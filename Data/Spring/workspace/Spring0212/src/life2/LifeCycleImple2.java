package life2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
//InitializingBean -> afterPropertiesSet을 재정의를 함
//DisposableBean -> Destroy()
//beanNameAware -> setBeanName(String name)
//스프링 컨테이너에서 관리되는 bean 내부 id, name
//의 정보를 확인하고 싶을 때 제공해주는 인터페이스
//beanFactoryAware ->  
//setApplicationContextAware -> setApplicationContext(ApplicationContext applicationContext) 
//ApplicationContext -> 스프링 컨테이너를 직접 사용할려고 할 때 사용
//팩토리보다 Applicationcontext가 더 나음

/*
 * BeanFactory
 * ApplicationContext
 * 
 * 스프링 컨테이너 : 스프링이 관리를 담당하는 (DI시킬 대상이 되는)
 *  스프링 컨테이너 안에 DI 안에 들어올 수 있는 것들 다 들어오고 있다.
 * Aware : 알려주는 인터페이스
 */
public class LifeCycleImple2 implements LifeCycleInter2,InitializingBean,DisposableBean
										,BeanNameAware,ApplicationContextAware	{
	private String typename;
	private String beanname;
	private ApplicationContext ctx;
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
		System.out.println(typename +",execute 실행");
		System.out.println("bean Name : " + beanname);
		OtherBean otBean = ctx.getBean("other",OtherBean.class);
		System.out.println("Res : " + otBean.getMsg());
	}
//
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("init호출 : 초기화!");
	}

	public void setTypename(String typename) {
		this.typename = typename;
		System.out.println("setter호출 : DI!");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destory호출");
		
	}
	//살아있는놈임.
	@Override
	public void setBeanName(String name) {
	beanname = name;
	}
	
	
	//이게 정석대로 안하는 방법중 하나인데 이런 방식을 추가시킴
	//현재 실행되고 있는 스프링컨테이너의 주소를 주입!
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		ctx = applicationContext;
	}

}
