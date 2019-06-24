package life;

public class LifeCycleImple implements LifeCycleInter{

	private String mytype;
	//스프링에 의해서 받을 값
	public void setMytype(String mytype) {
	
		this.mytype = mytype;
		System.out.println("setter호출 : DI!");
	}
	//이게 DI라고 함.
	
	@Override
	public void init() {
	System.out.println("INIT 호출!");
	System.out.println("초기화!");
	}

	

	public LifeCycleImple() {
	System.out.println("생성자 호출!");
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
