package kr.or.kosta.mvc.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.kosta.dto.CustomerVO;
import kr.or.kosta.dto.MemberVO;

@Repository
public class CustomerDao {

//	@Autowired
//	private SqlSessionTemplate ss;
//	public void addMember(MemberVO vo) {
//		ss.insert("mem.addMember",vo);
//	}

	@Autowired
	private SqlSessionTemplate ss;
	public void addCustomer(CustomerVO cvo) {
		ss.insert("customer.customerAdd",cvo);
	}
	
	
	
}
