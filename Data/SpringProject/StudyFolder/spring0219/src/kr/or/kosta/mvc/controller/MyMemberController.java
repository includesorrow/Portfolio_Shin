package kr.or.kosta.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.kosta.dto.MyMemVO;
import kr.or.kosta.mvc.dao.MemberDaoInter;

@Controller
public class MyMemberController {

	// Dao를 주입
	@Autowired
	private MemberDaoInter memberDaoInter;

	// form
	@GetMapping("/member")
	public String myMemberForm() {
		return "member";
	}

	@PostMapping("/memberjoin")
	public String myMemberJoin(Model m, MyMemVO vo) {
		System.out.println(vo.getId());
		System.out.println(vo.getName());
		System.out.println(vo.getPwd());
		System.out.println(vo.getNum());
		System.out.println(vo.getPwd());
		System.out.println(vo.getTel());
		System.out.println(vo.getPost());
		System.out.println(vo.getAddr1());
		System.out.println(vo.getAddr2());

		memberDaoInter.addMem(vo);

		return "success";
	}

	@GetMapping("/idcheck")
	public String idCheck(Model m, String id) {
		int cnt = memberDaoInter.idChk(id);
		String msg = "이미 사용중인 아이디 입니다.";
		if (cnt == 0) {
			msg = "사용 가능한 아이디 입니다.";
		}
		System.out.println(msg);
		m.addAttribute("cnt", cnt);
		return "idchk";
	}
}
