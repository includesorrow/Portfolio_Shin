package life2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
//InitializingBean -> afterPropertiesSet�� �����Ǹ� ��
//DisposableBean -> Destroy()
//beanNameAware -> setBeanName(String name)
//������ �����̳ʿ��� �����Ǵ� bean ���� id, name
//�� ������ Ȯ���ϰ� ���� �� �������ִ� �������̽�
//beanFactoryAware ->  
//setApplicationContextAware -> setApplicationContext(ApplicationContext applicationContext) 
//ApplicationContext -> ������ �����̳ʸ� ���� ����ҷ��� �� �� ���
//���丮���� Applicationcontext�� �� ����

/*
 * BeanFactory
 * ApplicationContext
 * 
 * ������ �����̳� : �������� ������ ����ϴ� (DI��ų ����� �Ǵ�)
 *  ������ �����̳� �ȿ� DI �ȿ� ���� �� �ִ� �͵� �� ������ �ִ�.
 * Aware : �˷��ִ� �������̽�
 */
public class LifeCycleImple2 implements LifeCycleInter2,InitializingBean,DisposableBean
										,BeanNameAware,ApplicationContextAware	{
	private String typename;
	private String beanname;
	private ApplicationContext ctx;
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
		System.out.println(typename +",execute ����");
		System.out.println("bean Name : " + beanname);
		OtherBean otBean = ctx.getBean("other",OtherBean.class);
		System.out.println("Res : " + otBean.getMsg());
	}
//
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("initȣ�� : �ʱ�ȭ!");
	}

	public void setTypename(String typename) {
		this.typename = typename;
		System.out.println("setterȣ�� : DI!");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destoryȣ��");
		
	}
	//����ִ³���.
	@Override
	public void setBeanName(String name) {
	beanname = name;
	}
	
	
	//�̰� ������� ���ϴ� ����� �ϳ��ε� �̷� ����� �߰���Ŵ
	//���� ����ǰ� �ִ� �����������̳��� �ּҸ� ����!
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		ctx = applicationContext;
	}

}
