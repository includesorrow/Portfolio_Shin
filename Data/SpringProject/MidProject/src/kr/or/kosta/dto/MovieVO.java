package kr.or.kosta.dto;

public class MovieVO {

	/*
	 * ¹«ºñvo
	 */
	
	private String movie_number, movie_title, movie_open_date, movie_purchase_date,tag_name;
	private int movie_price, movie_view_count, movie_watch_count, movie_number_of_audience,movie_investment, movie_copyright_cost, active_check_number;
	private double movie_rating;
	private String tag_table_num;
	
	
	
	public int getActive_check_number() {
		return active_check_number;
	}
	public void setActive_check_number(int active_check_number) {
		this.active_check_number = active_check_number;
	}
	private MovietagVO movietagvo;
	private TagtableVO tagtablevo;
	
	private int tag_category_num;
	public int getTag_category_num() {
		return tag_category_num;
	}
	public void setTag_category_num(int tag_category_num) {
		this.tag_category_num = tag_category_num;
	}
	public String getTag_name() {
		return tag_name;
	}
	public void setTag_name(String tag_name) {
		this.tag_name = tag_name;
	}
	
	public MovietagVO getMovietagvo() {
		return movietagvo;
	}
	public void setMovietagvo(MovietagVO movietagvo) {
		this.movietagvo = movietagvo;
	}
	public TagtableVO getTagtablevo() {
		return tagtablevo;
	}
	public void setTagtablevo(TagtableVO tagtablevo) {
		this.tagtablevo = tagtablevo;
	}
	public String getTag_table_num() {
		return tag_table_num;
	}
	public void setTag_table_num(String tag_table_num) {
		this.tag_table_num = tag_table_num;
	}
	public String getMovie_number() {
		return movie_number;
	}
	public void setMovie_rating(double movie_rating) {
		this.movie_rating = movie_rating;
	}
	public void setMovie_number(String movie_number) {
		this.movie_number = movie_number;
	}
	public String getMovie_title() {
		return movie_title;
	}
	public void setMovie_title(String movie_title) {
		this.movie_title = movie_title;
	}
	public String getMovie_open_date() {
		return movie_open_date;
	}
	public void setMovie_open_date(String movie_open_date) {
		this.movie_open_date = movie_open_date;
	}
	public String getMovie_purchase_date() {
		return movie_purchase_date;
	}
	public void setMovie_purchase_date(String movie_purchase_date) {
		this.movie_purchase_date = movie_purchase_date;
	}
	public int getMovie_price() {
		return movie_price;
	}
	public void setMovie_price(int movie_price) {
		this.movie_price = movie_price;
	}
	public double getMovie_rating() {
		return movie_rating;
	}
	public void setMovie_rating(int movie_rating) {
		this.movie_rating = movie_rating;
	}
	public int getMovie_view_count() {
		return movie_view_count;
	}
	public void setMovie_view_count(int movie_view_count) {
		this.movie_view_count = movie_view_count;
	}
	public int getMovie_watch_count() {
		return movie_watch_count;
	}
	public void setMovie_watch_count(int movie_watch_count) {
		this.movie_watch_count = movie_watch_count;
	}
	public int getMovie_number_of_audience() {
		return movie_number_of_audience;
	}
	public void setMovie_number_of_audience(int movie_number_of_audience) {
		this.movie_number_of_audience = movie_number_of_audience;
	}
	public int getMovie_investment() {
		return movie_investment;
	}
	public void setMovie_investment(int movie_investment) {
		this.movie_investment = movie_investment;
	}
	public int getMovie_copyright_cost() {
		return movie_copyright_cost;
	}
	public void setMovie_copyright_cost(int movie_copyright_cost) {
		this.movie_copyright_cost = movie_copyright_cost;
	}
	



}
