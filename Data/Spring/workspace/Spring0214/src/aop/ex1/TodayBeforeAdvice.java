package aop.ex1;

import org.aspectj.lang.JoinPoint;
import org.springframework.beans.factory.annotation.Autowired;

public class TodayBeforeAdvice {

	
	//������̾��
	//�ڵ����� ���� ���Թ���
	//advice�� DI�� ���� ���� �ִ�.
	
	@Autowired
	private MyPublic mypublic;
	
	public void beforeToday(JoinPoint jp) {
		System.out.println(mypublic.todayMethod());
	}
	
}
