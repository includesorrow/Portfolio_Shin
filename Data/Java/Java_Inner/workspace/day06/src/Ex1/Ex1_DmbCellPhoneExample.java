package Ex1;

import java.util.Scanner;

public class Ex1_DmbCellPhoneExample {
	public static void main(String[] args) {
		//DmbCellPhone 객체 생성
		Ex1_DmbCellPhone dcp = new Ex1_DmbCellPhone("자바폰", "검정", 10);
		Ex1_EndCall ec = new Ex1_EndCall("");
		Scanner sc = new Scanner(System.in);
		
		//CellPhone으로부터 상속받은 필드
		System.out.println("모델 : " + dcp.getModel());
		System.out.println("색상 : " + dcp.getColor());
		
		//DmbCellPhone의 필드
		System.out.println("채널 : " + dcp.getChannel());
	
		
		//CellPhone으로부터 상속 받은 메소드 호출
		
		dcp.powerOn();
		dcp.bell();
		dcp.sendVoice("여보세요");
		dcp.receiveVoice("안녕하세요 저는 홍길동인데요");
		dcp.sendVoice("아~예~반갑습니다");
		dcp.hangUp();
		ec.EndCallMessage();
		ec.EndCallChoice();
		String choice = sc.nextLine();
	
		dcp.turnOffDmb();
		dcp.changeChannelDmb(12);
		dcp.turnOffDmb();
	
		
	}
		//DmbCellPhone의 메소드 호출
				
	}
	

