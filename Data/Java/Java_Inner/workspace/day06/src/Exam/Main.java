package Exam;


public class Main {

	public static void main(String[] args) {
		//내가했던거
	//	Circle cr = new Circle();
	//	Rect re = new Rect();
	//	Triangle tr = new Triangle();
		
		
	Draw[] draw = new Draw[3];
			draw[0] = new Circle();
		draw[1] = new Rect();
		draw[2] = new Triangle();
		
		for (Draw dr : draw) {
			dr.draw();
			
		}
		
		
		
	/*
	 * 내가 했던거
	 * 	Draw draw = null;
	 * 	draw = new Circle();
		draw.draw();
		
		draw = new Triangle();
		draw.draw();
		
		draw = new Rect();
		draw.draw();
		System.out.println("-----------");
	 */
		
	
		
		
		
		
		
		
/*		new Draw() {
		public void draw() {
			System.out.println("ㅎㅎ");
		}
	}.draw();
		
	}
	*/
		
		
		
		
	/*
	Ex1_Parent ref = new Ex1_Child();
	ref.moveMountain();
	//익명 내부 클래스로 정의 됨.
	new Ex1_Parent() {
		public void moveMountain() {
			System.out.println("새로운 재정의");
		}
	}.moveMountain();

	 */
	
}
}
