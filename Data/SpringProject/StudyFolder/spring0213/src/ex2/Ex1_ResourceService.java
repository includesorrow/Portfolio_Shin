package ex2;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;

import ex1_1.PrintInter;

public class Ex1_ResourceService implements PrintInter {
	//javax�� �ڹ�Ȯ�� API���� �����ϴ� �ڵ� �� ���⿡�� byType�� ���
	//���� Ÿ���� ��� name���� �ĺ���
	
	@Resource//(name="myMsg")
	@Qualifier("h")
	private String msg;
	@Override
	public String printName() {
		return msg+"�Դϴ�.";
	}
	
}
