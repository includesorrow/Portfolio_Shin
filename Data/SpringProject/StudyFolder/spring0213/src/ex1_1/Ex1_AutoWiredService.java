package ex1_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//bean ����� ��ü
public class Ex1_AutoWiredService implements PrintInter {

	// �ڵ����� ���������� ����� �����ִ� ������̼�
	// byName, byType ���
	// byName�� ������Ƽ�� �̸��� �����ϸ� �ٷ� �ڵ����� ���� �������ش�.
	// byType�� ���� Ÿ���� ������ �˻��ؼ� �ڵ����� ���� �������ش�.
	// @Autowired
	// @Qualifier("hold")
	
	// null�� ����մϴ�
	// @Autowired(required=false)

//	@Autowired
//	@Qualifier("hold")
	private String name;

	@Override
	public String printName() {
		return "����� �̸��� : " + name + "�Դϴ�.";
	}
	
	@Autowired
	public Ex1_AutoWiredService(@Qualifier("hold") String name) {
		this.name = name;
	}
	
	

}
