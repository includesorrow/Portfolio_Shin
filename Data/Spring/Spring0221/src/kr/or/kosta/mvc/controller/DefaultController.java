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

import kr.or.kosta.dto.CustomerVO;
import kr.or.kosta.dto.JsonVO;
import kr.or.kosta.dto.MemberVO;

/*
 * DispatcherServlet 요청에 응답하는 모델
 * RequestMapping => HandlerMapping
 * 
 * */
@Controller
public class DefaultController {

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/value1")
	@ResponseBody
	public String ex1_hello(String msg, Model m) {
		String contents = msg + ": Walk up!";
		System.out.println("Message : " + msg);
		// m.addAttrubute("contents", contents);
		// return "app1";
		return contents;
	}

	@GetMapping("/value2")
	@ResponseBody
	public Map<String, String> ex1_hello() {
		Map<String, String> map = new HashMap<>();
		map.put("1", "kosta188");
		map.put("2", "kosta198");
		map.put("3", "kosta208");
		return map;
	}
	
	@GetMapping("/value3")
	@ResponseBody
	public Map<String, String> ex1_helloo() {
		Map<String, String> map = new HashMap<>();
		ArrayList<Object> ar = new ArrayList<>();
		
//		map.put("1", "bigdate1");
//		map.put("2", "bigdate2");
//		map.put("3", "bigdate3");
		ar.add(0,"bigdate1");
		ar.add(1,"bigdate2");
		ar.add(2,"bigdate3");
		map.put("1", (String) ar.get(0));
		map.put("2", (String) ar.get(1));
		map.put("3", (String) ar.get(2));
		return map;
	}
	
	@GetMapping("/value3answer")
	@ResponseBody
	 public List<Map<String, String>> ex1_hello2() {
	      Map<String, String> map = new HashMap<>();
	      ArrayList<Map<String, String>> arr = new ArrayList<>();
	      map.put("1", "bigdate1");
	      map.put("2", "bigdate2");
	      map.put("3", "bigdate3");
	      arr.add(map);
	      System.out.println(map);
	      System.out.println(arr);
	      map = new HashMap<>();
	      map.put("1", "bigdate1");
	      map.put("2", "33");
	      map.put("3", "김길동");
	      arr.add(map);
	      
	      return arr;}

	@GetMapping("/value4")
	@ResponseBody
	public List<Map<String, String>> value4(){
		Map<String, String> map = new HashMap<>();
	    ArrayList<Map<String, String>> arr = new ArrayList<>();
	    map.put("num","1");
	    arr.add(map);
		return arr;
	}
	
	
	@GetMapping("/valjson")
	@ResponseBody
	public JsonVO getJsonVO() {
		List<CustomerVO> list = new ArrayList<>();
		for(int i=0; i<3; i++) {
			CustomerVO vo = new CustomerVO();
			vo.setName("김길동" + i);
			vo.setNum((i+1));
			vo.setAddress("가산" + i);
			vo.setSsn("801211-121212"+i);
			list.add(vo);
		}
		JsonVO jvo = new JsonVO();
		jvo.setList(list);
		jvo.setSuccess(true);
		jvo.setTotal_cnt(list.size());
		return jvo;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}