package kr.or.kosta.mvc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/*
 * DispatcherServlet 요청에 응답하는 모델
 * RequestMapping => HandlerMapping
 * 
 * */
@Controller
public class DefaultController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/ex1")
	public String Ex1() {
		
		return "ex1";
	}
	
	@RequestMapping("/ex2")
	public String ex2() {
		return "ex2";
	}
	
	
	@RequestMapping("/jQueryDemo1")
	public String jQueryDemo() {
		
		return "jQueryDemo1";
	}

	
	@RequestMapping("/jQueryDemoExam1")
	public String jqdexam() {
		return "jQueryDemoExam1";
	}
	
	@RequestMapping("/jQueryDemoExamAnswer1")
	public String jqdexamanswer1() {
		return "jQueryDemoExamAnswer1";
	}
	
	
	@GetMapping("ex/{path}")
	public String ex1(@PathVariable String path) {
		return path;
	}
	
	@GetMapping("/exam1")
	public String exam1() {
		return "exam1";
	}
	
	@GetMapping("/ex3")
	public String ex3() {
		return "ex3";
	}
	

	
	
	
	
	
}