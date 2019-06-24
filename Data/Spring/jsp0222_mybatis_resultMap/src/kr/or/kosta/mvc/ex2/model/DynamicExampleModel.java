package kr.or.kosta.mvc.ex2.model;

import java.io.IOException;
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

public class DynamicExampleModel implements ModelInter{

	@Override
	public ModelForward execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Map<String, String> map = new HashMap<>();
		String saname = req.getParameter("saname");
		map.put("saname", saname);
		List<SawonVO> list = 
				DynamicExampleDao.getDao().getSawonList(map);
		req.setAttribute("list", list);
		return new ModelForward(true, "dynamicExample1.jsp");
	}

}
