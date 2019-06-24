package Exam01;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class StringGetBytesExample {
	/* // 문자열을 바이트 배열로 변환하는 경우가 있다. 
	// 예를 들어 네트워크로 문자열을 전송하거나, 암호화 할 때 문자열을 바이트 배열로 변환함.
	// 이는 메소드 방법이다.
	byte[] bytes1 = "문자열".getBytes();
	byte[] bytes2 = "문자열".getBytes(Charset charset);
	// getBytes() 메소드는 시스템의 기본 문자셋으로 인코딩 된 바이트 배열을 리턴한다. 무슨말이냐면 밑에 설명 더 나온다.
	
	try {
		byte[] bytes11 = "문자열".getBytes("EUC-KR");
		byte[] bytes22 = "문자열".getBytes("UTF-8");
	}
	catch (UnsupportedEncodingException e) {
		
	}
	
	
	/*
	 * byte[] bytes = "문자열".getBytes();
	 * 
	 */

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		String str = "안녕하세요"; // 스트링 str이 안녕하세요로 저장됨
		
		byte[] bytes1 = str.getBytes(); //byte배열을 만드는데 그건 bytes1이고, str에서 getbytes를 받는거야.
		System.out.println("bytes1.length : "  + bytes1.length);// 출력을 하는데 " " + 바이트의 길이를 출력한다.
		/*
		 * 여기서 알파벳은 1바이트, 한글은 2바이트로 변환한다. 즉, 안녕하세요는 5*2 = 10바이트
		 */
		String str1 = new String(bytes1); // 스트링 str1을 생성할껀데, 그건 새로운 생성인데 bytes1(배열)에서 떠오는거야.
		System.out.println("bytes1 -> String : " + str1); // 출력 = "bytes1 -> String : " + 스트링 str1 출력.
		/*
		 * 여기서 안녕하세요로 출력된다. 왜냐면 str1은 bytes1의 배열이기 때문.
		 */
		
		
		try { // try는 예외처리 기법중 하나이다.
			/*
			 * try문안의 수행할 문장들에서 예외가 발생하지 않는다면 catch문 다음의 문장들은 수행이 되지 않는다. 
			 * 하지만 try문안의 문장들을 수행 중 해당예외가 발생하면 예외에 해당되는 catch문이 수행된다.
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
