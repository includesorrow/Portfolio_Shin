package aop.ex1;

public class DaoImple implements DaoInter{

	
	@Override
	public void first() {
		//long start = System.currentTimeMillis();
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i+" ");
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("End!");
		//long end = system.currentTimeMillis();
		
		/*
		 * 관점지향의 코딩이다.
		 * 여기서 long start 는 체크어드바이스(어라운드어드바이스)의 비포어드바이스을 실행시켜주고
		 * long end는 체크어드바이스의 애프타어드바이스를 실행시켜준다.
		 * 그게 가능한 이유는 ,,,?
		 * 
		long start = System.currentTimeMillis();
		
		//타겟의 메서드를 호출
		
		pjp.proceed();
		=>이부분이 for문임.
		long end = System.currentTimeMillis();
		System.out.println((end-start)+"초");
		 * 
		 * 
		 */
	}

	@Override
	public String second() {
		StringBuffer sb = new StringBuffer();
		sb.append("------------").append("\n");
		sb.append("김길동").append("\n");
		sb.append("------------").append("\n");
		return sb.toString();
	} 

	@Override
	public void third() {
		String[] ar = {"메세지1", "메세지2", "메세지3","메세지4","메세지5"};
		for(int i = 0; i<=ar.length; i++) {
			System.out.println("비즈니스 로직의 " + ar[i]);
		}
		
	}
//관점지향으로 작업하는거임.
	
	
	
	
}
