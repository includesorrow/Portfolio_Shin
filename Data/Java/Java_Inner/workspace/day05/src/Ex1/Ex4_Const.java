package Ex1;

public class Ex4_Const {
	private String msg;
	private int num;
	
	public Ex4_Const() {
		System.out.println("Test1");
	}
	//�������� ���� ������ ����� �ڿ��� �ܺο��� �޾ƿͼ� �ʱ�ȭ��
	//�����ڴ� ������ ȣ���ϸ� ������ �����ȴ�
	//�����ڸ� �����ε����� ���� ����
	
	public Ex4_Const(String msg, int num) {
		//this : ���� ��ü�� �ּҰ�
		this(); // �⺻ ������ ȣ��. ���� ù �ٿ� �־�� �Ѵ�
		
		System.out.println("Test2");
		this.msg = msg;
		this.num = num;
		
	
	}
	
	public Ex4_Const(String msg) {
		this.msg = msg;
		num = 10;
	}
	public Ex4_Const(int num) {
		this.num = num;
		msg = "hi";
	}
	public void print() {
		System.out.println("MSG : " + msg);
	}
	
	public static void main(String[] args) {
		//Ex4_Const ref1 = new Ex4_Const("hihi");
		//ref1.print();
		Ex4_Const ref2 = new Ex4_Const(30);
		ref2.print();
		//Ex4_Const ref3 = new Ex4_Const("hihi2", 50);
	//	ref3.print();
	}
}
