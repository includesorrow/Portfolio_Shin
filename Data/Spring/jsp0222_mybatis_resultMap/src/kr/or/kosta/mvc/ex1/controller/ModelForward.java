package kr.or.kosta.mvc.ex1.controller;

public class ModelForward {
	private boolean urlMethod; // true : forward, false : redirect
	private String viewName; // view이름이겠지..
	public ModelForward(boolean urlMethod, String viewName) {
		this.urlMethod = urlMethod;
		this.viewName = viewName;
	}
	public boolean isUrlMethod() {
		return urlMethod;
	}
	public void setUrlMethod(boolean urlMethod) {
		this.urlMethod = urlMethod;
	}
	public String getViewName() {
		return viewName;
	}
	public void setViewName(String viewName) {
		this.viewName = viewName;
	}
	
	
}
