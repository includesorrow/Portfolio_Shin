package kr.or.kosta.mvc.controller;

import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class temp_ModelDemoController {
	//View�� ���� �����ϱ� ���� Model�������̽��� ���ڷ� ���� �ޱ�
	
	@RequestMapping(value="/momo1")
	public String modeldemo1(Model m) { //�信 ���� �ѱ涧 ���
		m.addAttribute("msg","Hello ~ Spring");
		//���� �̸�
		return "modeldemo1";	
	}
	
	@RequestMapping(value="/momo2")
	public ModelAndView modeldemo1() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("modeldemo1");
		mav.addObject("msg","Hello2 ~ Spring");
		return mav;
	}
	@RequestMapping(value="/today")
	public String todayPrint(Model m) {
		//m.addAttribute("today",new SimpleDateFormat("yyyy-MM-dd"));
		m.addAttribute("msg","Hello3 ~ today");
		return "today";
	}
	@RequestMapping(value="/tomsg")
	public String todayMessage(Model m) {
		//m.addAttribute("today",new SimpleDateFormat("yyyy-MM-dd"));
		m.addAttribute("msg","Hello4 ~ today message");
		return "today";
	}
	
	
}
