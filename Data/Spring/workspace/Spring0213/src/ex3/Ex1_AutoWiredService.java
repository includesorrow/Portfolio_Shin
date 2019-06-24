package ex3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//���� �̰� BEAN���� ����� ��ü
public class Ex1_AutoWiredService  implements PrintInter{
/*
 * �ڵ����� ���������� ����� �����ִ� ������̼�
 * byName, byType��
 * byname�� ������Ƽ�� �̸��� �����ϸ� �ٷ� �ڵ����� ���� �������ش�.
 * bytype�� ���� Ÿ���� ������ �˻��ؼ� �ڵ����� ���� �������ش�.
 * @Autowired
 * @Qualifier("hold")
 * null�� ����մϴ�
 * @Autowired(required=false)
 */
	@Autowired(required=false)
	//false 	//NULL ���
	@Qualifier("hold")
	private String name;
	//���� �ʱ�ȭ�� ���߰� setter�� �־������� ����.
	/*Autowired
	 * byname = id�� id�� �ִ� �̸��̶� ���Թ������� �ϴ� String name
	 * ������ ref�� �����ؾ���. 
	 * byname = id�� id�� �ִ� �̸��̶� ���Թ������� �ϴ� String name
	 * AutoWried�� name�� �̸��� �����Ƿ� �׳� ���Խ����ְڴ�.
	 * 
	 * ��� IF{ IF{} } �̷������� ������. 
	 * ���ϴ� Ÿ���� ã�Ҵµ� Ÿ���� �������� ������ �� ����� ��� �亯��
	 * Qualifier("hold"�� �Է��ؾ� ��.
	 */
	@Override
	public String printName() { 
		return "����� �̸��� :" + name + "�Դϴ�.";
	}
	
//	@Autowired
//	public Ex1_AutoWiredService(@Qualifier("hold") String name)
//	{
//		this.name=name;
//	}
	//�ּ�ó���ص� ����
}
