package kr.or.kosta.mvc.service;

import kr.or.kosta.dto.MemberVO;
import kr.or.kosta.dto.CustomerVO;

public interface ServiceInter {
	//transaction�� ó���ϱ� ���� �߻�޼���
	public void addAll(MemberVO mvo,CustomerVO cvo) throws Exception;
}
