package Ex1;

public class Ex3_DefaultImple implements Ex3_Jdk8{
//������ ������ �Ǵ� ���� �߻� �޼���
	
	@Override
	public void num1() {
	System.out.println("������ ����� �� ���ô�.");
	System.out.println("---------------------");
	System.out.println(test2());
	System.out.println("--------------------");
	//�������̽��� ������ �ִ� static �޼��嵵 ȣ�� �� ���ô�.
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		Ex3_Jdk8 ref = new Ex3_DefaultImple();
		ref.num1();
		ref.test2();
	}
	
	
	
}
