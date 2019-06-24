package kr.or.kosta.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.or.kosta.dto.DeptVO;
import kr.or.kosta.dto.SawonVO;
import kr.or.kosta.mvc.dao.SawonDao;

@Controller
public class SawonController {
	
	@Autowired
	private SawonDao sawonDao;
	
	@GetMapping("/deptlist")
	public String resultMap1(Model m) {
		List<DeptVO> list = sawonDao.getDeptList();
		m.addAttribute("dlist", list);
		return "deptlist";
	}
	
	//2번째 예제 ResultMap
	@GetMapping("/sphoneForm")
	public String sawonphoneForm() {
		return "sphForm";
	}
	
	@PostMapping("/sPhone")
	public String sawonPhone(int sabun, Model m) {
		SawonVO v = sawonDao.getSawonPhone(sabun);
		m.addAttribute("sawon", v);
		return "sawonPhone";
	}
	
	@GetMapping("/sPoneList")
	public String sawonPoneList(Model m) {
		List<SawonVO> list = sawonDao.getSawonPhoneList();
		m.addAttribute("splist",list);
		return "sawonPhoneList";
	}
	
	   @GetMapping("/deptchForm")
	   public String deptChooseFrom() {
	      return "deptchooseForm";
	   }
	   
	   @PostMapping("/deptalllist")
	   public ModelAndView deptAllList(int deptno) {
	      ModelAndView mav = new ModelAndView("deptallList");
	      DeptVO list = sawonDao.getDeptAllList(deptno);
	      mav.addObject("dlist",list);
	      return mav;
	   }
	   
	   @GetMapping("/deptchForm2")
	   public String deptChooseFrom2() {
	      return "deptchooseForm2";
	   }

	   @PostMapping("deptswphlist")
	   public ModelAndView deptsawonphoneList(int deptno) {
	      ModelAndView mav = new ModelAndView("deptsawonphoneList");
	      
	      DeptVO list = sawonDao.getDeptSawonPhoneSearch(deptno);
	      mav.addObject("dlist",list);
	      System.out.println(list.getSawon());
	      System.out.println(list.getDeptno());
	      System.out.println(list.getDname());
	      System.out.println(list.getLoc());
	      return mav;
	   }
}
