package kr.or.kosta.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ModelDemoController {
	//view로 값을 전달하기 위한 model 인터페이스를 인자로 전달 받기
	@RequestMapping(value="/momo1")
	public String modeldemo1(Model m) {
		m.addAttribute("msg", "Hello ~ Spring!");
		return "modeldemo1";
	}
	//return modeldemo1 < 뷰의 이름
	@RequestMapping(value="/momo2")
	public ModelAndView modeldemo1() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("modeldemo1");
		mav.addObject("msg","Hello2 ~ Spring!");
		return mav;
	}
	//view에 값을 전달할 때 쓰는 방식
	
	/* 두개의 방식중 하나를 쓰면 된다.
	 */

	
	@RequestMapping(value="/today")
	public String todayPrint(Model m) {
		//m.addAttribute("today", new SimpleDateFormat("yyyy-MM-dd")
		//	.format(new Date());
		m.addAttribute("msg", "Hello ~ Spring!");
		
		return "today";
		//이 view로 갈 때 today라는 이름으로 이 날짜를 보내고 싶은 것이다. 
		//job이 today로 호출이 되는 메서드들임. 
		//request가 들어오면 job으로 적용시키고 싶다. 웹에다가. 
	}
	@RequestMapping(value="/tomsg")
	public String todayMessage(Model m) {
		//m.addAttribute("today", new SimpleDateFormat("yyyy-MM-dd")
		//	.format(new Date());
		m.addAttribute("msg", "Hello3434 ~ Spring!");
		return "today";
	}
	
	
}
