package ex1.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ex1.model.ModelInter;


@WebServlet("*.kosta188")
public class ControlServlet extends HttpServlet {

	private static final long serialVersionUID = 320795611392287158L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		myProcess(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		myProcess(req, resp);
	}

	// 어떤 요청이 오더라도 모두 처리하는 메서드를 정의
	protected void myProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=euc-kr");
		req.setCharacterEncoding("euc-kr");
		String cmd = req.getParameter("cmd");
		System.out.println("Cmd:" + cmd);
		boolean res = false;
		ModelInter model = null;
		String viewName = null;
		if (cmd != null) {
			// 객체를 생성을 담당하는 Factory와 관계
			ModelFactory factory = ModelFactory.getFactory();
			// 요청에 따른 Model객체를 Factory가 생성해서 
			// ModelInter 반환 (다형성)
			// ModelInter model = new XXModel();
			model = factory.getModel(cmd);
			ModelForward mf = model.execute(req, resp);
			if (mf.isUrlMethod()) { // true
				RequestDispatcher rd = 
						req.getRequestDispatcher(mf.getViewName());
				rd.forward(req, resp);
			} else {
				resp.sendRedirect(mf.getViewName());
			}
		}else {
			PrintWriter out = resp.getWriter();
			out.println("<h3>요청하신 페이지는 존재 하지 않습니다.</h3>");
			out.println("<a href='main.kosta188?cmd=index'>메인페이지 이동</a>");
		}

	}
}
