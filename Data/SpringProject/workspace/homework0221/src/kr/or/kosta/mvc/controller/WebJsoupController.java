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
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebJsoupController {

	@GetMapping("/jsoup1")
	public String jsoup1(Model model) {
		String URL = "https://weather.naver.com/rgn/cityWetrMain.nhn";
		Document doc;

		try {
			doc = Jsoup.connect(URL).get();
			Elements elem = doc.select("#content>table>tbody>tr:nth-child(1)");
			String[] str = elem.text().split(" ");
			// 데이터만 추출할 경우!
			for (String e : str) {
				System.out.println(e);
			}
			// element를 추출할 경우 - tr 까지 다 적용 table <tr>
			System.out.println("elem: " + elem);
			System.out.println("str: " + str);
			model.addAttribute("elem", elem);

			// 이미지만 추출할 경우
//			Elements elem2 = doc.select(".tbl_weather tbody>tr:nth-child(1) img");
//			System.out.println("elem2: " + elem2);
//			model.addAttribute("elem2", elem2);

		} catch (IOException e) {
			e.printStackTrace();
		}
		return "jsoup1";
	}

	@PostMapping("/jsoup2")
	public String jsoup2(String url, String selector, Model model) {
//		String URL = "https://comic.naver.com/index.nhn";
//		"#realTimeRankFavorite > li > a"
//		#mySidenav > div
//		#nav_tutorials > div > div > a
		Document doc;	

		try {
			System.out.println(url);
			doc = Jsoup.connect(url).get();
			Elements elem = doc.select(selector);
			List<String> list = new ArrayList<>();
//			String[] str = elem.text().split(" ");
			// 데이터만 추출할 경우!
			for (Element e : elem) {
				System.out.println(e);
				list.add(e.text());
			}
			// element를 추출할 경우 - tr 까지 다 적용 table <tr>
			System.out.println("elem: " + elem);
//			System.out.println("str: " + str);
			model.addAttribute("list", list);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "jsoup2";
	}
}
