package ex2;

public class Ex1_Main {
	public static void main(String[] args) {
		//�߻� Ŭ������ �ش� �θ� Ŭ������ �ٸ� Ŭ�������� �������� �ʵ��� �� ���� �����ؼ� ����Ѵ�.
	
	
	Ex1_Parent ref = new Ex1_Child();
	ref.moveMountain();
	//�͸� ���� Ŭ������ ���� ��.
	new Ex1_Parent() {
		public void moveMountain() {
			System.out.println("���ο� ������");
		}
	}.moveMountain();

	
	
}
}