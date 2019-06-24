package kr.or.kosta.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.or.kosta.dto.MyMemVO;
import kr.or.kosta.mvc.dao.MemberDaoInter;

@Controller
public class MyMemberController {
	
	@Autowired
	private MemberDaoInter memberDaoInter;
	
	@GetMapping("/member")
	public String MyMemberForm() {
		
		return "member";
	}
	
	@PostMapping("/memberjoin")
	public String myMemberJoin(Model m, MyMemVO vo) {
		System.out.println(vo.getId());
		System.out.println(vo.getAddr1());
		System.out.println(vo.getTel());
		memberDaoInter.addMem(vo);
		return "success";
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
		return "idchk"; 
	}
	
	@GetMapping("/setwrite")
	public String setwrite() {
		return "
	}
	
}
