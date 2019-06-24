package ex3;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;

public class Ex2_ResourceService implements PrintInter{
//javax는 자바 확장 API에서 제공하는 자동 빈 묶기에서 BYTYPE일 경우
	//같은 타입일 경우 Alias를 사용해서 NAME으로 식별함
	//@Resource(name="myMsg")
//	
//	@Resource(name="myMsg")
//	private String msg;

	@Resource
	@Qualifier("h")
	private String msg;
	@Override
	public String printName() {
	return msg+"입니다.";
	}
	
}
