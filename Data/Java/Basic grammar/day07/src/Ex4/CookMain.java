package Ex4;

import java.util.Scanner;

public class CookMain {
	
	Cook co = new Cook(); // co �� Cook�ڹ�����
	KoreaCook ko = new KoreaCook() ;
	//ServiceCook sdf = new ServiceCook() ;
	 ServiceCook s;
	//public void service() {
	//	System.out.println("�ֹ��� ������" + co.getMenu("menu");
		
//	}


	public CookMain() {
		ko = new KoreaCook(); // ko�� KoreaCook �ڹ�����
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) { //���θ޼ҵ�
		Scanner sc = new Scanner(System.in);//�ý��� ��ĳ��
		
	CookMain cm = new CookMain(); // Cookmain �� cm�̴�.
	System.out.println("�ֹ��� �̸�"); // ��¹�
	String name = sc.nextLine(); // name�� �Է��Ѱ��� �������
	System.out.println("1. �ѱ��丮 2. �ε��丮"); // ��¹�
	String menu = sc.nextLine(); // MENU�� �Է��� ���� �������.
		if(menu.equals("1")) { // if���� (����1�̸�))
			//inter = new KoreaCook();
			//cm.s= new KoreaCook();
			//cm.s.Food();
			cm.co.setMenu(cm.ko.menu); //Cook main ���� Cook�� set�޴��� 
										//Cook main ���� KoreaCook ���� �޴��� ����. 
										// ���ϰ� = "�ѱ�����"
										//�� �� ��������.
			
		}
		else if(menu.equals("2")) { // ���� 2�̸�
			cm.co.setMenu("�ε��丮"); //Cook main ���� Cook�� set�� 
			//�ε��丮�� ����.
			//�� �� ��������.
		}
		else if(menu.equals("3")) { //���� 3�̸�
			cm.co.setMenu("�߱�����"); //setMenu�� �߱��������� ����
		}
		System.out.println(cm.co.getMenu()); // getmenu�� ���
	
		
		
	
	////
	//ServiceCook service = new ServiceCook();
	//service.service(name,menu);
	//System.out.println("�ֹ��� �̸��� " + name + " �̰�, �޴���" + ServiceCook.Food() + "�̴�.");
	//}
/*
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("�ֹ����̸�");
		String name = sc.nextLine();
		System.out.println("1. �ѱ��丮 2. �ε��丮");	
		String menu = sc.nextLine();
		if(menu.contentEquals("1")) {
		 KoreaCook kr = new KoreaCook();
		 kr.orderkorCook(name);
		}
		else if(menu.contentEquals("2")) {
			IndoCook indo = new IndoCook();
			indo.orderindoCook(name);
		}
	}
	*/

	}
}
