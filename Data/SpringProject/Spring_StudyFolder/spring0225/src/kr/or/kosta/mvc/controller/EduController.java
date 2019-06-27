package kr.or.kosta.mvc.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class EduController {
	
	@GetMapping("/edu")
	@ResponseBody
	public List<Map<String, String>> viewEdu() {

		List<Map<String, String>> list = new ArrayList<>();
		Map<String, String> map = new HashMap<>();
		Document doc;
		String URL = "http://edu.kosta.or.kr/notice";
		int i = 1;
		
		try {
			doc = Jsoup.connect(URL).get();
			Elements elem = doc.select("table>tbody>tr>td>a");
			for(Element e : elem) {
				map.put(String.valueOf(i), e.text());
				i++;
			}
			list.add(map);
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		return list;
	}
}
