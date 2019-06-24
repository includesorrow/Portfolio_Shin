package kr.or.kosta.mvc.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.or.kosta.dto.SawonVO;
import kr.or.kosta.mvc.dao.DynamicExampleDao;

@Controller
public class DynamicExample {
	@Autowired
	private DynamicExampleDao dao; 
	
	@GetMapping(value={"/sawonlist"})
	public String sawonList(Model m) {
		Map<String, String> map= new HashMap<String, String>();
		m.addAttribute("list",dao.getSawonList(map));
		return "sawonlist";
	}
	
	@PostMapping("/dyex1")
	public String searchSaname(String saname,Model m) {
		Map<String, String> map= new HashMap<String, String>();
		map.put("saname", saname);
		m.addAttribute("list",dao.getSawonList(map));
		return "sawonlist";	}
	
	@GetMapping(value={"/sawonlist2","/dyex2"})
	public String sawonList2(Model m) {
		Map<String, String> map= new HashMap<String, String>();
		m.addAttribute("list",dao.getSawonList2(map));
		return "sawonlist2";
	}
	@PostMapping("/dyex2")
	public String searchSaname2(String saname,String sajob,Model m) {
		Map<String, String> map= new HashMap<String, String>();
		map.put("saname", saname);
		map.put("sajob", sajob);
		m.addAttribute("list",dao.getSawonList2(map));
		return "sawonlist2";
		}
	
	@GetMapping(value={"/sawonlist3","/dyex3"})
	public String sawonList3(Model m) {
		Map<String, String> map= new HashMap<String, String>();
		m.addAttribute("list",dao.getSawonList3(map));
		return "sawonlist3";
	}
	@PostMapping("/dyex3")
	public String searchSaname3(String searchType,String search,Model m) {
		Map<String, String> map= new HashMap<String, String>();
		map.put("searchType", searchType);
		map.put("search", search);
		m.addAttribute("list",dao.getSawonList3(map));
		m.addAttribute("searchType",searchType);
		return "sawonlist3";
	}

	@GetMapping(value= {"/dynamicfor","/dyfor"})
	public String sawonList4(Model m) {
//		Map<String,List<String>> map = new HashMap<String, List<String>>();
		
		Map<String,List<String>> map = new HashMap<>();
		List<String> list = new ArrayList<>();
		map.put("dept_list", list);
		
		m.addAttribute("list",dao.getSawonForeachList(map));
		return "dynamicSawonForeachList";
	}
		
	
	@PostMapping("/dyfor")
	public String dynamicForQuery(String[] dlist, Model model) {
		Map<String,List<String>> map = new HashMap<>();
		List<String> dept_list=null;
		try{
			dept_list = Arrays.asList(dlist);
		}catch (Exception e){
			dept_list = new ArrayList<>();
		}
		map.put("dept_list",dept_list);
		List<SawonVO> list = 
				dao.getSawonForeachList(map);
		model.addAttribute("list",list);
		return "dynamicSawonForeachList";
		
	
	}
	
}
