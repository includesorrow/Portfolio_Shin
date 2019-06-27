package kr.or.kosta.mvc.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// 연습문제 2)
// 데이터베이스에 저장된 파일을 mybatis로 연동해서 csv 만들어서 저장할 수 있어야 한다.
@Controller
public class MakeCvsDemoController {
	@GetMapping("/cstart")
	public String loadCvs() {
		String path = "C:\\bigdataStudy\\spring\\workspace\\spring0219\\WebContent\\resources\\data\\newData.csv";
		PrintWriter pw = null;

		try {
			pw = new PrintWriter(new File(path));
			StringBuffer sb = new StringBuffer();
			String cNameList = "Id, Name";
			sb.append(cNameList + "\n");
			for (int i = 0; i < 10; i++) {
				sb.append((i + 1)).append(",");
				sb.append("park").append(i + 1);
				sb.append("\n");
				pw.write(sb.toString());
				pw.close();
			}
			System.out.println("마무리!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return "success";
	}
}
