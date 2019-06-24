package kr.or.kosta.mvc.ex2.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosta.dto.SawonVO;
import kr.or.kosta.mvc.dao.DynamicExampleDao;
import kr.or.kosta.mvc.ex1.controller.ModelForward;
import kr.or.kosta.mvc.ex1.model.ModelInter;

public class DynamicExampleForeachModel implements ModelInter{

	@Override
	public ModelForward execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Map<String,List<String>> map = new HashMap<>();
	/// code here 
		
		List<String> dept_list=null;
		try {
			String[] dlist = req.getParameterValues("dlist");
			// check된 항목인 배열값을 List로 변환해준다.
			dept_list = Arrays.asList(dlist);
		} catch (Exception e) {
			dept_list = new ArrayList<>();
		}
		map.put("dept_list", dept_list);
		List<SawonVO> list = 
				DynamicExampleDao.getDao().getSawonForeachList(map);
		req.setAttribute("list", list);
		return new ModelForward(true, "dynamicSawonForeachList.jsp");
	}

}
