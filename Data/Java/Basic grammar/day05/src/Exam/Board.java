package Exam;

import java.util.Scanner;

public class Board {
//bbs
	public Board() {
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int main = 0; main <= 9999; main++) {
		System.out.println("1. �� �ۼ� 2. ��� 3. �󼼺��� 9. ����");
		int input = Integer.parseInt(sc.nextLine());
		if(input == 1) {
			System.out.println("����");
		//error	title = scan.next();
			System.out.println("�ۼ���");

			System.out.println("����");
		}
		else if(input == 2) {
			
		}
		else if(input == 3) {
			break;
		}
		else if(input == 9) {
			break;
		}
	}
	//+setWriter(bbs : BoardVO, idx : int) : void
	//+getBbs() : BoardVO[]
	
	
}
}

