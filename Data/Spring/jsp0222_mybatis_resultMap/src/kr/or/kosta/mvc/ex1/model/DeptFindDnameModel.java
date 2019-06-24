package kr.or.kosta.mvc.ex1.model;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosta.mvc.dao.DeptDao;
import kr.or.kosta.mvc.ex1.controller.ModelForward;

public class DeptFindDnameModel implements ModelInter{

	@Override
	public ModelForward execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String dname = req.getParameter("dname");
		System.out.println("Dname=========>"+dname);
		int cnt = DeptDao.getDeptDao().findDname(dname);
		StringBuffer sb = new StringBuffer();
		if(cnt > 0) {
			sb.append("<p style='color:red'>");
			sb.append(dname).append("는 이미 사용 중인 부서명입니다.</p>");
		}else {
			sb.append("<p style='color:blue'>");
			sb.append(dname).append("는 이미 사용 가능한 부서명입니다.</p>");
		}
		req.setAttribute("msg",sb.toString());
		return new ModelForward(true,"dnamefindAjax.jsp");
	}

}
