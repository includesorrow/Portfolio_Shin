package life2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;

//InitializingBean -> afterPropertiesSet
//DisposableBean -> destroy()
//BeanNameAware -> setBeanName(String name)
// ������ �����̳ʿ��� �����Ǵ� bean ���� id, name�� ������ Ȯ�� �� �� �������ִ� �������̽��̴�.
//BeanFactoryAware -> 
//ApplicationContextAware -> setApplicationContext(ApplicationContext)
//ApplicationContext -> ������ �����̳ʸ� ���� ����Ϸ��� �Ҷ�

import org.springframework.context.ApplicationContextAware;

public class LifeCycleImple2
		implements LifeCycleInter2, InitializingBean, DisposableBean, BeanNameAware, ApplicationContextAware {

	private String beanname;
	private String typename;
	private ApplicationContext ctx;

	public void setTypename(String typename) {
		this.typename = typename;
		System.out.println("setterȣ�� : DI!");
	}

	@Override
	public void execute() {
		System.out.println(typename + ", execute ����");
		System.out.println("Bean Name : "+beanname);
		OtherBean otBean = ctx.getBean("other",OtherBean.class);
		System.out.println("Res : "+otBean.getMsg());
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("initȣ�� : �ʱ�ȭ!");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroyȣ�� : �ʱ�ȭ");
	}

	@Override
	public void setBeanName(String name) {
		beanname = name;
	}
	// ���� ����ǰ� �ִ� �����������̳��� �ּҸ� ����!
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		ctx = applicationContext;
	}
}
