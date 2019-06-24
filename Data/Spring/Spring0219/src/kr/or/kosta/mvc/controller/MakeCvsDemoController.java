package kr.or.kosta.mvc.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kr.or.kosta.dto.SawonVO;
import kr.or.kosta.dto.populationVO;
import kr.or.kosta.mvc.dao.DynamicExampleDao;

@Controller
public class MakeCvsDemoController {

	@Autowired
	private DynamicExampleDao dao;
	@GetMapping("/cstart")
	public String loadCvs() {
		String path = "C:\\bigdata\\KOSTA\\KOSTA\\Spring\\Spring0219\\WebContent\\resources\\data\\newData.csv";
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new File(path));
			StringBuffer sb = new StringBuffer();
			String cNameList = "Year,Age,Sex,People";
			sb.append(cNameList+"\n");
			for(int i = 0; i<10; i++) {
				System.out.println(i);
				sb.append((i+1)).append(","); //id
				sb.append("park").append((i+1)); //name
				sb.append("\n");
				
			}
			pw.write(sb.toString());
			pw.close();
			System.out.println("付公府");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "success";
	}
	@GetMapping("/ctest")
	public String loadCvss() {
		String path = "C:\\bigdata\\KOSTA\\KOSTA\\Spring\\Spring0219\\WebContent\\resources\\data\\resource.csv";
		PrintWriter pw = null;
		List<populationVO> list = dao.getSawonFull();

		try {
			pw = new PrintWriter(new File(path));
			StringBuffer sb = new StringBuffer();
			String cNameList = "Year,Age,Sex,People";
			sb.append(cNameList+"\n");
			for(populationVO e: list) {
				
				sb.append(e.getYear()).append(",");
				sb.append(e.getAge()).append(",");
				sb.append(e.getSex()).append(",");
				sb.append(e.getPeople()).append("\n");
				
			}
			pw.write(sb.toString());
			pw.close();
			System.out.println("付公府");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "success";
	}
}
