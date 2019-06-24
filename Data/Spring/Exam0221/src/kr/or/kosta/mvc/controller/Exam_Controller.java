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
		//����� �κ��� table > tbody > tr > td > a ��� ����и� �ִ�.
		// a�� a href=""�̺κ�
			try {
			Document doc = Jsoup.connect(url).get();
			//������ doc�� ����. Jsoup�� URL�� ����Ȱ� GET�Ѵ�.
			Elements tags = doc.select(selector);
			//Elements �±״� ��ť��Ʈ�� ����(���õȰ���)
			int i = 1;
			for (Element e : tags) {
				//for������ �Ѱ��� �̴´�. �׷��� Map�� ���� �ִ´�.
				Map<String, String> map = new HashMap<>();
				map.put(String.valueOf(i++), e.text());
				list.add(map);
				// map�� ������ list�� �ٽ��ѹ� �־ �����ش�.
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		// responsebody�� ���� ���� �ٷ� �����ش�.
	}
}
