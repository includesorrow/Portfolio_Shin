package Ex1;

public class Ex1_Main extends Ex1_WindowDemo{
	public static void main(String[] args) {
		//2. �߻� �޼��带 ���� �͸� ���� Ŭ������ �����Ǹ� �� ���
		new Ex1_WindowDemo() {
			@Override
			public void exec1() {
				System.out.println("�ٸ� ���");
			}
		}.exec1();
	}
	@Override
	public void exec1() {
	System.out.println("���������� �ʿ��� �޼��带 �����ؼ� ���");	
	}
	@Override
	public void exec3() {
		// TODO Auto-generated method stub
		super.exec3();
	}
}
