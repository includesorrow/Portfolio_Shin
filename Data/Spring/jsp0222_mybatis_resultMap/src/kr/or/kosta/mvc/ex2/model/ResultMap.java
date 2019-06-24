package kr.or.kosta.mvc.ex2.model;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosta.dto.DeptVO;
import kr.or.kosta.mvc.dao.ResultMapExamleDao;
import kr.or.kosta.mvc.ex1.controller.ModelForward;
import kr.or.kosta.mvc.ex1.model.ModelInter;

public class ResultMap implements ModelInter{

	@Override
	public ModelForward execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<DeptVO> list = ResultMapExamleDao.getDeptDao().getDeptList();
		req.setAttribute("list", list);
		return new ModelForward(true, "resultMap1.jsp");
	}

}
