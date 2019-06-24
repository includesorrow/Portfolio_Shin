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
	
	@GetMapping("/{path}")
	public String showEx(@PathVariable String path) {
		return path;
	}

}
