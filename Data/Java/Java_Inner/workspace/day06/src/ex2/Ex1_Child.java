package ex2;

public class Ex1_Child extends Ex1_Parent {
	
	//2. Object�� �޼��带 �������Ѱ�
	@Override
	public String toString() {
		return String.valueOf("��ӹ��� �ݾ� :" + getPay());
	}
	
	//1. �����Ǹ� �ؾ��� Ex1_Parent�� ��ӹ��� �� �ִ�.
	@Override
	public void moveMountain() {
		System.out.println("���� ���������� �Ǳ� �� " + toString() + "�޾Ҵ�.");
	}
}
