package Ex5;

public class Ex1_MemberMain {
	public static void main(String[] args) {
		/*�ٽ�����Ʈ
		 * ���� Ŭ������ �����Ϸ��� �� ����
		 * �ܺ� Ŭ������ ������ �� �� �ּҸ� �����ؼ�
		 * �ٽ� ���� Ŭ������ �����ϴ� ����̴�.
		 * 
		 */
		
		//1. �ܺ�Ŭ���� ����
		Ex1_MemberInner outer = new Ex1_MemberInner();
		//2. �ܺ�Ŭ������ �ּҰ��� ������ ���� ����  outer�� ����Ŭ������ ����
		outer.SuperA();
		Ex1_MemberInner.Inner inner;
		inner = outer.new Inner();
		inner.printData();
		inner.SuperB();
		System.out.println("===================");
		//��������
		//�ܺ�Ŭ������ ������ �� ���� Ŭ������ �����ϰ��� �� ��
		//���ٷ� �����ϰ� �ٷ� ����Ʈdata
		inner.printData();
		
		
		//�ؿ�������
		//�͸����� ��ü�� �����ϴ� ������� printData()�� ȣ��
		new Ex1_MemberInner().new Inner().printData();
	}
}
