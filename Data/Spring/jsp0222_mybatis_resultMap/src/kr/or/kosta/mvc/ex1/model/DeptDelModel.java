package kr.or.kosta.mvc.ex1.model;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosta.mvc.dao.DeptDao;
import kr.or.kosta.mvc.ex1.controller.ModelForward;
//deptDel
public class DeptDelModel implements ModelInter{

	@Override
	public ModelForward execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num = Integer.parseInt(req.getParameter("num"));
		System.out.println("Num :"+num);
		DeptDao.getDeptDao().delDept(num);
		// 삭제후 리다이렉트로 이동
		return new ModelForward(false,"my.kosta188?cmd=deptList");
	}

}





