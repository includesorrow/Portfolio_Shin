package kr.or.kosta.mvc.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import kr.or.kosta.dto.ExampSawonDTO;
import kr.or.kosta.dto.MiniBoardDTO;

@Controller
public class UploadDemoController {

	@GetMapping("/upform")
	public String upform() {
		return "upform";
	}

	// MultipartFile mfile : ���ε� �Ķ���͸� ó��
	// CommonsMultipartResolver��� ������ Resolver
	// Common���� ���̺귯���� �ʿ�
	@PostMapping("/upload")
	public String uploadFile(MultipartFile mfile, Model m, HttpServletRequest request) {
		String img_path = "resources\\imgfile";
		String r_path = request.getRealPath("/");
		String oriFn = mfile.getOriginalFilename();
		long size = mfile.getSize();
		String contentType = mfile.getContentType();
		System.out.println(r_path);
		System.out.println("���ϸ� : " + oriFn);
		System.out.println("����ũ�� : " + size);
		System.out.println("Type : " + contentType);
		StringBuffer path = new StringBuffer();
		path.append(r_path).append(img_path).append("\\");
		path.append(oriFn);
		System.out.println(path);
		File f = new File(path.toString());
		System.out.println(f.exists());

		// ���� ���ε� ����

		try {
			mfile.transferTo(f);
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
		m.addAttribute("imgName", oriFn);
		return "uploadSuccess";
	}

	@GetMapping("/upform2")
	public String upform2() {
		return "form3";
	}

	@PostMapping("/upload2")
	public String uploadFile2(@ModelAttribute(value = "dto") MiniBoardDTO dto, HttpServletRequest request) {
		String img_path = "resources\\imgfile";
		String r_path = request.getRealPath("/");
		MultipartFile mfile = dto.getMfile();
		String oriFn = mfile.getOriginalFilename();
		long size = mfile.getSize();
		String contentType = mfile.getContentType();
		System.out.println(r_path);
		System.out.println("���ϸ� : " + oriFn);
		System.out.println("����ũ�� : " + size);
		System.out.println("Type : " + contentType);
		StringBuffer path = new StringBuffer();
		path.append(r_path).append(img_path).append("\\");
		path.append(oriFn);
		System.out.println(path);
		File f = new File(path.toString());
		System.out.println(f.exists());

		// ���� ���ε� ����

		try {
			mfile.transferTo(f);
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
		dto.setImgfile(oriFn);
//		m.addAttribute("dto", dto);

		return "uploadSuccess2";
	}
}