package ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloMain {
	//ApplicationContext -> BeanFactory를 상속받은 컨테이너
	//국제화 지원, 빈을 생성 담당한다든지.....
	//GenericXmlApplicateionContext : jdk5 부터 지원해주는 제네릭을 제공 해주는 컨테이너 구현객체
	//spring3.0부터 지원!
	public static void main(String[] args) {
		// 1. 컨테이너 등록 및 생성
		ApplicationContext ctx = new GenericXmlApplicationContext("ex1/hello.xml");
		// 2. 컨테이너에 등록된 필요한 개게를 참조
		HelloBean hBean = ctx.getBean("hello", HelloBean.class);
		// 3. 잘 사용
		String msg = hBean.printMessage();
		System.out.println(msg);
		HelloBean hBean2 = ctx.getBean("hello", HelloBean.class);
		// 싱글톤 테지스터리에 저장되기 때문에 알아서 싱글톤으로 관리(기본값)
		System.out.println("비교: "+(hBean==hBean2));	//true
	}
}
