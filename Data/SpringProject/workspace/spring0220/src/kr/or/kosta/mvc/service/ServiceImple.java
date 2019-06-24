package kr.or.kosta.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import kr.or.kosta.dto.MemberVO;
import kr.or.kosta.dto.CustomerVO;
import kr.or.kosta.mvc.dao.CustomerDao;
import kr.or.kosta.mvc.dao.MemberDao;

/*propagation=Propagation.REQUIRED
 * 기존의 트랜잭션이 존재한다면 그 트랜잭션을 지원하고, 없다면 새로운 트랜잭션을 시작한다는 의미
 * (propagation=Propagation.REQUIRED,rollbackFor=Exception.class,readOnly=true)
 * noRollbackFor=Exception.class 해당 예외가 발생했을 때는 rollback를 하지 않겠다.
 * rollbackFor=Exception.class 해당예외가 발생했을 때는 rollback을 수행함.
 * */
@Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class,readOnly=true)
@Service
public class ServiceImple implements ServiceInter{
	@Autowired
	private MemberDao memberDao;
	
	@Autowired
	private CustomerDao customerDao;
	
	@Override
	public void addAll(MemberVO mvo, CustomerVO cvo) throws Exception {
		memberDao.addMember(mvo);//정상일 경우 commit
		customerDao.addCustomer(cvo);		
	}

}
