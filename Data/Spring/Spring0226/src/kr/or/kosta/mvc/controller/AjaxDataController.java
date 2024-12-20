package kr.or.kosta.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//Ajax에 응답할 서버측 컨트롤러
// localhost/ajax/ajaxData1?subject=java
@Controller
@RequestMapping("/ajax")
public class AjaxDataController {

	@GetMapping("/ajaxData1")
	public String ajaxMethod(String subject, Model model) {
		System.out.println(subject);
		model.addAttribute("msg",subject);
		return "ex8_ajaxData";
	}
	
	
	@GetMapping("/ajaxData2")
	public String ajaxMethod2(String car, Model model) {
		StringBuffer tag = new StringBuffer();
		tag.append("<option>=선택=</option>");
		if(car.equals("1")) {
			tag.append("<option value='car1'> 스포츠카1</option>");
			tag.append("<option value='car2'> 스포츠카2</option>");
			tag.append("<option value='car3'> 스포츠카3</option>");
		}else if(car.equals("2")) {
			tag.append("<option value='zeep1'> 스포츠카1</option>");
			tag.append("<option value='zeep2'> 스포츠카2</option>");
			tag.append("<option value='zeep3'> 스포츠카3</option>");
			
			
			//이건 사실 좋은건아님
		}else {
			
		}
		model.addAttribute("msg",tag.toString());
		return "ex8_ajaxData2";
	}
	
	@GetMapping("/ajaxData3")
	public String ajaxMathod3(String carName,Model model) {
		model.addAttribute("msg",carName);
		return "ex8_ajaxData3";
	}

	
}
