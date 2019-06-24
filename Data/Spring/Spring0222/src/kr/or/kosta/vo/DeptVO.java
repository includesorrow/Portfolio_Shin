package kr.or.kosta.vo;

import java.util.List;

public class DeptVO {
	
	public DeptVO() {
		
	}
	
	private int deptno;
	private String dname,loc;
	private List<SawonVO> sawon;
	public int getDeptno() {
		return deptno;
	}
	public DeptVO(Integer deptno, String dname) {
		this.deptno = deptno;
		this.dname = dname;
	}
	
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public List<SawonVO> getSawon() {
		return sawon;
	}
	public void setSawon(List<SawonVO> sawon) {
		this.sawon = sawon;
	}

}
