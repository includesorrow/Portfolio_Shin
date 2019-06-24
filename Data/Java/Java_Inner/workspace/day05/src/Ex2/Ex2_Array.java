package Ex2;

import java.util.Scanner;

class Ex2_Array {

	private String[][] arr1;
	private String msg = "A";
	private Scanner sc;
	private int count;
	
	
	public Ex2_Array() {
		sc = new Scanner(System.in);
		arr1 = new String [2][3];
		for(int i = 0; i <arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				System.out.println("문자열 입력["+i+"]"+"["+j+"] ");
				msg = sc.nextLine();
				arr1[i][j] = msg;
				count++;
			}
		}
	
	}
	//+="" 사용안하기로.
	public String getData(){
		StringBuffer mysb = new StringBuffer();
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				mysb.append("arr1[").append(i).append("][").append(j);
				mysb.append("]:").append(arr1[i][j]).append("\n");
				
			}
		}
		return mysb.toString();
	}
	
	//정답///////////
	/*for(String[] out : arr1) {
		//주소를 통해서 1차원 배열에 접근해서 읽어옴
		for(String in : out) {
			mysb.append(in).append("\n");
		}
	}
	return mysb.toString();
	*/
	//향상된 for문 사용하기
	//기존자료
//	for(int i = 0; i < num1.length; i++) {
	//	System.out.println(num1[i] + "=");
	/*	for(int e: num1) {
			System.out.println(e + "★");
			//이렇게써야함
			 * 
			 */
	
	public static void main(String[] args) {
		System.out.println(new Ex2_Array().getData());
	}
	
}
