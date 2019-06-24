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

public class DynamicExampleModel2 implements ModelInter{

	@Override
	public ModelForward execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Map<String, String> map = new HashMap<>();
		String saname = req.getParameter("saname");
		String sajob = req.getParameter("sajob");
		// sajob란 파라미터를 받아서 Map입력
		map.put("saname", saname);
		map.put("sajob", sajob);
		List<SawonVO> list = 
				DynamicExampleDao.getDao().getSawonWhereList(map);
		req.setAttribute("list", list);
		// view도 변경
		return new ModelForward(true, "dynamicExample2.jsp");
	}

}
