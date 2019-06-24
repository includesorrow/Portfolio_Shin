package kr.or.kosta.mvc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.or.kosta.dto.CustomerVO;
import kr.or.kosta.dto.JsonVO;

@Controller
public class AndroidRequest1Controller {

	@GetMapping("/value1")
	public String ex1_hello(String msg, Model m) {
		String contents = msg + ": Walk up!";
		System.out.println("Message: " + msg);
//		m.addAttribute("contents", contents);
//		return "app1";
		return contents;
	}

	@GetMapping("/value2")
	@ResponseBody
	public Map<String, String> ex_hello() {
		Map<String, String> map = new HashMap<>();
		map.put("1", "kosta188");
		map.put("2", "kosta198");
		map.put("3", "kosta208");
		return map;
	}

	@GetMapping("/value3")
	@ResponseBody
	public List<Map<String, String>> ex_hello2() {
		Map<String, String> map1 = new HashMap<>();
		map1.put("1", "bigdate1");
		map1.put("2", "bigdate2");
		map1.put("3", "bigdate3");

		Map<String, String> map2 = new HashMap<>();
		map2.put("1", "bigdate1");
		map2.put("2", "11");
		map2.put("3", "±è±æµ¿");

		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		list.add(map1);
		list.add(map2);
		return list;
	}

	@GetMapping("/valjson")
	@ResponseBody
	public JsonVO getJsonVO() {
		List<CustomerVO> list = new ArrayList<>();
		
		for (int i = 0; i < 3; i++) {
			CustomerVO vo = new CustomerVO();
			vo.setName("±è±æµ¿" + i);
			vo.setNum((i + 1));
			vo.setAddress("°¡»ê" + i);
			vo.setName("801211-121212" + i);
			list.add(vo);
		}
		JsonVO jvo = new JsonVO();
		jvo.setList(list);
		jvo.setSuccess(true);
		jvo.setTotal_cnt(list.size());

		return jvo;
	}
}
