package Exam01;

public class StringEqualsExample {
	String strVar1 = new String("�Ź�ö");
	String strVar2 = "�Ź�ö";
	String strVar3 = "�Ź�ö";
	
	/*
	 * strVar2,3�� ������ String ��ü�� �����Ѵ�. 
	 * �׷��� strVar1�� new�����ڷ� ������ �ٸ� String ��ü�� �����Ѵ�.
	 * 
	 * 
	 * strVar1 == strVar2 -> false
	 * strVar2 == strVar3 -> true
	 * 
	 * Ȥ�� �� String �� ���ϰ� �ʹٸ� equals() �޼ҵ带 ����ؾ� �Ѵ�.
	 
	strVar1.equals(strVar2) -> true
	strVar2.equals(strVar3) -> true
*/
	
	public static void main(String[] args) { // ���� �޼ҵ�
		String strVar1 = new String("�Ź�ö"); // ���ڿ� String strVar1�� ���ο� ��Ʈ���� "�Ź�ö"�̴�. 
		String strVar2 = "�Ź�ö"; // ���ڿ� ��Ʈ�� 2�� "�Ź�ö�̴�.
		
		if(strVar1 == strVar2) {// ���� strVar1 == strVar2�� ���ٸ�
			System.out.println("���� String ��ü�� ����");// ���� ��ü�� ����
			
		}
		else { // if���� �ٸ����̶��
			System.out.println("�ٸ� String ��ü�� ����"); // �ٸ� ��ü�� ����
		}
		/*
		 * ���⼭�� �ٸ� ��ü�� �����Ѵٴ� result�� ���´�.
		 * ������ ���ߵ��� new �����ڷ� ������ �ٸ� String ��ü�� �����ϱ� ����.
		 */
		
		
		
		if(strVar1.equals(strVar2)) { //���� strVar1�� strVar2�� ���ٸ�
			System.out.println("���� ���ڿ��� ����"); // ���� ���ڿ��� �����̶�� ���ڸ� ���
		}
		else { // if���� �ٸ� ��Ȳ�̶��
			System.out.println("�ٸ� ���ڿ��� ����"); // �ٸ� ���ڿ��� ���� �̶�� ���ڸ� ���
		}
		/*
		 * ���⼭�� strVar1�� 2�� ���ٰ� ���´�. new�� �����Ȱ� �ƴϱ� ����.
		 */
	}
}
