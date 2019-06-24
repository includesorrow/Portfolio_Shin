package kr.or.kosta.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.kosta.vo.MyMemberVO;

@Controller
public class PrameterDemo {
	@RequestMapping(value="/form")
	public String formParam() {
		return "formMsg";
	}
	
	//Spring은 파라미터 값을 자동으로 처리해준다.
	@RequestMapping(value="/todayMessage")
	public String todayParam(Model m, String msg) {
		m.addAttribute("msg", msg);
		return "msg";
	}
	//VO파라미터도 자동으로 처리를 해준다!
	@RequestMapping(value="/todayMessage2")
	public String todayParam2(Model m, MyMemberVO v) {
		m.addAttribute("vo", v);
		return "msg2";
	}
}
