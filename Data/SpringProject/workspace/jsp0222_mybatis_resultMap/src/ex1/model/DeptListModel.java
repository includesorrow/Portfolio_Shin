package ex1.model;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DeptDao;
import dto.DeptVO;
import ex1.controller.ModelForward;

public class DeptListModel implements ModelInter{

	@Override
	public ModelForward execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<DeptVO> list = DeptDao.getDeptDao().getDeptList();
		req.setAttribute("list", list);
		return new ModelForward(true, "deptList.jsp");
	}

}








