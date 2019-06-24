package kr.or.kosta.mvc.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.kosta.dto.CustomerVO;
import kr.or.kosta.dto.MemberVO;

// DAO 같은 곳에서 데이터소스를 다루는 어노테이션. autocommit을 해준다.
@Repository
public class MemberDao implements MemberDaoInter{

//	@Autowired
//	private SqlSessionTemplate ss;
//	//오토와이어드는 마이바티스 설정에서 불러오는것임
//	public void addCustomer(CustomerVO v) {
//		ss.insert("customer.customerAdd",v);
//	}

	@Autowired
	private SqlSessionTemplate ss;

	@Override
	public void addMem(MemberVO vo) {
		ss.insert("mem.addMember", vo);
		
	}

	@Override
	public int idChk(String id) {
		return ss.selectOne("mem.idChk", id);
	}

	@Override
	public MemberVO loginCheck(MemberVO vo) {
		return ss.selectOne("mem.loginchk", vo);
	}

//	public void addMember(MemberVO vo) {
//		ss.insert("mem.addMember", vo);
//	}
//          
//	public int idChk(String id) {
//		return ss.selectOne("mymember.idChk", id);
//	}
//
//	public MemberVO loginCheck(MemberVO vo) {
//		return ss.selectOne("mymember.loginchk", vo);
//		// map을 쓰든지 VO를 쓰든지 둘중하나로 해야함.
//
//	}
//	public void addMem(MemberVO vo) {
//		ss.insert("mymember.join",vo);
//		
//	}
}
