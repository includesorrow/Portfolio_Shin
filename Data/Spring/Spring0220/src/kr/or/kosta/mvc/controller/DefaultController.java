package kr.or.kosta.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.kosta.dto.MemberVO;
import kr.or.kosta.mvc.dao.MemberDao;

/*
 * DispatcherServlet 요청에 응답하는 모델
 * RequestMapping => HandlerMapping
 * 
 * */
@Controller 
public class DefaultController {
	
//	//MedelAndView, View 반환
//	@GetMapping(value="/")
//	public String myHello() {
//		return "index"; //view 의 이름을 반환
//	}
//	
	
	private MemberDao dao;
	
	@GetMapping("/")
	public String defaultView() {
		return "index";
	}
	
	@GetMapping("/voteform")
	public String MyMemberForm() {
		
		return "member";
	}
	
	@GetMapping("/checkwrite")
	public String checkwrite() {
		return "checkwrite";
	}
	
	
	@RequestMapping(value="/myindex")
	public String myDefaultView() {
		return "index";
	}
	
	@RequestMapping(value="/mytest")
	public String myDefaultView1() {
		return "index";
	}
	
	
	
	
}