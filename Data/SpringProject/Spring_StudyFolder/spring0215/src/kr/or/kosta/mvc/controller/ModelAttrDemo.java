package kr.or.kosta.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.or.kosta.dto.ExampSawonDTO;

@Controller
public class ModelAttrDemo {

	@GetMapping("/modelForm")
	public String form() {
		return "form2";
	}

	@PostMapping("/formTest")
	// @ModelAttribute : �Ķ���ͷ� ���۵� VO���� view�� ���� �� ��
	public String paramDte(@ModelAttribute(value = "dto") ExampSawonDTO dto) {
		System.out.println("Test" + dto.getDeptno());
		return "msgDto";
	}
}
