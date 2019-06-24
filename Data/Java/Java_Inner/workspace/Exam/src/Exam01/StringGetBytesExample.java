package Exam01;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class StringGetBytesExample {
	/* // ���ڿ��� ����Ʈ �迭�� ��ȯ�ϴ� ��찡 �ִ�. 
	// ���� ��� ��Ʈ��ũ�� ���ڿ��� �����ϰų�, ��ȣȭ �� �� ���ڿ��� ����Ʈ �迭�� ��ȯ��.
	// �̴� �޼ҵ� ����̴�.
	byte[] bytes1 = "���ڿ�".getBytes();
	byte[] bytes2 = "���ڿ�".getBytes(Charset charset);
	// getBytes() �޼ҵ�� �ý����� �⺻ ���ڼ����� ���ڵ� �� ����Ʈ �迭�� �����Ѵ�. �������̳ĸ� �ؿ� ���� �� ���´�.
	
	try {
		byte[] bytes11 = "���ڿ�".getBytes("EUC-KR");
		byte[] bytes22 = "���ڿ�".getBytes("UTF-8");
	}
	catch (UnsupportedEncodingException e) {
		
	}
	
	
	/*
	 * byte[] bytes = "���ڿ�".getBytes();
	 * 
	 */

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		String str = "�ȳ��ϼ���"; // ��Ʈ�� str�� �ȳ��ϼ���� �����
		
		byte[] bytes1 = str.getBytes(); //byte�迭�� ����µ� �װ� bytes1�̰�, str���� getbytes�� �޴°ž�.
		System.out.println("bytes1.length : "  + bytes1.length);// ����� �ϴµ� " " + ����Ʈ�� ���̸� ����Ѵ�.
		/*
		 * ���⼭ ���ĺ��� 1����Ʈ, �ѱ��� 2����Ʈ�� ��ȯ�Ѵ�. ��, �ȳ��ϼ���� 5*2 = 10����Ʈ
		 */
		String str1 = new String(bytes1); // ��Ʈ�� str1�� �����Ҳ���, �װ� ���ο� �����ε� bytes1(�迭)���� �����°ž�.
		System.out.println("bytes1 -> String : " + str1); // ��� = "bytes1 -> String : " + ��Ʈ�� str1 ���.
		/*
		 * ���⼭ �ȳ��ϼ���� ��µȴ�. �ֳĸ� str1�� bytes1�� �迭�̱� ����.
		 */
		
		
		try { // try�� ����ó�� ����� �ϳ��̴�.
			/*
			 * try������ ������ ����鿡�� ���ܰ� �߻����� �ʴ´ٸ� catch�� ������ ������� ������ ���� �ʴ´�. 
			 * ������ try������ ������� ���� �� �ش翹�ܰ� �߻��ϸ� ���ܿ� �ش�Ǵ� catch���� ����ȴ�.
			 */
			
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length : " + bytes2.length);
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes2 -> String: " + str2);
			
			
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length : " + bytes3.length);
			String str3 = new String(bytes3, "UTF-8");
			System.out.println("bytes3->String : " + str3);

			
		}
		catch(UnsupportedEncodingException e){
			e.printStackTrace();
		}
}
}
