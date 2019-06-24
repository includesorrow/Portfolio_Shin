package or.kosta.mvc.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import or.kosta.mvc.dao.ImageDao;
import or.kosta.vo.ImageVO;

@Controller
public class Upload_Controller {
	@Autowired
	private ImageDao dao;

	@GetMapping("/")
	public String defalut(Model m) {
		return "index";
	}
	@GetMapping("/imageForm")
	public String upform(Model m) {
		return "imageForm";
	}
	
	@GetMapping("/imagemain")
	public String imagemain(Model m) {
		//�ֽ� 5���� �̹����� ���۽�Ű�� ���� ��Ʈ�ѷ� ����
		//�̸� ���� ���� ������ F5(���ΰ�ħ)�� ���ε带 �ٽ��ϱ⶧���� ������ �߻��� �� �ֱ⿡ 
		// �ֽ�5���� �̹����� �����ִ� ���� ���� ������.
		m.addAttribute("list",dao.recenti());
		return "imagemain";
	}
	
	@PostMapping("/upload")
	public String uploadFile(
		MultipartFile mfile,
			Model m, HttpServletRequest request,String ilabel) {
		//���ε尡 �Ǹ�,
		String img_path = "resources\\img";
		String r_path = request.getRealPath("/");
		String oriFn = mfile.getOriginalFilename();
		StringBuffer path = new StringBuffer();
		path.append(r_path).append(img_path).append("\\");
		path.append(oriFn);
		File f = new File(path.toString());
		// resources/img�� ���ε��ϱ����ؼ� path�� �����ϰ�,
		try {
			mfile.transferTo(f);
			// �޾ƿ� ������ ���ε��Ŵ.
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
		ImageVO vo= new ImageVO();
		vo.setIfile(oriFn);
		vo.setIlabel(ilabel);
		//���Ŀ� �����̸��� ���� �����ؼ�
		dao.inserti(vo);
		//dao�� ���� DB�� insert��Ŵ.
		return "redirect:/imagemain";
		//���� �ֽ��̹��� 5���� �������ؼ� �����̷�Ʈ�� imagemain���� ��.
	}
	
	@GetMapping("/imagechk")
	public String imagechk(Model m,String ifile) {
		System.out.println(ifile);
		ImageVO vo=new ImageVO();
		vo.setIfile(ifile);
		m.addAttribute("msg",dao.imagechk(vo));
		//�̹��������� �̸� �ߺ��� Ȯ���Ͽ� 0�� 1�߿� ���� imagechk�� ����.
		return "imagechk";
	}
	
	@GetMapping("/refresh")
	public String refresh(Model m) {
		m.addAttribute("list",dao.recenti());
		// ���ΰ�ħ��ư�� ������� �ٽ� �ֽ��̹��� 5���� vo�� ����Ʈ�� ��Ƽ� ������.
		return "refresh";
	}
}
