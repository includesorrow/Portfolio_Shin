package kr.or.kosta.mvc.ex1.model;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosta.dto.DeptVO;
import kr.or.kosta.mvc.dao.DeptDao;
import kr.or.kosta.mvc.ex1.controller.ModelForward;

public class DeptListModel implements ModelInter{

	@Override
	public ModelForward execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<DeptVO> list = DeptDao.getDeptDao().getDeptList();
		req.setAttribute("list", list);
		return new ModelForward(true, "deptList.jsp");
	}

}








