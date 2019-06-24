package kr.or.kosta.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import kr.or.kosta.dto.CustomerVO;
import kr.or.kosta.dto.MemberVO;
import kr.or.kosta.mvc.dao.CustomerDao;
import kr.or.kosta.mvc.dao.MemberDao;

@Transactional(propagation=Propagation.REQUIRED,
rollbackFor=Exception.class,readOnly = true)

@Service
public class ServiceImple implements ServiceInter{
/*
 * propagation = propagation.required
 * 기존의 트랜잭션이 존재한다면 그 트랜잭션을 지원하고
 * 기존의 트랜잭션이 없다면 새로운 트랜잭션을 실행한다는 의미
 * propagation=propagation.required,rollbackfor=exception.class,readOnly=true)
 * noRollbackFor=Exception.class 해당 예외가 발생했을 때는 rollback을 하지 않겠다.
 * rollbackFor = Exception.class 해당 예외만 발생했을 때 rollback을 수행함
 */
	//ex)noRollbackFor=DuplicatieKeyException.class일 땐 롤백안됨
	
	
	
	@Autowired
	private MemberDao memberDao;
	
	@Autowired
	private CustomerDao customerDao;

	@Override
	public void addAll(MemberVO mvo, CustomerVO cvo) throws Exception {
	memberDao.addMem(mvo); 
	customerDao.addCustomer(cvo);
	}
	
	
	
	
	//@Service로 지칭하면 di로 할 수 있는 bean으로 지정하는 것임
	//dao 2개를 읽어와야 함
	
}
