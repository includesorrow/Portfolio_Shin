package kr.or.kosta.mvc.service;

import kr.or.kosta.dto.MemberVO;
import kr.or.kosta.dto.CustomerVO;

public interface ServiceInter {
	//transaction을 처리하기 위한 추상메서드
	public void addAll(MemberVO mvo,CustomerVO cvo) throws Exception;
}
