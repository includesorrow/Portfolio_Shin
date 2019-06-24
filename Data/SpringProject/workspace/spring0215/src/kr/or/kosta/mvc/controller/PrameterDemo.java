package kr.or.kosta.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.or.kosta.vo.MyMemberVO;

@Controller
public class PrameterDemo {
	@RequestMapping(value = "/form")
	public String formParam() {
		return "formMsg";
	}

	// Spring�� �Ķ���� ���� �ڵ����� ó�����ش�.
	@RequestMapping(value = "/todayMessage")
	public String todayParam(Model m, String msg) {
		m.addAttribute("msg", msg);
		return "msg";
	}

	// VO�Ķ���͵� �ڵ����� ó���� ���ش�!
	@RequestMapping(value = "/todayMessage2")
	public String todayParam2(Model m, MyMemberVO v) {
		m.addAttribute("vo", v);
		return "msg2";
	}

	@RequestMapping(value = "/param1", params = "code=A")
	public ModelAndView paramDemo1(String code) {
		ModelAndView m = new ModelAndView();
		m.setViewName("msg");
		m.addObject("msg", code);
		return m;
	}

	@RequestMapping(value = "/param1", params = "code=B")
	public ModelAndView paramDemo2(String code) {
		ModelAndView m = new ModelAndView();
		m.setViewName("msg");
		m.addObject("msg", code);
		return m;
	}

	// * kr.or.kosta.mvc.controller.*.noparam*(..)
	@RequestMapping(value = "/param1")
	public ModelAndView noparamDemo3(String code) {
		ModelAndView m = new ModelAndView();
		m.setViewName("msg");
		m.addObject("msg", code);
		return m;
	}

	// ��û �Ķ���Ͱ� test�� �ƴѰ͸�
	@RequestMapping(value = "/param2", params = "mycode!=test")
	public ModelAndView paramDemo3(String mycode) {
		ModelAndView m = new ModelAndView();
		m.setViewName("msg");
		m.addObject("msg", mycode);
		return m;
	}

	// �ڵ����� �� ��ȯ
	@GetMapping("/intDemo") // http://localhost/spring0215/intDemo?num=100
	public String paramInt(Model m, int num) {
		int res = num + 100;
		m.addAttribute("msg", res);
		return "msg";
	}

	// @RequestParam(value="id", required=false, defaultValue="ww")
	// @RequestParam(value="id", required=false, defaultValue="test")
	// @RequsttParam(value="id") �Ķ���� ���� ������ �� �ִ� ���
	// �⺻���� required=true �̱� ������ �Ķ���Ͱ� ���� ���
	// MissingServletRequestParameterException �߻��Ѵ�.
	// required=false : �Ķ���� ���� ���� ���ܸ� �߻����� �ʴ´�.
	// defaultValue="" �Ķ���� ���� ���� �� �⺻ ������ ����
	
	//http://localhost/spring0215/param3
	@RequestMapping(value = "/param3")
	public ModelAndView paramDemo5(
			@RequestParam(value = "id", required = false, defaultValue = "defaultTest") String code) {
		ModelAndView m = new ModelAndView();
		m.setViewName("msg");
		m.addObject("msg", code);
		return m;
	}
	
	// error2.jsp���� ���� �޼����� ����Ͻÿ�.
	@GetMapping("/exceptionDemo")
	public String excuptionDemo() {
		String[] list = {"test", "test1", "test2"};
		String res = "";
		for(int i=0; i<=list.length; i++) {
			res = list[i];
		}
		return "msg";
	}
}
