package Ex1;
//���� ����Ŭ���� : �޼���, ������ ���� �ȿ��� ����
//���ÿ��� ����ǰ� ������ ������ ���������� �����Ѵ�.

public class Ex1_LocalInner {
	private int a;
	public Ex1_LocalInner() { a = 100; }
	//���ó���Ŭ�����ȿ���........���������̾߱�
	//jdk7 ���ϱ����� final�̶�� ���
	//jdk 8���� ���� ���ʹ� final�� ��� ���������� ������
	
	public void insertTest(int num) {
		int b = 200; //���
		int c = num; //���
			class Inner{ //�޼ҵ� ���� �ȿ��� ����
				public void getData() {
					System.out.println("����ʵ� ���� : "+a);
					//�޼������ ����� ������ �� ������
					//���������� ������ �� ����.
					//System.out.println("�������� ����" + (b++)); //���������ε� ����� ��ȭ�ٷ��ϱ� ������
					//System.out.println("��������? + " + (c+=num)); //����ε� ��ȭ�ٷ��� �ϴϱ� ������ 
					//System.out.println(b); // b = 30;������ ������ 
				}
			}
			new Inner().getData();
			b = 30;
			System.out.println("b:" + b);
			
			
			
	}
	
	public static void main(String[] args) {
		new Ex1_LocalInner().insertTest(200);
	}

}
