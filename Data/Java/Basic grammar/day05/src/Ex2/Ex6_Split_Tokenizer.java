package Ex2;

import java.util.StringTokenizer;

public class Ex6_Split_Tokenizer {
	public static void main(String[] args) {
		//StringTokenizer�� �ǹ̾��� whitespace�� ��ū���� ������� �ʴ´�
		//stringTokenizer
		//ȭ��Ʈ�����̽� : �������ڼ��� <<*�� ȭ��Ʈ �����̽�
		//��ū�� (*��) ������ true
		String str = "�����۱��϶�ڱ�������������ۡۼ���";
		StringTokenizer stz = new StringTokenizer(str,"��");
		System.out.println("Total token : " + stz.countTokens());
/*		System.out.println("0. " + stz.nextToken());
		System.out.println("1. " + stz.nextToken());
		System.out.println("2. " + stz.nextToken());
		System.out.println("3. " + stz.nextToken());
*/		while(stz.hasMoreTokens()) {
			System.out.println(stz.nextToken());}

			System.out.println("-----------------");
			String[] arr = str.split("��");
			System.out.println("�迭�� ���� : " +  arr.length);
			for(String e : arr) {
				System.out.println(e);
			}
	}
}
