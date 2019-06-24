package kr.or.kosta.mvc.controller;

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
public class Exam_Controller {
	@ResponseBody
	@GetMapping("/jj")
	public List<Map<String, String>> Web() {
		List<Map<String, String>> list = new ArrayList<>();
		String url = "http://edu2.kosta.or.kr/notice";
		String selector = "table > tbody > tr > td > a";
		//공통된 부분이 table > tbody > tr > td > a 라는 공통분모가 있다.
		// a는 a href=""이부분
			try {
			Document doc = Jsoup.connect(url).get();
			//문서를 doc로 설정. Jsoup의 URL을 연결된걸 GET한다.
			Elements tags = doc.select(selector);
			//Elements 태그는 다큐먼트의 선택(선택된것을)
			int i = 1;
			for (Element e : tags) {
				//for문으로 한개씩 뽑는다. 그래서 Map에 값을 넣는다.
				Map<String, String> map = new HashMap<>();
				map.put(String.valueOf(i++), e.text());
				list.add(map);
				// map에 넣은후 list에 다시한번 넣어서 보여준다.
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		// responsebody를 통해 값을 바로 보내준다.
	}
}
