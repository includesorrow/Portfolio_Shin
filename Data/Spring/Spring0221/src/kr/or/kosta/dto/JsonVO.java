package kr.or.kosta.dto;

import java.util.List;

public class JsonVO {
	private boolean success;
	private List<CustomerVO> list;
	//List�� �� CustomVO�� ����
	private int total_cnt;
	
	
	
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public List<CustomerVO> getList() {
		return list;
	}
	public void setList(List<CustomerVO> list) {
		this.list = list;
	}
	public int getTotal_cnt() {
		return total_cnt;
	}
	public void setTotal_cnt(int total_cnt) {
		this.total_cnt = total_cnt;
	}
	
	
	
}