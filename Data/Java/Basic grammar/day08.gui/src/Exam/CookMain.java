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
	//	System.out.println("�ֹ��� ������" + co.getMenu("menu");
		
//	}
         public String Region(ServiceCook servicecook){                         //��Ʈ�� ����(����� / ������)
             return servicecook.Food();                                         //���� ������.food. 
         }
         
  public String makeMessage(String name){                                       //��Ʈ�� �޽���(��Ƽ���޽���) // �̰� �̸������Ѱ� ���
        StringBuffer sb = new StringBuffer();                                   //��Ʈ������ sb�� ����Ʈ������
        sb.append("�ȳ��ϼ���").append(name).append("�� �ݰ�����");              //��Ʈ�������� �ȳ��ϼ��� + �̸� + �� �ݰ����� ���.
        return sb.toString();                                                   //���ϰ��� sb�� ��Ʈ��.
  }
  
  
  
  
  
//    public String makeMessage(String name,boolean gender){                    //String�� makeMeesage����(��Ʈ�� �̸�, �Ҹ��� ����)
//      StringBuffer sb = new StringBuffer();                                   //��Ʈ������ sb = �� ��Ʈ������. ��Ʈ�����۴� ������ �����ϴ�.
                                                                                //�� ������ ���� �޸� �Һ�
//        if(gender = true){                                                    //if����
//            sb.append("����! : �ȳ��ϼ���").append(name).append("�ݰ����ϴ�.");//�����̸� ����! �ȳ��ϼ��� �ݰ����ϴ�. ���
//        }
//        else{                                                                 //�ƴ϶��
//            
//            sb.append("����! : �ȳ��ϼ���").append(name).append("�ݰ����ϴ�."); //����! �ȳ��ϼ���. �ݰ����ϴ�.���
//        }
//      return sb.toString();                                                   //������� ��ȯ�Ѵ�.
//    }

//	public CookMain() {                                                     //CookMain ����
//		ko = new KoreaCook(); // ko�� KoreaCook �ڹ�����                
//		// TODO Auto-generated constructor stub 
//	}
//	public static void main(String[] args) { //���θ޼ҵ�                   
//            
//            int start = 1;
//            int end = 3;
//            double range = end - start +1;
//            
//		Scanner sc = new Scanner(System.in);//�ý��� ��ĳ��
//		
//	CookMain cm = new CookMain(); // Cookmain �� cm�̴�.
//	System.out.println("�ֹ��� �̸�"); // ��¹�
//	String name = sc.nextLine(); // name�� �Է��Ѱ��� �������
//	System.out.println("1. �ѱ��丮 2. �ε��丮"); // ��¹�
//	String menu = sc.nextLine(); // MENU�� �Է��� ���� �������.
//		if(menu.equals("1")) { // if���� (����1�̸�))
//			//inter = new KoreaCook();
//			//cm.s= new KoreaCook();
//			//cm.s.Food();
//		//	cm.co.setMenu(cm.ko.menu); //Cook main ���� Cook�� set�޴��� 
//										//Cook main ���� KoreaCook ���� �޴��� ����. 
//										// ���ϰ� = "�ѱ�����"
//										//�� �� ��������.
//			
//		}
//		else if(menu.equals("2")) { // ���� 2�̸�
//			cm.co.setMenu("�ε��丮"); //Cook main ���� Cook�� set�� 
//			//�ε��丮�� ����.
//			//�� �� ��������.
//		}
//		else if(menu.equals("3")) { //���� 3�̸�
//			cm.co.setMenu("�߱�����"); //setMenu�� �߱��������� ����
//		}
//		System.out.println(cm.co.getMenu()); // getmenu�� ���
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
