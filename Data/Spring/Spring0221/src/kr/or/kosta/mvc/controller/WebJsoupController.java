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
			//�����͸� ������ ���
			String[] str = elem.text().split(" ");
			
			for(String e : str) {
				System.out.println(e);
			}
			// element�� ������ ��� - tr���� �� ���� table <tr>
			System.out.println("elem:"+elem);
			System.out.println("str:"+str);
			model.addAttribute("elem",elem);
			model.addAttribute("elem2",elem);
			// split  " " > ������ �������� �迭�� �ϳ��� ���´�.
			//�̹����� ������ ���
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
	 * Document : ���� ��ü ���������
	 * Element : Document�� HTML���
	 * Eelemnts : Element�� ���տ��
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

	
		
		
		
		
	

	
	
	
	//css����
	/*
	 * 1. �ش� �κ� �˻縦 ���� <tr>�� ������ �;� ��. �ٵ� tr�� �ϸ� ��� tr������ ���Ƿ�
	 * �ĺ��� �ȿ� �ִ� ���̺� ���� tbody�� ù��° �ڽ�
	 * 
	 * Ŭ�����ε� ���Ӱ���
	 * �����̽� = �갡 ������ �ִ� �̹���. �����̽� ���� �θ� �����̽� ������ �ڽ�
	 */
}
