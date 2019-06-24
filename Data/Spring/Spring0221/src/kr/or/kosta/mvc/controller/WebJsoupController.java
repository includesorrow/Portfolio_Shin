package kr.or.kosta.mvc.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebJsoupController {

	@GetMapping("/jsoup1")
	public String jsoup1(Model model) {
		String URL = "https://weather.naver.com/rgn/cityWetrMain.nhn";
		Document doc;
		
		try {
			doc = Jsoup.connect(URL).get();
			Elements elem = doc.select(
					"#content > table > tbody > tr:nth-child(1)");
			//데이터만 추출할 경우
			String[] str = elem.text().split(" ");
			
			for(String e : str) {
				System.out.println(e);
			}
			// element를 추출할 경우 - tr까지 다 적용 table <tr>
			System.out.println("elem:"+elem);
			System.out.println("str:"+str);
			model.addAttribute("elem",elem);
			model.addAttribute("elem2",elem);
			// split  " " > 공백을 기준으로 배열을 하나씩 끊는다.
			//이미지만 추출할 경우
		//	Elements elem2=doc.select(".tbl_weather tbody>tr:nth-child(1) img");
					System.out.println("elem : "+ elem);
			//System.out.println("str : "+ str);
			//System.out.println("elem2 : "+ elem2);
			//model.addAttribute("elem",elem);
			//model.addAttribute("elem2",elem2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "jsoup1";
		
	}
	
	@GetMapping(value="/jsl1")
	public String jsoup(String url, String selector, Model model) {
	/*
	 * Document : 문서 전체 가지고오기
	 * Element : Document의 HTML요소
	 * Eelemnts : Element의 집합요소
	 */
	List<String> list = new ArrayList<String>();
	try {
		Document doc = Jsoup.connect(url).get();
		Elements tags = doc.select(selector);
		for(Element e : tags) {
			list.add(e.text().toString().trim());
			
		}
		}catch(IOException e) {
			e.printStackTrace();
		}
	model.addAttribute("list",list);
	return "js1";
	
}

	
		
		
		
		
	

	
	
	
	//css개념
	/*
	 * 1. 해당 부분 검사를 눌러 <tr>을 가지고 와야 함. 근데 tr만 하면 모든 tr가지고 오므로
	 * 식별자 안에 있는 테이블 안의 tbody의 첫번째 자식
	 * 
	 * 클래스로도 접속가능
	 * 스페이스 = 얘가 가지고 있는 이미지. 스페이스 왼쪽 부모 스페이스 오른쪽 자식
	 */
}
