package Ex2;

public class Ex4_Anon {
/*
 * �͸��� ���� �ּҰ� ���� ��ü�� �����ϴ� ���� �ǹ��ϴµ�
 * �͸� ����Ŭ������ �������̽�, �߻�Ŭ������ new �����ڷ� ������ �� ����
 * �͸� ����Ŭ������ ������ �� �ڿ��� ȣ���ϴ� �����̴�.
 * �� �ܿ� �Ϲ� Ŭ������ �͸� ����Ŭ������ ���� ����� �� �ֵ�.
 */
	//����������� �͸� ����Ŭ������ ����
	//�͸� = Ŭ���� �̸� ��ü�� ��� �͸��� ����.
	MyTest test = new MyTest() { //�� �����ڴ� ��������
		
		@Override
		public void printData() {
			System.out.println("data2:" + data);
			
		}
	};
	public Ex4_Anon() {
		test.printData();
		
	}
	public void mytest() {
		//���� ����Ŭ���� �������� ����� ��
		new MyTest() {
			
			@Override
			public void printData() {
				System.out.println("data:" + data);
				
			}
		}.printData();
	}
	public static void main(String[] args) {
		//�����ڷ���, ���� ���� �ٷ� ���� �� �޼��� ȣ��
		//new Ex4_Anon().mytest();
		Ex4_Anon ref = new Ex4_Anon();
		ref.mytest();
	}
}
