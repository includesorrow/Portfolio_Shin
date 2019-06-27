package kr.or.kosta.mvc.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.kosta.dto.DeptVO;
import kr.or.kosta.dto.SawonVO;

@Repository
public class SawonDao {
	
	@Autowired
	private SqlSessionTemplate ss;
	
	// 1번째 ResultMap예제
	public List<DeptVO> getDeptList(){
		return ss.selectList("sawon.showDept");
	}
	// 2번째 ResultMap 예제
	public SawonVO getSawonPhone(int sabun) {
		return ss.selectOne("sawon.sawondetail",sabun);
	}
	// 3번째 ResultMap 예제
	public List<SawonVO> getSawonPhoneList(){
		return ss.selectList("sawon.sawonlist2");
	}
	
	public DeptVO getDeptAllList(int num) {
		return ss.selectOne("sawon.deptList",num);
	}
	
	public DeptVO getDeptSawonPhoneSearch(int deptno) {
		return ss.selectOne("sawon.deptsawonPhoneSeach", deptno);
	}
	
}
