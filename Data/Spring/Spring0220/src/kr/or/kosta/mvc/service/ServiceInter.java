package kr.or.kosta.mvc.service;

import kr.or.kosta.dto.CustomerVO;
import kr.or.kosta.dto.MemberVO;

public interface ServiceInter {
	
	//transaction�� ó���ϱ� ���� �߻� �޼���
	
	public void addAll(MemberVO mvo, CustomerVO cvo) throws Exception;

}
