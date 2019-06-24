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
 * ������ Ʈ������� �����Ѵٸ� �� Ʈ������� �����ϰ�, ���ٸ� ���ο� Ʈ������� �����Ѵٴ� �ǹ�
 * (propagation=Propagation.REQUIRED,rollbackFor=Exception.class,readOnly=true)
 * noRollbackFor=Exception.class �ش� ���ܰ� �߻����� ���� rollback�� ���� �ʰڴ�.
 * rollbackFor=Exception.class �ش翹�ܰ� �߻����� ���� rollback�� ������.
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
		memberDao.addMember(mvo);//������ ��� commit
		customerDao.addCustomer(cvo);		
	}

}
