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
		//최신 5개의 이미지를 전송시키기 위한 컨트롤러 매핑
		//이를 따로 떼둔 이유는 F5(새로고침)시 업로드를 다시하기때문에 에러가 발생할 수 있기에 
		// 최신5개의 이미지만 보여주는 모델을 따로 만들어둠.
		m.addAttribute("list",dao.recenti());
		return "imagemain";
	}
	
	@PostMapping("/upload")
	public String uploadFile(
		MultipartFile mfile,
			Model m, HttpServletRequest request,String ilabel) {
		//업로드가 되면,
		String img_path = "resources\\img";
		String r_path = request.getRealPath("/");
		String oriFn = mfile.getOriginalFilename();
		StringBuffer path = new StringBuffer();
		path.append(r_path).append(img_path).append("\\");
		path.append(oriFn);
		File f = new File(path.toString());
		// resources/img에 업로드하기위해서 path를 설정하고,
		try {
			mfile.transferTo(f);
			// 받아온 파일을 업로드시킴.
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
		ImageVO vo= new ImageVO();
		vo.setIfile(oriFn);
		vo.setIlabel(ilabel);
		//이후에 파일이름과 라벨을 저장해서
		dao.inserti(vo);
		//dao를 통해 DB에 insert시킴.
		return "redirect:/imagemain";
		//이후 최신이미지 5개를 보기위해서 리다이렉트로 imagemain으로 감.
	}
	
	@GetMapping("/imagechk")
	public String imagechk(Model m,String ifile) {
		System.out.println(ifile);
		ImageVO vo=new ImageVO();
		vo.setIfile(ifile);
		m.addAttribute("msg",dao.imagechk(vo));
		//이미지파일의 이름 중복을 확인하여 0과 1중에 값을 imagechk로 보냄.
		return "imagechk";
	}
	
	@GetMapping("/refresh")
	public String refresh(Model m) {
		m.addAttribute("list",dao.recenti());
		// 새로고침버튼을 누를경우 다시 최신이미지 5개의 vo를 리스트에 담아서 보내줌.
		return "refresh";
	}
}
