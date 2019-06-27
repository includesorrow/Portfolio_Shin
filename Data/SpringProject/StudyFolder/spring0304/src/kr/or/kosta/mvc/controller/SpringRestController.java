package kr.or.kosta.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.or.kosta.dto.Json2VO;
import kr.or.kosta.dto.Json3VO;

@RestController
@RequestMapping("/members")
public class SpringRestController {
	
	@RequestMapping("/data.json")
	public List<Json2VO> getJson(){
		List<Json2VO> list = new ArrayList<>();
		for(int i=0;i<=12;i++) {
			Json2VO v = new Json2VO();
			v.setKey("Math"+i);
			v.setValue(101+i);
			list.add(v);
		}
		return list;
	}
	
	@RequestMapping("/valjson2")
	public List<Json3VO> getJsonVO2(){
		List<Json3VO> jlist = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<3;i++) {
			list.add(i+2);
		}
			Json3VO v =new Json3VO();
			v.setName("kim");
			v.setList(list);
			jlist.add(v);
			
			List<Integer> list1 = new ArrayList<>();
			for(int i=0;i<3;i++) {
				list1.add(i+3);
		}
			Json3VO v1 =new Json3VO();
			v.setName("lee");
			v.setList(list1);
			jlist.add(v1);
		
		return jlist;
	}
}
