package ex2;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;

import ex1_1.PrintInter;

public class Ex1_ResourceService implements PrintInter {
	//javax는 자바확장 API에서 제공하는 자동 빈 묶기에서 byType일 경우
	//같은 타입일 경우 name으로 식별함
	
	@Resource//(name="myMsg")
	@Qualifier("h")
	private String msg;
	@Override
	public String printName() {
		return msg+"입니다.";
	}
	
}
