package kr.or.kosta.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.or.kosta.mvc.dao.SawonDao;
import kr.or.kosta.vo.DeptVO;
import kr.or.kosta.vo.SawonPhoneVO;
import kr.or.kosta.vo.SawonVO;

@Controller
public class SawonController {

	
	@Autowired
	private SawonDao sawonDao;
	
	//1번째 예제 ResultMap
	@GetMapping("/deptlist")
	public String deptList(Model m) {
		List<DeptVO> list = sawonDao.getDeptList();
		m.addAttribute("dlist",list);
		return "deptList";
		
	}
	
	//2번째 예제 ResultMap
	@GetMapping("/sphoneForm")
	public String sawonphoneForm() {
		return "sphoneForm";
	}
	
	@PostMapping("/sPhone")
	public String sawonPhone(int sabun, Model m) {
		SawonVO v = sawonDao.getSawonPhone(sabun);
		m.addAttribute("sawon",v);
		return "sawonPhone";
	}
	
	//3번째 예제
	@GetMapping("/sPhoneList")
	public String sawonPhoneList(Model m) {
		List<SawonVO> v = sawonDao.getSawonPhoneList();
		m.addAttribute("splist",v);
		return "sawonPhoneList";
	}
	
//	@PostMapping("/examresult")
//	public String examresult(int sabun, Model m) {
//		List<SawonVO> v = sawonDao.getSawonPhoneList();
//		m.addAttribute("sawon",v);
//		return "examresult";
//	}
	
	
	//4번째예제
	
	@GetMapping("/deptchForm")
	public String deptchooseForm() {
		return "deptchooseForm";				
	}
	@PostMapping("/deptallList")
	public ModelAndView deptallList(int deptno) {
		ModelAndView mav = new ModelAndView("deptallList");
		DeptVO list = sawonDao.getDeptAllList(deptno);
		mav.addObject("dlist",list);
		return mav;
	}
	
	
	
	
}
