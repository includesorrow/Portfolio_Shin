package kr.or.kosta.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.or.kosta.dto.CustomerVO;
import kr.or.kosta.dto.MemberVO;
import kr.or.kosta.mvc.service.ServiceInter;

@Controller
public class TxServiceController {

	@Autowired
	private ServiceInter service;
	@RequestMapping(value="txf")
	public String viewForm() {
		return "txForm";
	} 
	//getmapping대처가능
	
	@RequestMapping(value="testTx",method=RequestMethod.POST)
	public ModelAndView addAll(MemberVO mvo, CustomerVO cvo) throws Exception{
		ModelAndView mav = new ModelAndView("res");
		System.out.println("addr1 : " + mvo.getAddress());
		System.out.println("addr2 : " + cvo.getAddress());
		//db작업
		service.addAll(mvo,cvo);
		mav.addObject("msg","success");
		return mav;
	}
	//postmapping 사용가능
	
}
