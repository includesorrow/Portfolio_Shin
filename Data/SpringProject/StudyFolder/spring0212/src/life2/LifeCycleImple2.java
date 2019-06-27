package life2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;

//InitializingBean -> afterPropertiesSet
//DisposableBean -> destroy()
//BeanNameAware -> setBeanName(String name)
// 스프링 컨테이너에서 관리되는 bean 내부 id, name의 정보를 확인 할 때 제공해주는 인터페이스이다.
//BeanFactoryAware -> 
//ApplicationContextAware -> setApplicationContext(ApplicationContext)
//ApplicationContext -> 스프링 컨테이너를 직접 사용하려고 할때

import org.springframework.context.ApplicationContextAware;

public class LifeCycleImple2
		implements LifeCycleInter2, InitializingBean, DisposableBean, BeanNameAware, ApplicationContextAware {

	private String beanname;
	private String typename;
	private ApplicationContext ctx;

	public void setTypename(String typename) {
		this.typename = typename;
		System.out.println("setter호출 : DI!");
	}

	@Override
	public void execute() {
		System.out.println(typename + ", execute 실행");
		System.out.println("Bean Name : "+beanname);
		OtherBean otBean = ctx.getBean("other",OtherBean.class);
		System.out.println("Res : "+otBean.getMsg());
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("init호출 : 초기화!");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy호출 : 초기화");
	}

	@Override
	public void setBeanName(String name) {
		beanname = name;
	}
	// 현재 실행되고 있는 스프링컨테이너의 주소를 주입!
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		ctx = applicationContext;
	}
}
