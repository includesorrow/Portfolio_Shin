package life;

public class LifeCycleImple implements LifeCycleInter{

	private String mytype;
	//�������� ���ؼ� ���� ��
	public void setMytype(String mytype) {
	
		this.mytype = mytype;
		System.out.println("setterȣ�� : DI!");
	}
	//�̰� DI��� ��.
	
	@Override
	public void init() {
	System.out.println("INIT ȣ��!");
	System.out.println("�ʱ�ȭ!");
	}

	

	public LifeCycleImple() {
	System.out.println("������ ȣ��!");
	}

	@Override
	public void destory() {
		System.out.println("destroy!");
		
	}

	@Override
	public void execute() {
		System.out.println("execute!");
		
	}
	
	
	
}
