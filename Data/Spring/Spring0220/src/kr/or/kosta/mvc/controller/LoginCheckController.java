package kr.or.kosta.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.or.kosta.dto.MemberVO;
import kr.or.kosta.mvc.dao.MemberDaoInter;

@Controller
public class LoginCheckController {
	   //Dao 주입
  @Autowired
  private MemberDaoInter memberDaoInter;
  
	 
	@RequestMapping(value="/mykosta")
	public String loginForm() {
		return "loginForm";
	}
	 
	@PostMapping("/loginProcess")
	public ModelAndView loginfProcess(HttpSession session, 
			HttpServletRequest request, MemberVO vo,
			@RequestHeader("User-Agent") String userAgent) {
		System.out.println("id " + vo.getId());
		System.out.println("pwd" + vo.getPassword());
		System.out.println("userAgent:" + userAgent);
		MemberVO map = memberDaoInter.loginCheck(vo);
		ModelAndView mav = new ModelAndView();
		if(map==null) {
			mav.setViewName("error");
		} else { //로그인 성공
				session.setAttribute("uname", map.getName());
				session.setAttribute("uid", vo.getId());
				mav.setViewName("index");
				
		}
		
		return mav;
		
	}
	
	@GetMapping("/logout")
	public ModelAndView loginfoutProcess(HttpSession session, HttpServletRequest request) {
		session.removeAttribute("uname");
		session.removeAttribute("uid");//로그인한 사용자의 세션 삭제
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/");
		return mav;
	}
	
	@GetMapping("/idcheck")
	public String idCheck(Model m, String id) {
		int cnt = memberDaoInter.idChk(id);
		String msg ="이미 사용중인 아이디입니다.";
		System.out.println("if문 밖에");
		System.out.println(cnt);
		if(cnt==0) {
			
			msg="사용 가능한 아이디입니다.";
		}
		m.addAttribute("cnt",cnt);
		return "idchk/idchk"; 
	}
	
	
	@GetMapping("/jqueryMain")
	public String board() {
		return "board";
	}
	
	@GetMapping("/setwrite")
	public String write() {
		return "Write";
	}
	
}
