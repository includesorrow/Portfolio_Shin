package kr.or.kosta.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ModelDemoController {
//view�� ���� �����ϱ� ���� MODEL �������̽��� ���ڷ� ���޹ޱ�
	@RequestMapping(value="/momo1")
	public String modeldemo1(Model m) {
		m.addAttribute("msg","Hello~ spring!");
		return "modeldemo1";
	}
	@RequestMapping(value="/momo2")
	public ModelAndView modeldemo1() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("modeldemo1");
		mav.addObject("msg","Hello2 ~spring!");
		return mav;
	}
	
	@RequestMapping(value="/today")
	public String todayPrint(Model m) {
//		m.addAttribute("today",new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		m.addAttribute("msg","Hello~ todayspring!");
		return "today";
	}
	@RequestMapping(value="/tomsg")
	public String todayMessage(Model m) {
//		m.addAttribute("today",new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		m.addAttribute("msg","Hello~ tomsgspring!");
		return "today";
	}
}