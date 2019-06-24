package kr.or.kosta.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//Ajax�� ������ ������ ��Ʈ�ѷ�
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
		tag.append("<option>=����=</option>");
		if(car.equals("1")) {
			tag.append("<option value='car1'> ������ī1</option>");
			tag.append("<option value='car2'> ������ī2</option>");
			tag.append("<option value='car3'> ������ī3</option>");
		}else if(car.equals("2")) {
			tag.append("<option value='zeep1'> ������ī1</option>");
			tag.append("<option value='zeep2'> ������ī2</option>");
			tag.append("<option value='zeep3'> ������ī3</option>");
			
			
			//�̰� ��� �����Ǿƴ�
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
