package Exam01;

public class StringCharAtExample {
	
	/*
	 * String subject = "�ڹ� ���α׷���;
	 * char charValue = subject.charAt(3);
	 * -> charAt(3)�� 3�ε��� ��ġ�� �ִ� ���ڸ� ���Ѵ�. 
	 */
	
	
	
	
	public static void main(String[] args) { // Main �޼ҵ�
		String ssn = "010624-1230123";//���ڿ�(String)
		char sex = ssn.charAt(7); // CharAt(x) = x�ε��� ��ġ�� �ִ� ���ڸ� ���Ѵ�. ���⼭�� String ssn�� �ε��� 7��° ���ڸ� �о� sex�� �����Ѵ�. 
		switch (sex) { //����ġ��
		case '1':
			System.out.println("??"); // case '1'�� ��� ?? ���
		case '3':
			System.out.println("���� �Դϴ�."); // case'3'�� ��� �����Դϴ� ���
			break;	//case�� ��������
		case '2': // case2�ΰ�� ������ ������ ���۳����� �ƹ��͵� ����.
		case '4':
			System.out.println("���� �Դϴ�."); // case'4'�ǰ�� �����Դϴ�.���
			break; //case�� ��������
		
			/*
			 * ���⼭ case1�� �о �׽�Ʈ�� �غ��Ҵ�.
			 * ��°��� ??
			 *          �����Դϴ�.
			 *          
			 * �̷��� ���Դ�.
			 * ��, case1�� ���� ??�� ����� ��, case3�� �� �����Դϴ�. �� ����ϰ� break;�� ����Ѵ�.
			 * case1,2,3,4 ���� ������ ������ ���� break;�� �ʿ��ϴ�.
			 */
		}
	}
}
