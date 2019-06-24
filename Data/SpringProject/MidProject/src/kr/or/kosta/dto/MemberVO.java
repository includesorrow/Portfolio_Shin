package kr.or.kosta.dto;

public class MemberVO {
	
	/*
	 * ¸â¹öÅ×ÀÌºívo
	 */
	int member_number,member_grade,member_community_number;
	String movie_number;

	public String getMovie_number() {
		return movie_number;
	}

	public void setMovie_number(String movie_number) {
		this.movie_number = movie_number;
	}

	public int getMember_number() {
		return member_number;
	}

	public void setMember_number(int member_number) {
		this.member_number = member_number;
	}

	public int getMember_grade() {
		return member_grade;
	}

	public void setMember_grade(int member_grade) {
		this.member_grade = member_grade;
	}

	public int getMember_community_number() {
		return member_community_number;
	}

	public void setMember_community_number(int member_community_number) {
		this.member_community_number = member_community_number;
	}
	

}
