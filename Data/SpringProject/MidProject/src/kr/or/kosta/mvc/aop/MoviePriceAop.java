package kr.or.kosta.mvc.aop;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import kr.or.kosta.dto.MovieVO;
import kr.or.kosta.mvc.dao.DynamicExampleDao;

@Component
@Aspect
public class MoviePriceAop {
	@Autowired
	private DynamicExampleDao dao;

	
	@Before("execution(* kr.or.kosta.mvc.controller.*.update(..))")
	public void searchLog(JoinPoint jp) {//검색하면 값이 출력되기 전에 로그부터 쌓인다.

		
		
		
		
		
		MovieVO vo = new MovieVO();
		
		
		Object[] o=jp.getArgs();//모든 매개변수의 값들을 object 로 받아온다.
		HttpSession hs =null; //세션을 위한 값
		String keyword=""; //검색어를 받기위해 사용할 변수
		 
		if(o[0] instanceof MovieVO && o[0] != null) { //제대로된 값인지 검사
			vo = (MovieVO) o[0];
		}
		System.out.println(vo.getMovie_number());
		System.out.println(vo.getMovie_price());
		
		vo.getMovie_number();
		vo.getMovie_price();
		//System.out.println("keyword  ==  : "+keyword);
		//String uid = (String) hs.getAttribute("uid");//세션에 올라가있는 uid를 스트링 타입으로 변환해준다
		//테스트를 위해 임시로 uid 를 테스트값으로 변경
		
//		Map<String,String> map = new HashMap<>();
//		
//		map.put("movie_number",vo.getMovie_number());
//		map.put("movie_price",String.valueOf(vo.getMovie_price()));
		System.out.println("-------------");
		dao.movie_advice(vo);
	}

}
