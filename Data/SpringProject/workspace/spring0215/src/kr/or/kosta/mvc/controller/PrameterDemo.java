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

	// Spring은 파라미터 값을 자동으로 처리해준다.
	@RequestMapping(value = "/todayMessage")
	public String todayParam(Model m, String msg) {
		m.addAttribute("msg", msg);
		return "msg";
	}

	// VO파라미터도 자동으로 처리를 해준다!
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

	// 요청 파라미터가 test가 아닌것만
	@RequestMapping(value = "/param2", params = "mycode!=test")
	public ModelAndView paramDemo3(String mycode) {
		ModelAndView m = new ModelAndView();
		m.setViewName("msg");
		m.addObject("msg", mycode);
		return m;
	}

	// 자동으로 형 변환
	@GetMapping("/intDemo") // http://localhost/spring0215/intDemo?num=100
	public String paramInt(Model m, int num) {
		int res = num + 100;
		m.addAttribute("msg", res);
		return "msg";
	}

	// @RequestParam(value="id", required=false, defaultValue="ww")
	// @RequestParam(value="id", required=false, defaultValue="test")
	// @RequsttParam(value="id") 파라미터 값을 지정할 수 있는 기능
	// 기본값은 required=true 이기 때문에 파라미터가 없을 경우
	// MissingServletRequestParameterException 발생한다.
	// required=false : 파라미터 값에 대한 예외를 발생하지 않는다.
	// defaultValue="" 파라미터 값이 없을 때 기본 값으로 설정
	
	//http://localhost/spring0215/param3
	@RequestMapping(value = "/param3")
	public ModelAndView paramDemo5(
			@RequestParam(value = "id", required = false, defaultValue = "defaultTest") String code) {
		ModelAndView m = new ModelAndView();
		m.setViewName("msg");
		m.addObject("msg", code);
		return m;
	}
	
	// error2.jsp에서 에러 메세지를 출력하시오.
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
