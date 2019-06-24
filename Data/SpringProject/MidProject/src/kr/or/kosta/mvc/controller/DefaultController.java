package kr.or.kosta.mvc.controller;

import java.util.ArrayList;import java.util.HashMap;import java.util.List;import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.or.kosta.dto.InserttagVO;
import kr.or.kosta.dto.MemberVO;
import kr.or.kosta.dto.MovieVO;
import kr.or.kosta.dto.MovietagVO;
import kr.or.kosta.mvc.dao.CommunityDao;
import kr.or.kosta.mvc.dao.DynamicExampleDao;
import kr.or.kosta.mvc.dao.TagListDao;

import static kr.or.kosta.mvc.dao.CommunityDao.countlist;
import static kr.or.kosta.mvc.dao.TagListDao.namelist;



/*
 * ��Ʈ�ѷ� �κ�
 * */
@Controller
public class DefaultController {

	@Autowired
	private DynamicExampleDao dao; 
	//Dao�� ������̾�� ��Ŵ
	
	
	@RequestMapping("/")
	public String index() {
		System.out.println("index");
		return "index";
	}
	//index ����� ����.
	
	@GetMapping("/{path}")
	public String ex1(@PathVariable String path) {
		return path;
	}
	//���� ��θ� �˾Ƽ� ������ ���� Get Mapping
	
	

	@GetMapping(value={"/blank5"})
	public String movielist5(Model m) {
		Map<String, String> map= new HashMap<String, String>();		
		m.addAttribute("list",dao.getMovieList3(map));
		return "blank5";
	}
	//blank5 ( ��ȭ �˻� �� �߰� ��)�� ���� Get����� Mapping
	
	@GetMapping("/chartjs")
	public String sendchartvalue(String cmd, Model m) {
		List<Integer> result = null;
		result = dao.getprice1();
		System.out.println(result);
		m.addAttribute("chart1",dao.getprice1());
		return "chartjs";
	}
	//��Ʈ�� ���� ������ ���� Mapping.
	
	@PostMapping("/blank5")
	public String searchTitle5(String searchType,String search,Model m) {
		Map<String, String> map= new HashMap<String, String>();
		map.put("searchType", searchType);
		map.put("search", search); 
		System.out.println(search);
		m.addAttribute("list",dao.getMovieList3(map)); 
		m.addAttribute("searchType",searchType);
		return "blank5";
	}
	//�˻��� ���� �ޱ� ���� Post����� Mapping
	
	
	
	
	
	@RequestMapping(value="recommendmovie.do",method=RequestMethod.POST)
	public String recommendmovie() throws Exception{
//		dao.outputmovierecommend(member_number);
		int member_number = 11;
		System.out.println("��õ��ȭ : " + dao.outputmovierecommend(member_number));
		return "redirect:blank5";
	}
	
	
	
	
	
	@RequestMapping(value="update.do", method=RequestMethod.POST)
	public String update(@ModelAttribute MovieVO vo) throws Exception{
		dao.updateprice(vo);
		
		return "redirect:blank5"; 
	}
	//��ȭ���� ��ȭ�� ������ ������Ʈ�� ����
	
	@RequestMapping(value="updatestatus.do", method=RequestMethod.POST)
	public String updatestatus(@ModelAttribute MovieVO vo) throws Exception{
		dao.updatestatus(vo);
		return "redirect:blank5";
	}
	//��ȭ���� ��ȭ�� active_status_number ������ ���� ����
	
	
	@RequestMapping(value="insert.do", method=RequestMethod.POST)
	public String insert(@ModelAttribute MovieVO vo, @ModelAttribute MovietagVO voo) throws Exception{
		dao.createmovie(vo);
		dao.beforeinsertmovie(voo);
		
		
		return "redirect:blank5";
	}
	//��ȭ �߰��� ���� ����
	
	@RequestMapping(value="moviepriceyearupdate.do", method=RequestMethod.POST)
	public String updatemoviepriceyear(@ModelAttribute MovieVO vo) throws Exception{
		dao.updatemoviepriceyear();
		
		return "redirect:blank5";
	}
	
	@RequestMapping(value="inserttag.do",method=RequestMethod.POST)
	public String inserttag(@ModelAttribute InserttagVO vo ) throws Exception{
		TagListDao tldao = new TagListDao();
		List<MovieVO> movienumberlist =dao.getsavetaglist();
		String movie_num="";
	for(MovieVO mv: movienumberlist) {
		movie_num=mv.getMovie_number();
		System.out.println("movie_num : "+movie_num);
		for(int i = 0; i<=9; i++) {
			vo.setMovie_number(movie_num);
			tldao.connectR(movie_num);
			String tag_name;
			tag_name = TagListDao.namelist[i];
			vo.setTag_name(tag_name);
			Map<String,String> map = new HashMap<String,String>();
			map.put("movie_number",movie_num);
			map.put("tag_name",tag_name);
			if(dao.checktagname(tag_name)==0) {
				dao.inserttag(vo);
				dao.insertmovietag(map);
			} else {
				dao.insertmovietag(map);
			}
		
		}	
		}
		System.out.println("insert end");
		return "redirect:blank5";
	}	
	//��� ž 10���� ����ϱ� ���� ����

	
	
	@RequestMapping(value="updatecommunity.do",method=RequestMethod.POST)
	public String insertMemberCommunity(@ModelAttribute MemberVO vo ) throws Exception{
		CommunityDao co = new CommunityDao();
		int mem_community_number = 0;
		co.connectR();
		int member_list_number = dao.memberfinalnumber();
		for(int i=11; i<=member_list_number-10; i++) {
			System.out.println("����!"+countlist[i-10]);
			vo.setMember_number(i);
			mem_community_number = countlist[i-10];
			vo.setMember_community_number(mem_community_number);
			dao.updatecommunitymember(vo);
		}
	return "redirect:blank5";
	}
	//����ȭ�� ���� ����
	
	
	
	
}