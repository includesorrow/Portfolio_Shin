package ex1.model;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DeptDao;
import dto.DeptVO;
import ex1.controller.ModelForward;
// deptAdd ��û�� ���� Dao�� �����͸� ó��
public class DeptModel implements ModelInter{

	@Override
	public ModelForward execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		DeptVO vo = new DeptVO();
		vo.setDname(req.getParameter("dname"));
		vo.setLoc(req.getParameter("loc"));
		
		System.out.println(vo.getDname()+":"+vo.getLoc());
		
		// Dao�� ���� ���� 
		DeptDao.getDeptDao().addDept(vo);
		
		// false�� 
		return new ModelForward(false, "my.kosta188?cmd=deptList");
	}

	
}
