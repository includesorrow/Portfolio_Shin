package Ex1;

public class Ex2_Imple implements Ex2_Inter{
	@Override
	public void test() {
	System.out.println("�������̽� ��� �� : " + num1);	
	}
	
	@Override
	public void test2() {
	System.out.println("�������̽� ��� �� : " + num2);	
	}
	
	public static void main(String[] args) {
		//�������̽��� ���� �ڷ������� ���� Ŭ������ ��ü�� ����
		Ex2_Inter ref = new Ex2_Imple();
		ref.test();
		ref.test2();
		
	}
}
