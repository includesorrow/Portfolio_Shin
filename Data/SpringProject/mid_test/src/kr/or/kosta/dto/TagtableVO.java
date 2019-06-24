package kr.or.kosta.dto;

public class TagtableVO {
	
	/*
	 * 태그 테이블 VO
	 */

	private int tag_category_num;
	private String tag_table_num, tag_name;
	
	
	
	private MovietagVO movietagvo;
	private MovieVO movievo;
	
	
	
	public MovietagVO getMovietagvo() {
		return movietagvo;
	}
	public void setMovietagvo(MovietagVO movietagvo) {
		this.movietagvo = movietagvo;
	}
	public MovieVO getMovievo() {
		return movievo;
	}
	public void setMovievo(MovieVO movievo) {
		this.movievo = movievo;
	}
	public int getTag_category_num() {
		return tag_category_num;
	}
	public void setTag_category_num(int tag_category_num) {
		this.tag_category_num = tag_category_num;
	}
	public String getTag_table_num() {
		return tag_table_num;
	}
	public void setTag_table_num(String tag_table_num) {
		this.tag_table_num = tag_table_num;
	}
	public String getTag_name() {
		return tag_name;
	}
	public void setTag_name(String tag_name) {
		this.tag_name = tag_name;
	}
	
}
