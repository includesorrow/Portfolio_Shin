package ex2.model;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.SawonDao;
import dto.SawonVO;
import ex1.controller.ModelForward;
import ex1.model.ModelInter;

public class SawonSearchListModel implements ModelInter{

	@Override
	public ModelForward execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<SawonVO> list = SawonDao.getSawonDao().getSawonList();
		req.setAttribute("list", list);
		return new ModelForward(true, "sawonList.jsp");
	}

}
