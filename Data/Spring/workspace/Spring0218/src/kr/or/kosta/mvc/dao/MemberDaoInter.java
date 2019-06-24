package kr.or.kosta.mvc.dao;

import kr.or.kosta.dto.MyMemVO;

public interface MemberDaoInter {
	
	public void addMem(MyMemVO vo);
	public int idChk(String id);
	public MyMemVO loginCheck(MyMemVO vo);
}
