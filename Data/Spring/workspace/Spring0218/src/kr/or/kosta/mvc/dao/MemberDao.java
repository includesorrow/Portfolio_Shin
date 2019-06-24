package kr.or.kosta.mvc.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.kosta.dto.MyMemVO;


// DAO 같은 곳에서 데이터소스를 다루는 어노테이션. autocommit을 해준다.
@Repository
public class MemberDao implements MemberDaoInter{
	
	@Autowired
	private SqlSessionTemplate ss;
	
	@Override
	public void addMem(MyMemVO vo) {
		ss.insert("mymember.join",vo);
		
	}

	@Override
	public int idChk(String id) {
		return ss.selectOne("mymember.idChk",id);
	}

	@Override
	public MyMemVO loginCheck(MyMemVO vo) {
		return ss.selectOne("mymember.loginchk",vo);
		//map을 쓰든지 VO를 쓰든지 둘중하나로 해야함.
		
	}
	
	

}
