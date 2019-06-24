package kr.or.kosta.mvc.ex1.model;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosta.dto.DeptVO;
import kr.or.kosta.mvc.dao.DeptDao;
import kr.or.kosta.mvc.ex1.controller.ModelForward;
// deptAdd 요청이 오면 Dao로 데이터를 처리
public class DeptModel implements ModelInter{

	@Override
	public ModelForward execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		DeptVO vo = new DeptVO();
		vo.setDname(req.getParameter("dname"));
		vo.setLoc(req.getParameter("loc"));
		
		System.out.println(vo.getDname()+":"+vo.getLoc());
		
		// Dao로 값을 전달 
		DeptDao.getDeptDao().addDept(vo);
		
		// false가 
		return new ModelForward(false, "my.kosta188?cmd=deptList");
	}

	
}
