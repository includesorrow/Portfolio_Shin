package kr.or.kosta.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/*
 * DispatcherServlet ��û�� �����ϴ� ��
 * RequestMappng => HandlerMapping
 */
@Controller
public class HelloController {
	// ModelAndView, View ��ȯ
	@RequestMapping(value="/")
	public String myHello() {
		return "index";	// view�� �̸��� ��ȯ
	}
}
