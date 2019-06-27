package kr.or.kosta.mvc.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.kosta.dto.SawonVO;

@Repository
public class DynamicExampleDao {

	@Autowired
	private SqlSessionTemplate ss;

	// sawon 검색기능 갖춘 메서드
	public List<SawonVO> getSawonList(Map<String, String> map) {
		List<SawonVO> list = ss.selectList("exam1.iftest1", map);
		return list;
	}

	public List<SawonVO> getSawonWhereList(Map<String, String> map) {
		List<SawonVO> list = ss.selectList("exam2.iftest1", map);
		return list;
	}

	public List<SawonVO> getSawonChooseList(Map<String, String> map) {
		List<SawonVO> list = ss.selectList("exam3.chooseTest", map);
		return list;
	}

	public List<SawonVO> getSawonForeachList(Map<String, List<String>> map) {
		List<SawonVO> list = ss.selectList("exam4.sawonDeptnoList", map);
		return list;
	}
}
