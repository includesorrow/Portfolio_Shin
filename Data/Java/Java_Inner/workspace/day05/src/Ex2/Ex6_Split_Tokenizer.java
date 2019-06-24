package Ex2;

import java.util.StringTokenizer;

public class Ex6_Split_Tokenizer {
	public static void main(String[] args) {
		//StringTokenizer는 의미없는 whitespace를 토큰으로 취급하지 않는다
		//stringTokenizer
		//화이트스페이스 : 전지현★수지 <<*이 화이트 스페이스
		//토큰이 (*이) 있으면 true
		String str = "김길봉○구하라★김수현○전지현○○수지";
		StringTokenizer stz = new StringTokenizer(str,"○");
		System.out.println("Total token : " + stz.countTokens());
/*		System.out.println("0. " + stz.nextToken());
		System.out.println("1. " + stz.nextToken());
		System.out.println("2. " + stz.nextToken());
		System.out.println("3. " + stz.nextToken());
*/		while(stz.hasMoreTokens()) {
			System.out.println(stz.nextToken());}

			System.out.println("-----------------");
			String[] arr = str.split("○");
			System.out.println("배열의 길이 : " +  arr.length);
			for(String e : arr) {
				System.out.println(e);
			}
	}
}
