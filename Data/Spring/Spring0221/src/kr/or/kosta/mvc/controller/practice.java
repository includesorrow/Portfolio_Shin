package kr.or.kosta.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import kr.or.kosta.dto.CustomerVO;
import kr.or.kosta.dto.JsonVO;

public class practice {

	public static void main(String[] args) {
		CustomerVO vo = new CustomerVO();
		vo.setAddress("가산");
		vo.setName("길ㄷㅇ");
		vo.setNum(1);
		vo.setSsn("123124-124124");
		
		List<CustomerVO> list = new ArrayList<>();
		list.add(vo);
		
		vo = new CustomerVO();
		vo.setAddress("가산");
		vo.setName("길ㄷㅇ");
		vo.setNum(2);
		vo.setSsn("123124-124124");
		list.add(vo);
		
		JsonVO jvo = new JsonVO();
		jvo.setSuccess(true);
		jvo.setList(list);
		jvo.setTotal_cnt(list.size());
		System.out.println(list);
	}
}
