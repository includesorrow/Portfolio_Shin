package Ex1;

public class Ex4_DrawMain {
	public static void main(String[] args) {
		//-------------메모리 구조 그리고 설명하기
		Ex4_Circle cir = new Ex4_Circle();
		Ex4_Rect rec = new Ex4_Rect();
		Ex4_Triangle tr = new Ex4_Triangle();
		
		System.out.println("원 : " + cir.drawSomething(cir.getPi(), cir.getRadius(),
									cir.getRadius()));
		System.out.println("사각형 : " + rec.drawSomething(rec.getWidth(),
										rec.getHeight(),1));
		System.out.println("삼각형 :");
	}

}
