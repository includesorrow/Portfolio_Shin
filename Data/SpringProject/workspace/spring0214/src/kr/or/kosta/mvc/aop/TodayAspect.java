package kr.or.kosta.mvc.aop;

import java.text.SimpleDateFormat;
import java.util.Date;

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
}
