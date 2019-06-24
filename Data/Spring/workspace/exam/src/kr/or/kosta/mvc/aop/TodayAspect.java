package kr.or.kosta.mvc.aop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

@Component 
@Aspect 
public class TodayAspect {
	
	@Before("execution(* kr.or.kosta.mvc.controller.*.today*(..))")
	public void before(JoinPoint jp) {
		Object[] fd = jp.getArgs();
		if(fd[0] instanceof Model) {
			Model m = (Model) fd[0];
			m.addAttribute("today", new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		}
	}

	

	//argument�� Model m ���� ���ְڴٴ� �ǹ�
	//AOP����
	/*
	 * todayMessage(Model m, ~~~�̷������� �ؾ���)
	 * todayMessage(String mm, model m << �̷����� �ȵ�.
	 * �𵨷� ó���Ǳ� ���� ��ó���Ҳ��� ��ó���Ҳ��ĸ� ���µ� before�ϱ� ��ó���̴�. 
	 */
	
	/*
	 * �Ű������� ���� ���� joinPoint.getArgs() �� ����, ���� �޼ҵ尡 ���� �Ű� ������ �޾� �� �� �ְ�, Object �̹Ƿ� �� ��ȯ�� ����� �Ѵ�.
	 */
	
	
}
