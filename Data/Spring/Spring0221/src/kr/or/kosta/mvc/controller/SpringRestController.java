package kr.or.kosta.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.or.kosta.dto.CustomerVO;
import kr.or.kosta.dto.JsonVO;
import kr.or.kosta.dto.MemberVO;

@RestController
@RequestMapping("/members")
public class SpringRestController {

	// 문자열을 반환하는 경우
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello Rest Ful";
	}
	// 객체를 JSON으로 반환하는 경우
	// 웹에서 요청시에 jackson-databind 라이브러리가 있어야 함

	@RequestMapping("respVO")
	public MemberVO respVO() {
		MemberVO v = new MemberVO();
		v.setId("xman");
		v.setName("김길동");
		v.setNum(8);
		v.setAddress("인천");
		v.setPassword("test00");
		return v;
	}

	// 컬렉션 타입의 객체를 반환하여 JSON-ARRAY로 반환하는 경우

	// @RequestMapping("/respListErrorNot")
	@RequestMapping("/respList")
	public List<MemberVO> respList() {
		// public ResponseEntitiy<List<MemberVO>> respListNot(){
		List<MemberVO> list = new ArrayList<>();
		for (int i = 0; i <= 12; i++) {
			MemberVO v = new MemberVO();
			v.setId("xman" + i);
			v.setName("김길동" + i);
			v.setNum(i);
			v.setAddress("인천" + i);
			v.setPassword("test0" + i);
			list.add(v);
		}
		return list;
		// return new ResponseEntity<>(list,HttpStatus.not_found);
		// return new ResponseEntity<>(list,HttpStatus.BAD_Request);
	}

	@GetMapping("/valjson1")
	public JsonVO getJsonVO() {
		List<CustomerVO> list = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			CustomerVO vo = new CustomerVO();
			vo.setName("김길동" + i);
			vo.setNum((i + 1));
			vo.setAddress("가산" + i);
			vo.setSsn("801211-121212" + i);
			list.add(vo);
		}
		JsonVO jvo = new JsonVO();
		jvo.setList(list);
		jvo.setSuccess(true);
		jvo.setTotal_cnt(list.size());
		return jvo;
	}

	// http://localhost/springtest/members/respList2?code=1
	@RequestMapping("/respList2")
	public ResponseEntity<List<MemberVO>> respList(String code) {
		List<MemberVO> list = new ArrayList<>();
		try {
			if (code.equals("1")) {
				for (int i = 0; i <= 12; i++) {
					MemberVO v = new MemberVO();
					v.setId("xman" + i);
					v.setName("김길동" + i);
					v.setNum(i);
					v.setAddress("인천" + i);
					v.setPassword("test0" + i);
					list.add(v);
				}
			} else {
				for (int i = 0; i <= 12; i++) {
					MemberVO v = new MemberVO();
					v.setId("zman" + i);
					v.setName("김걸단" + i);
					v.setNum(i);
					v.setAddress("인천" + i);
					v.setPassword("xxoo" + i);
					list.add(v);
				}
			}
			return new ResponseEntity<>(list, HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(list, HttpStatus.BAD_REQUEST);
		}
	}

}
