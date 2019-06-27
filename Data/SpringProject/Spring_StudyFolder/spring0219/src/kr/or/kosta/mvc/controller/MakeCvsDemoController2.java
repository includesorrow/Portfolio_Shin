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
import kr.or.kosta.mvc.dao.DynamicExampleDao;


// 연습문제 2)
// 데이터베이스에 저장된 파일을 mybatis로 연동해서 csv 만들어서 저장할 수 있어야 한다.
@Controller
public class MakeCvsDemoController2 {
	
	@Autowired
	private DynamicExampleDao dao;
	
	@GetMapping("/csvstart")
	public String loadCvs(SawonVO vo) {
		String path = "C:\\bigdataStudy\\spring\\workspace\\spring0219\\WebContent\\resources\\data\\homeWorkData.csv";
		PrintWriter pw = null;
		Map<String, String> map = new HashMap<>();
		List<SawonVO> list = dao.getSawonWhereList(map);
		try {
			StringBuffer sb = new StringBuffer();
			String cNameList = "Sabun, Saname, Deptno, Sajob, Sapay, Sahire, Sgender, Samgr";
			sb.append(cNameList + "\n");
			for (SawonVO e : list) {
				pw = new PrintWriter(new File(path));
				sb.append(e.getSabun()).append(",");
				sb.append(e.getSaname()).append(",");
				sb.append(e.getDeptno()).append(",");
				sb.append(e.getSajob()).append(",");
				sb.append(e.getSapay()).append(",");
				sb.append(e.getSahire()).append(",");
				sb.append(e.getSgender()).append(",");
				sb.append(e.getSamgr()).append(",");
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
