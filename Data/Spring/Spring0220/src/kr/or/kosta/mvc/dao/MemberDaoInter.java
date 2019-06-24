package kr.or.kosta.mvc.dao;

import kr.or.kosta.dto.MemberVO;

public interface MemberDaoInter {
	
	public void addMem(MemberVO vo);
	public int idChk(String id);
	public MemberVO loginCheck(MemberVO vo);
}
