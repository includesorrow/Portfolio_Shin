package Ex1;

public class Ex2_StaticInner {
	int numA;
	private int numB;
	static int numC = 500;
	public void test() {
		System.out.println("Test!");
	
	}
	public Ex2_StaticInner() {
		numA = 10; numB = 100; numC=200;
	}
	
	//���� Ŭ���� �ȿ��� static �ڿ��� ������ ������ static ���� Ŭ������ ��������� �Ѵ�.
	
	public static class Inner {
		static int d = 10000;
		public static void printData() {
			//System.out.println("int A " + numA); 
			//������ ���� ������ numA�� numB�� ��ü�� ������ �Ŀ� �ҷ��;���. �ν���Ʈ �ļ���. static�ڿ��� ������. 
			//System.out.println("int B " + numB);
			
			System.out.println("int C " + numC);
			System.out.println("int D " + d);
		}
		
		public class asdf {
			int e = 10000;
			public void print() {
				System.out.println("int e " + e);
			}
		}
		public void printData2() {
			System.out.println("c:" + numC);
			System.out.println("d:" + d);
		}
	}
}
