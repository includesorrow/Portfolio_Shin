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
import kr.or.kosta.mvc.dao.MemberDao;


@Controller
public class LoginCheckControoler {

	// Dao�� ����
	@Autowired
	private MemberDao memberDao;

	@RequestMapping(value = "/mykosta")
	public String loginForm() {
		return "loginform";
	}

	@PostMapping("/loginProcess")
	public ModelAndView loginfProcess(HttpSession sesstion, HttpServletRequest request, MemberVO mvo,
			@RequestHeader("User-Agent") String userAgent) {
		System.out.println("id : " + mvo.getId());
		System.out.println("pwd : " + mvo.getPassword());	
		System.out.println("userAgent : " + userAgent);
		MemberVO map = memberDao.loginCheck(mvo);
		ModelAndView mav = new ModelAndView();
		if (map == null) {
			mav.setViewName("error");
		} else { // �α��� ����
			sesstion.setAttribute("uname", map.getName());
			sesstion.setAttribute("uid", mvo.getId());
			mav.setViewName("index");
		}
		return mav;
	}
	
	@GetMapping("/idcheck")
	public String idCheck(Model m, String id) {
		int cnt = memberDao.idChk(id);
		String msg = "�̹� ������� ���̵� �Դϴ�.";
		System.out.println(cnt);
		if (cnt == 0) {
			msg = "��� ������ ���̵� �Դϴ�.";
			System.out.println(cnt);
		}
		System.out.println(msg);
		
		m.addAttribute("cnt", cnt);
		return "idchk/idchk";
	}

	@GetMapping("/logout")
	public ModelAndView loginfoutProcess(HttpSession session, HttpServletRequest request) {
		System.out.println("���������� �α׾ƿ� �Ǿ����ϴ�.");
		session.removeAttribute("uname");
		session.removeAttribute("uid"); // �α����� ������� ���� ����
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/");
		return mav;
	}
}
