package kr.or.kosta.mvc.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import kr.or.kosta.conn.MyGetFactory;
import kr.or.kosta.dto.SawonVO;

public class DynamicExampleDao {
	private static DynamicExampleDao dao;

	public static synchronized DynamicExampleDao getDao() {
		if(dao == null)
			dao = new DynamicExampleDao();
		return dao;
	}
	//sawon 검색기능 갖춘 메서드
		public List<SawonVO> getSawonList(Map<String, String> map){
			SqlSession ss = MyGetFactory.getFactory().openSession();
			List<SawonVO> list = ss.selectList("exam1.iftest1",map);
			ss.close();
			return list;
		}
		// where문 예제를 수행하기 위안 메서드 추가
		public List<SawonVO> getSawonWhereList(Map<String, String> map){
			SqlSession ss = MyGetFactory.getFactory().openSession();
			
			// RowBounds : RowBounds 파라미터는 마이바티스로 하여금 특정 개수 만큼의 레코드를 
			//건너띄게 한다. 
			// RowBounds클래스는 offset과 limit 둘다 가지는 생성자가 있다.
			// offset만큼 건너띄고, limit 만큼 데이터를 가져온다. ******
			// offset 많은 데이터가 있을 경우에는 비효율적임
			// oracle일경우 rownum값을 추천!
			//int offset = 0;
			//int limit = 10;
			//RowBounds rowBounds = new RowBounds(offset,limit);
			//List<SawonVO> list = ss.selectList("exam2.iftest1",map,rowBounds);
			List<SawonVO> list = ss.selectList("exam2.iftest1",map);
			ss.close();
			return list;
		}	
		//choose문 예제
		public List<SawonVO> getSawonChooseList(Map<String, String> map){
			SqlSession ss = MyGetFactory.getFactory().openSession();
			List<SawonVO> list = ss.selectList("exam2.chooseTest",map);
			ss.close();
			return list;
		}
		//Foreach문 예제 
		public List<SawonVO> getSawonForeachList(Map<String, List<String>> map){
			SqlSession ss = MyGetFactory.getFactory().openSession();
			List<SawonVO> list = ss.selectList("exam2.sawonDeptnoList",map);
			ss.close();
			return list;
		}
}






