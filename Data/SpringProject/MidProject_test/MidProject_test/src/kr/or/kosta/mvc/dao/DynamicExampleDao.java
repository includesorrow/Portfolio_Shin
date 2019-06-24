package kr.or.kosta.mvc.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.kosta.dto.MovieVO;
import kr.or.kosta.dto.MovietagVO;

@Repository
public class DynamicExampleDao {
	private static DynamicExampleDao dao;

	@Autowired
	private SqlSessionTemplate ss;
	


	public static DynamicExampleDao getDao() {
		if (dao == null)
			dao = new DynamicExampleDao(); 
		return dao;
	}
	

	public List<MovieVO> getMovieList(Map<String, String> map) {
		List<MovieVO> list = ss.selectList("movie.movielist", map);
		return list;
	}
	//영화 검색창에서 초기값 출력을 위한것 1
	
	public List<MovieVO> getMovieTitleList(Map<String, String> map) {
		List<MovieVO> list = ss.selectList("movie.movietitlelist", map);
		return list;
	}
	//영화 검색창에서 초기값 출력을 위한것 2

	
	
	public List<Integer> getprice1() {
		return ss.selectList("movie.price");
	}
	//차트를 위해 영화 가격 뽑아오기
	

	public List<MovieVO> getMovieList3(Map<String, String> map) {
		return ss.selectList("movie2.moviehashmap", map);
	}
	//영화 검색시 출력을 위한 것

	public void updateprice(MovieVO vo){ 
		ss.update("movie.update", vo);
	}
	//영화 가격 수정시 사용
	
	public void updatestatus(MovieVO vo){
		ss.update("movie.updatestatus", vo);
	}
	//영화 active_check_number 수정을 위한 없데이트
	
	public void createmovie(MovieVO vo) {
		ss.insert("movie.insert",vo);
	}
	
	public void beforeinsertmovie(MovietagVO vo) {
		ss.insert("movie.beforeinsert",vo);
	}
	//영화 추가. 태그추가는 추후에 해야 함.

	
	
}
