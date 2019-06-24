package kr.or.kosta.mvc.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.kosta.dto.CustomerVO;
import kr.or.kosta.dto.MemberVO;

// DAO ���� ������ �����ͼҽ��� �ٷ�� ������̼�. autocommit�� ���ش�.
@Repository
public class MemberDao implements MemberDaoInter{

//	@Autowired
//	private SqlSessionTemplate ss;
//	//������̾��� ���̹�Ƽ�� �������� �ҷ����°���
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
//		// map�� ������ VO�� ������ �����ϳ��� �ؾ���.
//
//	}
//	public void addMem(MemberVO vo) {
//		ss.insert("mymember.join",vo);
//		
//	}
}
