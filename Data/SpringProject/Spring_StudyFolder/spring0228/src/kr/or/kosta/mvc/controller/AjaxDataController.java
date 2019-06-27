package kr.or.kosta.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// Ajax에 응답할 서버 측 컨트롤러
// localhost/spring0226/ajax/ajaxData1?subject=java
@Controller
@RequestMapping("/ajax")
public class AjaxDataController {

	@GetMapping("/ex2_load_test")
	public String loadMethod(String cmd,Model model) {
		StringBuffer html = new StringBuffer();
		if(cmd.equals("1")) {	
			html.append("<table>");
			String[] ar = {"Bigdata1","Bigdata2","Bigdata3"};
			for(String e : ar) {
				html.append("<tr><td>");
				html.append(e);
				html.append("</td></tr>");
			}
			html.append("</table>");
			model.addAttribute("html", html);
		}else if(cmd.equals("2")){
			return "ex3_load_test";
		}
		return "ex2_load_test";
	}

}
