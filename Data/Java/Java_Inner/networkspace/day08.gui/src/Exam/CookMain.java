/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam;


//import java.util.Scanner;


public class CookMain extends RandomValue{
    
	//ServiceCook sdf = new ServiceCook() 
	//public void service() {
	//	System.out.println("주문한 음식은" + co.getMenu("menu");
		
//	}
         public String Region(ServiceCook servicecook){                         //스트링 지역(써비스쿡 / 서비스쿡)
             return servicecook.Food();                                         //리턴 서비스쿡.food. 
         }
         
  public String makeMessage(String name){                                       //스트링 메시지(스티링메시지) // 이건 이름에대한거 출력
        StringBuffer sb = new StringBuffer();                                   //스트링버퍼 sb는 뉴스트링버퍼
        sb.append("안녕하세요").append(name).append("님 반가워요");              //스트링버퍼의 안녕하세요 + 이름 + 님 반가워요 출력.
        return sb.toString();                                                   //리턴값은 sb의 스트링.
  }
  
  
  
  
  
//    public String makeMessage(String name,boolean gender){                    //String인 makeMeesage생성(스트링 이름, 불리안 젠더)
//      StringBuffer sb = new StringBuffer();                                   //스트링버퍼 sb = 뉴 스트링버퍼. 스트링버퍼는 변경이 가능하다.
                                                                                //더 빠르고 적은 메모리 소비
//        if(gender = true){                                                    //if구문
//            sb.append("여성! : 안녕하세요").append(name).append("반갑습니다.");//여성이면 여성! 안녕하세요 반갑습니다. 출력
//        }
//        else{                                                                 //아니라면
//            
//            sb.append("남성! : 안녕하세요").append(name).append("반갑습니다."); //남성! 안녕하세요. 반갑습니다.출력
//        }
//      return sb.toString();                                                   //결과값을 반환한다.
//    }

//	public CookMain() {                                                     //CookMain 생성
//		ko = new KoreaCook(); // ko는 KoreaCook 자바파일                
//		// TODO Auto-generated constructor stub 
//	}
//	public static void main(String[] args) { //메인메소드                   
//            
//            int start = 1;
//            int end = 3;
//            double range = end - start +1;
//            
//		Scanner sc = new Scanner(System.in);//시스템 스캐너
//		
//	CookMain cm = new CookMain(); // Cookmain 은 cm이다.
//	System.out.println("주문자 이름"); // 출력문
//	String name = sc.nextLine(); // name을 입력한값에 집어넣음
//	System.out.println("1. 한국요리 2. 인도요리"); // 출력문
//	String menu = sc.nextLine(); // MENU를 입력한 값에 집어넣음.
//		if(menu.equals("1")) { // if구문 (만약1이면))
//			//inter = new KoreaCook();
//			//cm.s= new KoreaCook();
//			//cm.s.Food();
//		//	cm.co.setMenu(cm.ko.menu); //Cook main 내의 Cook의 set메뉴를 
//										//Cook main 내의 KoreaCook 내의 메뉴로 지정. 
//										// 리턴값 = "한국음식"
//										//추 후 개선예정.
//			
//		}
//		else if(menu.equals("2")) { // 만약 2이면
//			cm.co.setMenu("인도요리"); //Cook main 내의 Cook의 set을 
//			//인도요리로 만듬.
//			//추 후 개선예정.
//		}
//		else if(menu.equals("3")) { //만약 3이면
//			cm.co.setMenu("중국음식"); //setMenu를 중국음식으로 지정
//		}
//		System.out.println(cm.co.getMenu()); // getmenu를 출력
//	
//                
//                
//                
//		
//		
//	
//    
//    
//}
//

}
