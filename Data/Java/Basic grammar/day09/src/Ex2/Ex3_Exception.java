/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex2;

/**
 *
 * @author KOSTA
 */
public class Ex3_Exception {
    
    private int[] var = {100, 200, 300};
    public Ex3_Exception(){
        try{
            for(int i = 0; i <= var.length; i++){
                System.out.println(i + "" + var[i]);
            }
        }catch(Exception e){
            //������ �޽����� ���
            e.printStackTrace();
            System.out.println("�迭�� ������ �Ѿ����ϴ�.");
            return; //�̰� �����ص� �Ǳ� ��. �ٵ� 
        }finally{
            //����ó���� ������� ������ ������ �Ǵ� ����!
            System.out.println("���� ����! ������ ����");
        }
        System.out.println("���� ����! ������ ����");
    }
    public static void main(String[] args) {
        Ex3_Exception ex = new Ex3_Exception();
        Ex3_Exception ex1 = ex;
        
    }
    
}
