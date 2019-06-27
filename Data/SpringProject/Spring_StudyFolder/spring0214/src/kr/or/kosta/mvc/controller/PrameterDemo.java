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
	
	//Spring�� �Ķ���� ���� �ڵ����� ó�����ش�.
	@RequestMapping(value="/todayMessage")
	public String todayParam(Model m, String msg) {
		m.addAttribute("msg", msg);
		return "msg";
	}
	//VO�Ķ���͵� �ڵ����� ó���� ���ش�!
	@RequestMapping(value="/todayMessage2")
	public String todayParam2(Model m, MyMemberVO v) {
		m.addAttribute("vo", v);
		return "msg2";
	}
}
