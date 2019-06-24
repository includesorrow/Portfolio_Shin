package kr.or.kosta.mvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ModelDemoController {
	//View로 값을 전달 하기 위한 Model 인터페이스를 인자로 전달 받기
	@RequestMapping(value="/momo1")
	public String modeldemo1(Model m) {
		m.addAttribute("msg", "Hello ~ Spring!");
		return "modeldemo1";	
	}
	@RequestMapping(value="/momo2")
	public ModelAndView modeldemo1() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("modeldemo1");
		mav.addObject("msg", "Hello2 ~ Spring!");
		return mav;
	}
	
	@RequestMapping(value="/today")
	public String todayPrint(Model m) {
//		m.addAttribute("today", new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		m.addAttribute("msg", "Hello ~ Today Spring!");
		return "today";
	}
	
	@RequestMapping(value="/tomsg")
	public String todayMessage(Model m) {
//		m.addAttribute("today", new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		m.addAttribute("msg", "Hello!! ~ Today Message!");
		return "today";
	}
}
