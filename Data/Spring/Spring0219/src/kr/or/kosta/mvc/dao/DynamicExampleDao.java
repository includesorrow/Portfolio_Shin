package kr.or.kosta.mvc.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.kosta.dto.SawonVO;
import kr.or.kosta.dto.populationVO;

@Repository
public class DynamicExampleDao {
	private static DynamicExampleDao dao;

	@Autowired
	private SqlSessionTemplate ss;

	public static DynamicExampleDao getDao() {
		if (dao == null)
			dao = new DynamicExampleDao();
		return dao;
	}
	public List<SawonVO> getSawonList(Map<String, String> map) {
		List<SawonVO> list = ss.selectList("exam1.iftest1", map);
		return list;
	}
	public List<SawonVO> getSawonList2(Map<String, String> map) {
		List<SawonVO> list = ss.selectList("exam2.iftest2", map);
		return list;
	}
	// choose ����
	public List<SawonVO> getSawonChooseList(Map<String, String> map) {
		List<SawonVO> list = ss.selectList("exam3.chooseTest", map);
		return list;
	}
	public List<SawonVO> getSawonList3(Map<String, String> map) {
		return ss.selectList("exam3.iftest3", map);
	}
	// ForEach�� ����
	public List<SawonVO> getSawonForeachList(Map<String, List<String>> map) {
		List<SawonVO> list = ss.selectList("exam4.sawonDeptnoList", map);
		return list;
	}
	public List<populationVO> getSawonFull() {
		List<populationVO> list = ss.selectList("exam5.iftest5");
		return list;
	}
}
