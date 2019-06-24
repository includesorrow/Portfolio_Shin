package kr.or.kosta.mvc.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.kosta.dto.CustomerVO;

@Repository
public class CustomerDao {
	@Autowired
	private SqlSessionTemplate ss;//context���� ������ ���̹�Ƽ�� �������� �ҷ���
	public void addCustomer(CustomerVO vo) {
		ss.insert("customer.customerAdd",vo);
	}
}
