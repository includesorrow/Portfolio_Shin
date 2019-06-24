package kr.or.kosta.mvc.ex1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.kosta.mvc.ex1.model.ModelInter;

@Controller
public class SpringController {

	@Autowired
	private ModelInter modelInter;
	
	@RequestMapping(value="/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="/dyex11")
	public String dyex1() {
		return "dynamicExample1";
	}
	
}
