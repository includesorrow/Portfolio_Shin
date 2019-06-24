package kr.or.kosta.mvc.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import kr.or.kosta.mvc.dao.ImageDao;
import kr.or.kosta.vo.ImageVO;


/*
 * DispatcherServlet 요청에 응답하는 모델
 * RequestMapping => HandlerMapping
 * 
 * */
@Controller
public class DefaultController {
	@Autowired
	private ImageDao dao;

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/{path}")
	public String ex1(@PathVariable String path) {
		return path;
	}
	@GetMapping("/upform")
	public String upform() {
		return "upform";
	}

	@PostMapping("/upload")
	public String uploadFile(MultipartFile mfile, Model m, HttpServletRequest request,String ilabel) {
		ImageVO vo = new ImageVO();
		String img_path = "resources\\imgfile";
		String r_path = request.getRealPath("/");
		String oriFn = mfile.getOriginalFilename();
		long size = mfile.getSize();
		String contentType = mfile.getContentType();
		System.out.println(r_path);
		System.out.println("파일명 :" + oriFn);
		System.out.println("파일크기 :" + size);
		System.out.println("Type :" + contentType);
		StringBuffer path = new StringBuffer();
		path.append(r_path).append(img_path).append("\\");
		path.append(oriFn);
		System.out.println(path);
		File f = new File(path.toString());
		System.out.println(f.exists());
		vo.setIfile(oriFn);
		vo.setIlabel(ilabel);
		
		
		//파일 업로드 진행
		try {
			mfile.transferTo(f);
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
		m.addAttribute("imgName",oriFn);
		return "uploadSuccess";
	}
	
	@GetMapping("/imagechk")
	public String imagechk(Model m,String ifile) {
		ifile=ifile.substring(ifile.lastIndexOf("\\"));
		System.out.println(ifile);
		ImageVO vo = new ImageVO();
		vo.setIfile( ifile);
		m.addAttribute("msg",dao.imagechk(vo));
		return "imagechk";
	}
	
	
}