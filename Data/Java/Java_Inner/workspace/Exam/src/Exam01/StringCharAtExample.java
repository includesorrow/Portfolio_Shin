package Exam01;

public class StringCharAtExample {
	
	/*
	 * String subject = "자바 프로그래밍;
	 * char charValue = subject.charAt(3);
	 * -> charAt(3)은 3인덱스 위치에 있는 문자를 말한다. 
	 */
	
	
	
	
	public static void main(String[] args) { // Main 메소드
		String ssn = "010624-1230123";//문자열(String)
		char sex = ssn.charAt(7); // CharAt(x) = x인덱스 위치에 있는 문자를 말한다. 여기서는 String ssn의 인덱스 7번째 문자를 읽어 sex로 저장한다. 
		switch (sex) { //스위치문
		case '1':
			System.out.println("??"); // case '1'의 경우 ?? 출력
		case '3':
			System.out.println("남자 입니다."); // case'3'의 경우 남자입니다 출력
			break;	//case문 빠져나옴
		case '2': // case2인경우 동작은 하지만 동작내용은 아무것도 없음.
		case '4':
			System.out.println("여자 입니다."); // case'4'의경우 여자입니다.출력
			break; //case문 빠져나옴
		
			/*
			 * 여기서 case1을 읽어서 테스트를 해보았다.
			 * 출력값은 ??
			 *          남자입니다.
			 *          
			 * 이렇게 나왔다.
			 * 즉, case1을 들어가고 ??을 출력한 후, case3을 들어가 남자입니다. 를 출력하고 break;를 통과한다.
			 * case1,2,3,4 에서 나가고 싶으면 전부 break;가 필요하다.
			 */
		}
	}
}
