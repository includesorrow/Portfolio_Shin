package kr.or.kosta.dto;

import java.util.Map;

public class TrafficVO {

	private String date;
//	private List<Map<String,Double>> list;
	private Map<String,Double> list;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Map<String, Double> getList() {
		return list;
	}
	public void setList(Map<String, Double> list) {
		this.list = list;
	}
	
	
}