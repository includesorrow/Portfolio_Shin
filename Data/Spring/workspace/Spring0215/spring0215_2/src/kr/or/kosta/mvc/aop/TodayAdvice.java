package kr.or.kosta.mvc.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@Aspect
public class TodayAdvice {
	
	@Before("execution(* kr.or.kosta.mvc.controller.*.today*(..))")
	public void today(JoinPoint jp) {
		Object[] fd = jp.getArgs();
		if(fd[0] instanceof Model) {
			Model m = (Model) fd[0];
			m.addAttribute("today",new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		}
	}
	
	@AfterReturning(pointcut="execution(* kr.or.kosta.mvc.controller.*.*noparam*(..))",returning="msg")
	public void agter(JoinPoint jp,Object msg) {
		ModelAndView m = (ModelAndView) msg;
		m.setViewName("msg2");
	}
}
