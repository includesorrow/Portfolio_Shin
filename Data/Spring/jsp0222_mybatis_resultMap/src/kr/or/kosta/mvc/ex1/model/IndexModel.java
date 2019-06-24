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
		//url에서 **.jsp를 노출하지 않는것이 model2의 원칙
		return new ModelForward(true, "index.jsp");
	}

}
