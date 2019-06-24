package ex5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MyBeanMain {
public static void main(String[] args) {
	ApplicationContext ctx = new GenericXmlApplicationContext("ex5/xml.xml");
	MyBeanInter mbi = ctx.getBean("pfBean",MyBeanInter.class);
	///MyBeanInter.class를 타겟으로 가져온다.(+압축해서)
	//타겟생성
	System.out.println(mbi.myGetMessage("김길동"));
	//before,after 전체 안에 김길동이라는것을 넣는다.
}

/*
 * Log---------
메서드 이름 : myGetMessage
리턴 타입 : class java.lang.String
Target의 주소ex5.MyBeanImple  
ID : 김길동


End--------------------
----before advice----

null
----비즈니스로직---

메서드의 정보
Methodclass java.lang.String
ReturnMessage : test핵심 로직 수행!
Message : test핵심 로직 수행!
----after advice----
 */



}

     