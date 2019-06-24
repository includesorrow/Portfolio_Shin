package Ex1;

public class Ex5_Const {
	public Ex5_Const() {
		this("test");
		System.out.println("=");
	}
	public Ex5_Const(String str) {
		this(true);
		System.out.println("¡Ù");
		}
	public Ex5_Const(float f) {
		this(10);
		System.out.println("¡Û");
	}
	public Ex5_Const(int n) {
			System.out.println("¡â");
		}
	public Ex5_Const(boolean b) {
		this(3.14f);
		System.out.println("¡á");
	}
	
	
public static void main(String[] args) {
	new Ex5_Const();
}	
	}
	

