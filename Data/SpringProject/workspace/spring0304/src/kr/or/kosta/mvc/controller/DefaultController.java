package kr.or.kosta.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DefaultController {
	@GetMapping({"/","/index"})
	public String defaultView() {
		return "index";
	}
	
	@GetMapping("/{path}")
	public String showEx(@PathVariable String path) {
		return path;
	}
	
	@GetMapping("/traffic.load")
	public String mapping1(String idx, Model m) {
		m.addAttribute("idx", idx);
		return "traffic";
	}
}
