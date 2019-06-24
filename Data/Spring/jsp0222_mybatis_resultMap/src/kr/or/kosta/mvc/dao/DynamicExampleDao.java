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
	//sawon �˻���� ���� �޼���
		public List<SawonVO> getSawonList(Map<String, String> map){
			SqlSession ss = MyGetFactory.getFactory().openSession();
			List<SawonVO> list = ss.selectList("exam1.iftest1",map);
			ss.close();
			return list;
		}
		// where�� ������ �����ϱ� ���� �޼��� �߰�
		public List<SawonVO> getSawonWhereList(Map<String, String> map){
			SqlSession ss = MyGetFactory.getFactory().openSession();
			
			// RowBounds : RowBounds �Ķ���ʹ� ���̹�Ƽ���� �Ͽ��� Ư�� ���� ��ŭ�� ���ڵ带 
			//�ǳʶ�� �Ѵ�. 
			// RowBoundsŬ������ offset�� limit �Ѵ� ������ �����ڰ� �ִ�.
			// offset��ŭ �ǳʶ��, limit ��ŭ �����͸� �����´�. ******
			// offset ���� �����Ͱ� ���� ��쿡�� ��ȿ������
			// oracle�ϰ�� rownum���� ��õ!
			//int offset = 0;
			//int limit = 10;
			//RowBounds rowBounds = new RowBounds(offset,limit);
			//List<SawonVO> list = ss.selectList("exam2.iftest1",map,rowBounds);
			List<SawonVO> list = ss.selectList("exam2.iftest1",map);
			ss.close();
			return list;
		}	
		//choose�� ����
		public List<SawonVO> getSawonChooseList(Map<String, String> map){
			SqlSession ss = MyGetFactory.getFactory().openSession();
			List<SawonVO> list = ss.selectList("exam2.chooseTest",map);
			ss.close();
			return list;
		}
		//Foreach�� ���� 
		public List<SawonVO> getSawonForeachList(Map<String, List<String>> map){
			SqlSession ss = MyGetFactory.getFactory().openSession();
			List<SawonVO> list = ss.selectList("exam2.sawonDeptnoList",map);
			ss.close();
			return list;
		}
}






