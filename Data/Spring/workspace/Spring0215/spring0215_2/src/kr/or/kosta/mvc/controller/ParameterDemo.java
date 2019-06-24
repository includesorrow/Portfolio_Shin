package kr.or.kosta.mvc.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.or.kosta.vo.MyMemberVO;

@Controller
public class ParameterDemo {
	@RequestMapping(value="/form")
	public String formParam() {
		return "formMsg";
	}
	//Spring 는 파라미터값을 자동으로 처리해준다.
	@RequestMapping(value="/todayMessage")
	public String todayParam(Model m ,String msg) {
		m.addAttribute("msg",msg);
		return "msg";
	}
	
	@RequestMapping(value="/todayMessage2")
	public String todayParam(Model m ,MyMemberVO v) {
		m.addAttribute("vo",v);
		return "msg2";
	}
	
	@RequestMapping(value="/param1", params="code=A")
	public ModelAndView paramDemo1(String code) {
		ModelAndView m = new ModelAndView();
		m.setViewName("msg");
		m.addObject("msg",code);
		return m;
	}
	@RequestMapping(value="/param1", params="code=B")
	public ModelAndView paramDemo2(String code) {
		ModelAndView m = new ModelAndView();
		m.setViewName("msg");
		m.addObject("msg",code);
		return m;
	}
	
	//* kr.or.kosta.mvc.controller.*.noparam*(..)
	@RequestMapping(value="/param1")
	public ModelAndView noparamDemo3(String code) {
		ModelAndView m = new ModelAndView();
		m.setViewName("msg");
		m.addObject("msg",code);
		return m;
	}
	
	//요청파라미터가 test가 아닌것만
	@RequestMapping(value="/param2", params="mycode!=test")
	public ModelAndView paramDemo3(String mycode) {
		ModelAndView m = new ModelAndView();
		m.setViewName("msg");
		m.addObject("msg",mycode);
		return m;
	}
	
	//자동으로 형변환
	@GetMapping("/intDemo")//http://localhost/spring0215/intDemo?num=100
	public String paramInt(Model m, int num) {
		int res=num+100;
		m.addAttribute("msg",res);
		return "msg";
	}
	//@RequestParam(value="id",required=false,defaultValue="ww")
	//@RequestParam(value="id",required=false,defaultValue="test")
	//@RequestParam(value="id")-파라미터값을 저장할 수 있는 기능
	//기본값은 required=true기 때문에 파라미터가 없을경우 MissingServletRequestParameterException
	//이 발생한다.
	//required=false : 파라미터값에 대한 예외를 발생시키지 않는다.
	//defaultValue="defaultTest" 파라미터값이 없을때 기본값으로 설정
	
	////http://localhost/spring0215/param3
	@RequestMapping(value="/param3")
	public ModelAndView paramDemo5(@RequestParam(value="id",required=false,
	defaultValue="defaultTest")String code) {
		ModelAndView m = new ModelAndView();
		m.setViewName("msg");
		m.addObject("msg",code);
		return m;
	}
	
	@GetMapping("/exceptionDemo")
	public String exceptionDemo() {
		String[] list= {"test1", "test2", "test3"};
		String res="";
		for(int i = 0; i>=list.length;i++) {
			res= list[i];
		}
		return "msg";
	}
}
