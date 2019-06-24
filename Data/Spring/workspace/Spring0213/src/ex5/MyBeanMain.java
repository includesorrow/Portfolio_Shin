package ex5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MyBeanMain {
public static void main(String[] args) {
	ApplicationContext ctx = new GenericXmlApplicationContext("ex5/xml.xml");
	MyBeanInter mbi = ctx.getBean("pfBean",MyBeanInter.class);
	///MyBeanInter.class�� Ÿ������ �����´�.(+�����ؼ�)
	//Ÿ�ٻ���
	System.out.println(mbi.myGetMessage("��浿"));
	//before,after ��ü �ȿ� ��浿�̶�°��� �ִ´�.
}

/*
 * Log---------
�޼��� �̸� : myGetMessage
���� Ÿ�� : class java.lang.String
Target�� �ּ�ex5.MyBeanImple  
ID : ��浿


End--------------------
----before advice----

null
----����Ͻ�����---

�޼����� ����
Methodclass java.lang.String
ReturnMessage : test�ٽ� ���� ����!
Message : test�ٽ� ���� ����!
----after advice----
 */



}

     