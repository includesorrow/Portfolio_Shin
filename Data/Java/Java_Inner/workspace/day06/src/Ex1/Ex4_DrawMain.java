package Ex1;

public class Ex4_DrawMain {
	public static void main(String[] args) {
		//-------------�޸� ���� �׸��� �����ϱ�
		Ex4_Circle cir = new Ex4_Circle();
		Ex4_Rect rec = new Ex4_Rect();
		Ex4_Triangle tr = new Ex4_Triangle();
		
		System.out.println("�� : " + cir.drawSomething(cir.getPi(), cir.getRadius(),
									cir.getRadius()));
		System.out.println("�簢�� : " + rec.drawSomething(rec.getWidth(),
										rec.getHeight(),1));
		System.out.println("�ﰢ�� :");
	}

}
