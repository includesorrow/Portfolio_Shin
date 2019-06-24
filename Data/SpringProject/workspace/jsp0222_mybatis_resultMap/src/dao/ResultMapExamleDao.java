package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import conn.MyGetFactory;
import dto.DeptVO;

public class ResultMapExamleDao {
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
