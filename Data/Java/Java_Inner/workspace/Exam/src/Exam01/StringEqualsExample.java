package Exam01;

public class StringEqualsExample {
	String strVar1 = new String("신민철");
	String strVar2 = "신민철";
	String strVar3 = "신민철";
	
	/*
	 * strVar2,3은 동일한 String 객체를 참조한다. 
	 * 그러나 strVar1은 new연산자로 생성된 다른 String 객체를 참조한다.
	 * 
	 * 
	 * strVar1 == strVar2 -> false
	 * strVar2 == strVar3 -> true
	 * 
	 * 혹시 두 String 을 비교하고 싶다면 equals() 메소드를 사용해야 한다.
	 
	strVar1.equals(strVar2) -> true
	strVar2.equals(strVar3) -> true
*/
	
	public static void main(String[] args) { // 메인 메소드
		String strVar1 = new String("신민철"); // 문자열 String strVar1은 새로운 스트링인 "신민철"이다. 
		String strVar2 = "신민철"; // 문자열 스트링 2는 "신민철이다.
		
		if(strVar1 == strVar2) {// 만약 strVar1 == strVar2가 같다면
			System.out.println("같은 String 객체를 참조");// 같은 객체를 참조
			
		}
		else { // if문과 다른것이라면
			System.out.println("다른 String 객체를 참조"); // 다른 객체를 참조
		}
		/*
		 * 여기서는 다른 객체를 참조한다는 result가 나온다.
		 * 위에서 말했듯이 new 연산자로 생성된 다른 String 객체를 참조하기 때문.
		 */
		
		
		
		if(strVar1.equals(strVar2)) { //만약 strVar1이 strVar2와 같다면
			System.out.println("같은 문자열을 가짐"); // 같은 문자열을 가짐이라는 문자를 출력
		}
		else { // if문과 다른 상황이라면
			System.out.println("다른 문자열을 가짐"); // 다른 문자열을 가짐 이라는 문자를 출력
		}
		/*
		 * 여기서는 strVar1과 2가 같다고 나온다. new로 생성된게 아니기 때문.
		 */
	}
}
