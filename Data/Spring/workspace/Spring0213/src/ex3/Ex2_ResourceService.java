package ex3;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;

public class Ex2_ResourceService implements PrintInter{
//javax�� �ڹ� Ȯ�� API���� �����ϴ� �ڵ� �� ���⿡�� BYTYPE�� ���
	//���� Ÿ���� ��� Alias�� ����ؼ� NAME���� �ĺ���
	//@Resource(name="myMsg")
//	
//	@Resource(name="myMsg")
//	private String msg;

	@Resource
	@Qualifier("h")
	private String msg;
	@Override
	public String printName() {
	return msg+"�Դϴ�.";
	}
	
}
