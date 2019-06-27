package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import conn.MyGetFactory;
import dto.SawonVO;

public class SawonDao {
	private static SawonDao sawonDao;
	
	private SawonDao() {}

	public static synchronized SawonDao getSawonDao() {
		if(sawonDao == null) {
			sawonDao = new SawonDao();
		}
		return sawonDao;
	}
	//sawon 검색기능 갖춘 메서드
	public List<SawonVO> getSawonList(){
		SqlSession ss = MyGetFactory.getFactory().openSession();
		List<SawonVO> list = ss.selectList("sawon.sawonList");
		ss.close();
		return list;
	}
	
}
