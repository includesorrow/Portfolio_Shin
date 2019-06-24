package ex1.model;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ex1.controller.ModelForward;
//1.Interface를 정의 : 다형성!
public interface ModelInter {
	// boolean -> 이동방식으로 사용
	// viewName도 반환하도록 결정!
	// => 모델이 두값을 반환하는 클래스를 설계 (ModelForward)
	public ModelForward execute(HttpServletRequest req, 
			HttpServletResponse resp) 
					throws ServletException, IOException ;

}
