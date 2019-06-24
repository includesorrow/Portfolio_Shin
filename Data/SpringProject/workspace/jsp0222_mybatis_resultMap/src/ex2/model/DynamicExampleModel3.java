package ex2.model;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DynamicExampleDao;
import dto.SawonVO;
import ex1.controller.ModelForward;
import ex1.model.ModelInter;

public class DynamicExampleModel3 implements ModelInter{

	@Override
	public ModelForward execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Map<String, String> map = new HashMap<>();
		String searchType = req.getParameter("searchType");
		String searchName = req.getParameter("searchName");
		// sajob란 파라미터를 받아서 Map입력
		map.put("searchType", searchType);
		map.put("searchName", searchName);
		List<SawonVO> list = 
				DynamicExampleDao.getDao().getSawonChooseList(map);
		req.setAttribute("list", list);
		// view도 변경
		return new ModelForward(true, "dynamicExample3.jsp");
	}

}
