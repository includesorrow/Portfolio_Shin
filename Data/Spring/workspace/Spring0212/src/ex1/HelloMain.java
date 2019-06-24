package ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloMain {
	public static void main(String[] args) {
		//ApplicationContext -> BeanFactory를 상속받은 컨테이너
		//국제화지원, 빈을 생성 담당한다든지...
		//(Spring3.0~) GenericXmlApplicationContext = 
		//JDK5부터 지원해주는 제네릭을 제공해주는 컨테이너 구현객체
		//
		
		
		
		//1. 컨테이너 등록 및 생성 (모든 빈들이 생성)
		ApplicationContext ctx = new GenericXmlApplicationContext("ex1/hello.xml");
		//2. 컨테이너에 등록된 필요한 객체를 참조
		HelloBean hBean = ctx.getBean("hello", HelloBean.class);
		//3. 잘 사용
		String msg = hBean.printMessage();
		System.out.println(msg);
		
		
		 /* 최상위 : BeanFactory (추상,상위개념이기 때문에 사용은안한다)
		 * instance 반환
		 * Object getBean(String name) 
		 * 
		 */
		/*
		 * 프로그램이 실행되면 컨테이너 생성
		 * 힙 영역에 HelloBean 생성
		 * 단 new HelloBean()으로 가지고 있지 않고 싱글톤으로
		 * static영역에 넣어 두고 참고하는 기술이 싱글톤리스트
		 * 그래서 레퍼런스
		 ****GETBEAN은 생성이 아님. 미리 생성하는 개념임.
		 *ApplicationContext ctx = new GenericXmlApplicationContext("ex1/hello.xml");
		 *이것만 있어도 출력이 hELLObEAN 생성! 이라는 문구가 뜸
		 *
		 */
		
		//증명
		
		HelloBean hBean2 = ctx.getBean("hello", HelloBean.class);
		HelloBean hBean3 = ctx.getBean("hello", HelloBean.class);
		//싱글톤 레지스터리에 저장되기 때문에 알아서 싱글톤으로 관리
		System.out.println("비교 : " + (hBean2 == hBean3));
		//TURE값 출력
		
	}
}
