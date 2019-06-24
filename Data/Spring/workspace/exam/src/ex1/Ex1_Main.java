package ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Ex1_Main {
	public static void main(String[] args) {
		
	
	/*
	 * ApplicationContext
	 * - BeanFactory를 상속받은 컨테이너
	 * 국제화 지원해준다.
	 * GenericXmlApplicationContext
	 * JDK 5부터 지원해주는 제네릭을 제공해주는 컨테이너 구현 객체
	 */
	

	//1. 컨테이너 등록 및 생성(모든 빈들이 생성)
	ApplicationContext ctx = new GenericXmlApplicationContext("ex1/ex1xml.xml");
	
	//2. 컨테이너에 등록된 필요한 객체를 참조
	Ex1_Bean ex1bean = ctx.getBean("hello",Ex1_Bean.class);
	//만들기만 하더라도 생성자가 로딩이 된다. 
	//그래서 생성자가 로딩이 되므로 생성자가 출력이 된다.
	
	//3. 잘 사용
	
	
	
	String msa = ex1bean.printMessage();
	System.out.println(msa);
	//ex1bean에 있는 메시지를 프린트해주고 싶다.
	//근데 그걸 msa로 저장한다.
	//ex1bean은 ctx(컨테이너 안에 있는) bean을 가지고 온다.
	//빈의 내용 : "hello", Ex1_Bean.class에 있는 hello란 빈 아이디를 가지고 온다.
	
	
}}
