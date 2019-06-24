package kr.or.kosta.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.or.kosta.dto.MyMemVO;
import kr.or.kosta.mvc.dao.MemberDaoInter;

@Controller
public class LoginCheckController {
  @Autowired
  private MemberDaoInter memberDaoInter;
  
	 
	@RequestMapping(value="/loginForm")
	public String loginForm() {
		return "loginForm";
	}
	 
	@PostMapping("/loginProcess")
	public ModelAndView loginfProcess(HttpSession session, 
			HttpServletRequest request, MyMemVO vo,
			@RequestHeader("User-Agent") String userAgent) {
		System.out.println("id " + vo.getId());
		System.out.println("pwd" + vo.getPwd());
		System.out.println("userAgent:" + userAgent);
		MyMemVO map = memberDaoInter.loginCheck(vo);
		ModelAndView mav = new ModelAndView();
		if(map==null) {
			mav.setViewName("error");
		} else { //�α��� ����
				session.setAttribute("uname", map.getName());
				session.setAttribute("uid", vo.getId());
				mav.setViewName("index");
				
		}
		
		return mav;
		
	}
	
	@GetMapping("/logout")
	public ModelAndView loginfoutProcess(HttpSession session, HttpServletRequest request) {
		session.removeAttribute("uname");
		session.removeAttribute("uid");//�α����� ������� ���� ����
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/");
		return mav;
	}
	
	
}
