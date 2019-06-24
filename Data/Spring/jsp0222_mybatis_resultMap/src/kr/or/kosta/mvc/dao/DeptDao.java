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
		//MyBatis�� ó�� , true : autoCommit(); : �Ϻ��� �Է�ó��
		SqlSession ss = MyGetFactory.getFactory().openSession(true);
		ss.insert("sawon.deptAdd", vo);
		//ss.commit();
		ss.close();
	}
	//mapper�� id�� deptList �� select ��Ҹ� ȣ���ϸ�
	//select �� Ŀ���� ����� vo�� �־ �ϳ��� List�� ��ȯ�Ѵ�.
	public List<DeptVO> getDeptList(){
		SqlSession ss = MyGetFactory.getFactory().openSession();
		List<DeptVO> list = ss.selectList("sawon.deptList");
		ss.close();
		return list;
	}
	// ���� �޼��� : deptDel
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
