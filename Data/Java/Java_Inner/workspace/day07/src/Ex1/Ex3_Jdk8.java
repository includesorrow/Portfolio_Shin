package Ex1;

public interface Ex3_Jdk8 {
	public int num2 = 20; //���
	public void num1(); // �߻�޼���
	//jdk 8���� ���� , static �޼���
	public static void test() {
		System.out.println("static test");
	}
	//default �޼���!
	default public String test2() {
		return "���� ������� ������� ���̷�";
		//system.out.println("�⺻ ��");
	}
	default public void name() {
		System.out.println("�⺻ �޼��带 ����");
	}
	

}
