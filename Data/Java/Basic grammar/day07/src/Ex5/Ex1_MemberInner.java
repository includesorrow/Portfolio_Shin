package Ex5;

public class Ex1_MemberInner extends SuperA{
//�⺻ ���� ������
	int numA;
	//Ŭ���� ���ο����� ������ ����
	private int numB;
	static int numC;
	public Ex1_MemberInner() {
		numA=10; numB=100; numC=200;
	}
	
	//��������� Ŭ������ ���� : ��� ����Ŭ����
	public class Inner extends SuperB{
		public void printData() {
			System.out.println("intA : " + numA);
			System.out.println("int B : " + numB);//private�ε��� ����. 
			System.out.println("int C : " + numC);
		}
	}
}
