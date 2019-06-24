package ex1.model;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ex1.controller.ModelForward;
//1.Interface�� ���� : ������!
public interface ModelInter {
	// boolean -> �̵�������� ���
	// viewName�� ��ȯ�ϵ��� ����!
	// => ���� �ΰ��� ��ȯ�ϴ� Ŭ������ ���� (ModelForward)
	public ModelForward execute(HttpServletRequest req, 
			HttpServletResponse resp) 
					throws ServletException, IOException ;

}
