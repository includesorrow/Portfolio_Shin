package kr.or.kosta.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * DispatcherServlet ��û�� �����ϴ� ��
 * RequestMapping => HandlerMapping
 * 
 * */
@Controller 
public class HelloController {
	
	//MedelAndView, View ��ȯ
	@RequestMapping(value="/")
	public String myHello() {
		return "index"; //view �� �̸��� ��ȯ
	}
	
	@GetMapping(value="csv")
	public String csv() {
		return "d3Test";	
	}
}