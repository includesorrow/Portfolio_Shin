package ex2.model;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ResultMapExamleDao;
import dto.DeptVO;
import ex1.controller.ModelForward;
import ex1.model.ModelInter;

public class ResultMapExampleModel1 implements ModelInter{

	@Override
	public ModelForward execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<DeptVO> list = ResultMapExamleDao.getDeptDao().getDeptList();
		req.setAttribute("list", list);
		return new ModelForward(true, "resultMap1.jsp");
	}

}
