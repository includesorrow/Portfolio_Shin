package life;

public class LifeCycleImple implements LifeCycleInter {

	private String mytype; // ���������� ���ؼ� ���� ��

	public LifeCycleImple() {
		System.out.println("������ ȣ��!");
	}

	public void setMytype(String mytype) {
		this.mytype = mytype;
		System.out.println("setterȣ�� : DI!");
	}

	@Override
	public void init() {
		System.out.println("initȣ�� : �ʱ�ȭ!");
	}

	@Override
	public void destory() {
		System.out.println("destoryȣ�� : ����!");
	}

	@Override
	public void execute() {
		System.out.println("mytype : " + mytype);
	}
}
