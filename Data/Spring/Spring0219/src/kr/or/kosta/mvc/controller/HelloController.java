package kr.or.kosta.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * DispatcherServlet 요청에 응답하는 모델
 * RequestMapping => HandlerMapping
 * 
 * */
@Controller 
public class HelloController {
	
	//MedelAndView, View 반환
	@RequestMapping(value="/")
	public String myHello() {
		return "index"; //view 의 이름을 반환
	}
	
	@GetMapping(value="csv")
	public String csv() {
		return "d3Test";	
	}
}