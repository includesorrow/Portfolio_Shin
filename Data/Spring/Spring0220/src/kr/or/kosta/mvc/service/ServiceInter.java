package kr.or.kosta.mvc.service;

import kr.or.kosta.dto.CustomerVO;
import kr.or.kosta.dto.MemberVO;

public interface ServiceInter {
	
	//transaction을 처리하기 위한 추상 메서드
	
	public void addAll(MemberVO mvo, CustomerVO cvo) throws Exception;

}
