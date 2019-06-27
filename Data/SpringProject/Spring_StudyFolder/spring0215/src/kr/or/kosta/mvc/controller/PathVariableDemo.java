package kr.or.kosta.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bigdata")
public class PathVariableDemo {

	@GetMapping("/{team:team[A-D]+}")
	public String getTeam1(Model m, @PathVariable String team) {
		m.addAttribute("m", team);
		return "teams";
	}
}
