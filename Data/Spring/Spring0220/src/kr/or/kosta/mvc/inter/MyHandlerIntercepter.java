package kr.or.kosta.mvc.inter;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MyHandlerIntercepter extends HandlerInterceptorAdapter{
//Controller 들어가기 전 접근
	
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
		System.out.println("preHandle 동작!");
		HandlerMethod method = (HandlerMethod) handler;
		System.out.println("Bean : " + method.getBean());
		System.out.println("Method : " + method.getMethod());
	return true;	
	}
	
	//Cotroller의 메서드의 처리가 종료된 이후 return View가 실행되기 직전
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,ModelAndView modelAndView) throws Exception{
		System.out.println("viewname : " + modelAndView.getViewName());
		modelAndView.addObject("today",new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
	}
	
	//Controller가 수행된 후 View 처리까지 끝난 뒤 호출
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception{
	System.out.println("afterCompletion 실행!");	
	}
	
}
