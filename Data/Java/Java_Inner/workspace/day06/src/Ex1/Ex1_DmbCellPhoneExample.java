package Ex1;

import java.util.Scanner;

public class Ex1_DmbCellPhoneExample {
	public static void main(String[] args) {
		//DmbCellPhone ��ü ����
		Ex1_DmbCellPhone dcp = new Ex1_DmbCellPhone("�ڹ���", "����", 10);
		Ex1_EndCall ec = new Ex1_EndCall("");
		Scanner sc = new Scanner(System.in);
		
		//CellPhone���κ��� ��ӹ��� �ʵ�
		System.out.println("�� : " + dcp.getModel());
		System.out.println("���� : " + dcp.getColor());
		
		//DmbCellPhone�� �ʵ�
		System.out.println("ä�� : " + dcp.getChannel());
	
		
		//CellPhone���κ��� ��� ���� �޼ҵ� ȣ��
		
		dcp.powerOn();
		dcp.bell();
		dcp.sendVoice("��������");
		dcp.receiveVoice("�ȳ��ϼ��� ���� ȫ�浿�ε���");
		dcp.sendVoice("��~��~�ݰ����ϴ�");
		dcp.hangUp();
		ec.EndCallMessage();
		ec.EndCallChoice();
		String choice = sc.nextLine();
	
		dcp.turnOffDmb();
		dcp.changeChannelDmb(12);
		dcp.turnOffDmb();
	
		
	}
		//DmbCellPhone�� �޼ҵ� ȣ��
				
	}
	

