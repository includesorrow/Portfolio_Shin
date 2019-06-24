package life;

public class LifeCycleImple implements LifeCycleInter {

	private String mytype; // 스프링에서 의해서 받을 값

	public LifeCycleImple() {
		System.out.println("생성자 호출!");
	}

	public void setMytype(String mytype) {
		this.mytype = mytype;
		System.out.println("setter호출 : DI!");
	}

	@Override
	public void init() {
		System.out.println("init호출 : 초기화!");
	}

	@Override
	public void destory() {
		System.out.println("destory호출 : 해제!");
	}

	@Override
	public void execute() {
		System.out.println("mytype : " + mytype);
	}
}
