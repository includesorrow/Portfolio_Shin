package Ex2;
//인터페이스는 다중구현도 가능하다.
public class MyTeamOldB implements MyColor, MyDraw, MyInter{

	@Override
	public void draw() {
	System.out.println("B팀이 그림을 그립니다.");	
	}
	
	@Override
	public void paint() {
	System.out.println("B팀이 초록색을 칠합니다.");	
	}
}
