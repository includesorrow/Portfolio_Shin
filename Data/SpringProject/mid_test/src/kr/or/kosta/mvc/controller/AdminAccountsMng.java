package kr.or.kosta.mvc.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import kr.or.kosta.dto.ExcelTestVO;
import kr.or.kosta.dto.MovieVO;
import kr.or.kosta.dto.MovietagVO;
import kr.or.kosta.mvc.dao.DynamicExampleDao;
import kr.or.kosta.mvc.service.AdminAccountsMngService;


@Controller
@RequestMapping(value = "/accountsMngs")
public class AdminAccountsMng {


@Inject
AdminAccountsMngService adminAccountsMngService;

@RequestMapping(value = "/excelUploadPage", method = RequestMethod.GET)
public String serviceMngForm(Model model,Principal principal) {
model.addAttribute("userNm", principal.getName());
return "admin/accountsMng/excelUploadPage";
}

@RequestMapping(value = "/compExcelUpload")
public ModelAndView excelUpload(MultipartHttpServletRequest req){
ModelAndView mav = new ModelAndView("admin/accountsMng/excelUploadPage");
List<ExcelTestVO> list = new ArrayList<>();
String excelType = req.getParameter("excelType");
if(excelType.equals("xlsx")){
//list = adminAccountsMngService.xlsxExcelReader(req);
}else if(excelType.equals("xls")){
//list = adminAccountsMngService.xlsExcelReader(req);
}
mav.addObject("list", list);
return mav;
}
}
