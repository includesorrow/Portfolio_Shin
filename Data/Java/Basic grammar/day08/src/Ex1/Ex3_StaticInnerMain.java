package Ex1;

public class Ex3_StaticInnerMain {
	public static void main(String[] args) {
		//static�� �������� ����� �����ϴ�
		//���� ��ü�� �����ؼ� ����(����)�ϴ��� static ������ ���� �ϳ���.
		//static�� ������ �ܺ� Ŭ����.static�ڿ�
		//�ܺ� Ŭ���� thisó�� �־�� ��
		Ex2_StaticInner.Inner.printData();
		System.out.println("------------------");
		//printData2() ȣ���غ���
		new Ex2_StaticInner.Inner().printData2();
		Ex2_StaticInner.Inner ref = new Ex2_StaticInner.Inner();
		ref.printData2();

	//��ü�� �ܺ� Ŭ�������� �����ؾ� ��
	}
}
