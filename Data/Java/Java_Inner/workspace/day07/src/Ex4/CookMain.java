package Ex4;

import java.util.Scanner;

public class CookMain {
	
	Cook co = new Cook(); // co 는 Cook자바파일
	KoreaCook ko = new KoreaCook() ;
	//ServiceCook sdf = new ServiceCook() ;
	 ServiceCook s;
	//public void service() {
	//	System.out.println("주문한 음식은" + co.getMenu("menu");
		
//	}


	public CookMain() {
		ko = new KoreaCook(); // ko는 KoreaCook 자바파일
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) { //메인메소드
		Scanner sc = new Scanner(System.in);//시스템 스캐너
		
	CookMain cm = new CookMain(); // Cookmain 은 cm이다.
	System.out.println("주문자 이름"); // 출력문
	String name = sc.nextLine(); // name을 입력한값에 집어넣음
	System.out.println("1. 한국요리 2. 인도요리"); // 출력문
	String menu = sc.nextLine(); // MENU를 입력한 값에 집어넣음.
		if(menu.equals("1")) { // if구문 (만약1이면))
			//inter = new KoreaCook();
			//cm.s= new KoreaCook();
			//cm.s.Food();
			cm.co.setMenu(cm.ko.menu); //Cook main 내의 Cook의 set메뉴를 
										//Cook main 내의 KoreaCook 내의 메뉴로 지정. 
										// 리턴값 = "한국음식"
										//추 후 개선예정.
			
		}
		else if(menu.equals("2")) { // 만약 2이면
			cm.co.setMenu("인도요리"); //Cook main 내의 Cook의 set을 
			//인도요리로 만듬.
			//추 후 개선예정.
		}
		else if(menu.equals("3")) { //만약 3이면
			cm.co.setMenu("중국음식"); //setMenu를 중국음식으로 지정
		}
		System.out.println(cm.co.getMenu()); // getmenu를 출력
	
		
		
	
	////
	//ServiceCook service = new ServiceCook();
	//service.service(name,menu);
	//System.out.println("주문자 이름은 " + name + " 이고, 메뉴는" + ServiceCook.Food() + "이다.");
	//}
/*
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("주문자이름");
		String name = sc.nextLine();
		System.out.println("1. 한국요리 2. 인도요리");	
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
