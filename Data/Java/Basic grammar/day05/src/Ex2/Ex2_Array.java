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
				System.out.println("���ڿ� �Է�["+i+"]"+"["+j+"] ");
				msg = sc.nextLine();
				arr1[i][j] = msg;
				count++;
			}
		}
	
	}
	//+="" �����ϱ��.
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
	
	//����///////////
	/*for(String[] out : arr1) {
		//�ּҸ� ���ؼ� 1���� �迭�� �����ؼ� �о��
		for(String in : out) {
			mysb.append(in).append("\n");
		}
	}
	return mysb.toString();
	*/
	//���� for�� ����ϱ�
	//�����ڷ�
//	for(int i = 0; i < num1.length; i++) {
	//	System.out.println(num1[i] + "=");
	/*	for(int e: num1) {
			System.out.println(e + "��");
			//�̷��Խ����
			 * 
			 */
	
	public static void main(String[] args) {
		System.out.println(new Ex2_Array().getData());
	}
	
}
