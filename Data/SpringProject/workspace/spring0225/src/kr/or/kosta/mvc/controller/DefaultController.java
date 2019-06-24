package kr.or.kosta.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DefaultController {
	@GetMapping("/")
	public String defaultView() {
		return "index";
	}

	@GetMapping("/url")
	public String showUrl() {
		return "url";
	}
	
	@GetMapping("/ex1")
	public String showEx1() {
		return "ex1";
	}
	
	@GetMapping("/exam1")
	public String showExam1() {
		return "exam1";
	}
	
	@GetMapping("/jQuerydemo1")
	public String showJQuerydemo1() {
		return "jQuerydemo1";
	}
	
	@GetMapping("{path}")
	public String showEx(@PathVariable String path) {
		return path;
	}

}
