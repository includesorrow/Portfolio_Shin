package Ex1;

public class Ex2_Main {
	
	
	public static void testaa() {
		
	}
	//���ο� testaa(); ȣ���� �ȵ�.
	//ex2_main�� �����ϴ��� static�� �����ϴ��� �ؾ���
	
	public static void main(String[] args) {
		//testaa();
		//testaa��� �޼��带 ȣ����.
		
		//������ ȣ��
		
		Ex2_Static ref1 = new Ex2_Static();
		Ex2_Static ref2 = new Ex2_Static();
		Ex2_Static ref3 = new Ex2_Static();
		//�� ��ü�� �޼ҵ� ȣ��

		
		ref1.startTest(); // num1 - 1
		ref2.startTest(); // num1 - 2
		//���

		System.out.println("static num1 : " + ref1.getNum1());
		System.out.println("non static num2 : " + ref1.getNum2());
		System.out.println("-----------------------------");
		System.out.println("static num 1 : " + ref2.getNum1());
		System.out.println("non static num2 : " + ref2.getNum2());
		
		System.out.println("statnum1 : " + ref1.getNum1());

		System.out.println("statnum1 : " + ref2.getNum1());
		
		
		System.out.println("startnum1 : " + ref3.getNum1());
		
		
		System.out.println(Ex2_Static.getNum1());
		
		
		
		
		
		/*
		 * static num1 : 2
		 * non static num 2 : 1
		 * static num1 : 2
		 * nonstatic num 2 : 1
		 * 
		 * 
		 */
}
}
