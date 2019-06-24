package kr.or.kosta.mvc.ex1.model;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosta.mvc.ex1.controller.ModelForward;

public class IndexModel implements ModelInter {

	@Override
	public ModelForward execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String reAddr = req.getRemoteAddr();
		req.setAttribute("reip", reAddr);
		//url���� **.jsp�� �������� �ʴ°��� model2�� ��Ģ
		return new ModelForward(true, "index.jsp");
	}

}
