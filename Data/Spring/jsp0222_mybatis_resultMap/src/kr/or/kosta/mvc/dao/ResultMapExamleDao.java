package kr.or.kosta.mvc.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.kosta.conn.MyGetFactory;
import kr.or.kosta.dto.DeptVO;

@Repository
public class ResultMapExamleDao {
	
	@Autowired
	private SqlSessionTemplate ss;
	
	
	
	private static ResultMapExamleDao deptDao;
	private ResultMapExamleDao() {}
	public static synchronized ResultMapExamleDao getDeptDao() {
		if(deptDao == null)
			deptDao = new ResultMapExamleDao();
		return deptDao;
	}
	//ResultMap 1¹ø¿¹Á¦ 
	public List<DeptVO> getDeptList(){
		SqlSession ss = MyGetFactory.getFactory().openSession();
		List<DeptVO> list = ss.selectList("result1.showDept");
		ss.close();
		return list;
	}
	
}
