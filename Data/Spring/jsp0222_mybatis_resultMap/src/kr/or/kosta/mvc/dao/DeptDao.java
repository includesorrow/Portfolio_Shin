package kr.or.kosta.mvc.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.kosta.conn.MyGetFactory;
import kr.or.kosta.dto.DeptVO;

public class DeptDao {
	private static DeptDao deptDao;
	private DeptDao() {}
	public static synchronized DeptDao getDeptDao() {
		if(deptDao == null)
			deptDao = new DeptDao();
		return deptDao;
	}
	public void addDept(DeptVO vo) {
		//MyBatis로 처리 , true : autoCommit(); : 완벽한 입력처리
		SqlSession ss = MyGetFactory.getFactory().openSession(true);
		ss.insert("sawon.deptAdd", vo);
		//ss.commit();
		ss.close();
	}
	//mapper에 id가 deptList 인 select 요소를 호출하면
	//select 된 커서의 결과를 vo에 넣어서 하나씩 List로 반환한다.
	public List<DeptVO> getDeptList(){
		SqlSession ss = MyGetFactory.getFactory().openSession();
		List<DeptVO> list = ss.selectList("sawon.deptList");
		ss.close();
		return list;
	}
	// 삭제 메서드 : deptDel
	public void delDept(int num) {
		SqlSession ss = MyGetFactory.getFactory().openSession(true);
		ss.delete("sawon.deptDel", num);
		ss.close();
	}
	public int findDname(String dname) {
		SqlSession ss = MyGetFactory.getFactory().openSession();
		int count = ss.selectOne("sawon.findDname", dname);
		ss.close();
		return count;
	}
}
