package kr.or.kosta.mvc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * DispatcherServlet 요청에 응답하는 모델
 * RequestMapping => HandlerMapping
 * 
 * */
@Controller
public class DefaultController {

	// 기본페이지 설정
	@RequestMapping(value = { "/index", "/" })
	public String defaultPage() {
		System.out.println("test");
		return "index";
	}

	@RequestMapping(value = "/myindex")
	public String myDefaultView() {
		return "index";
	}
}