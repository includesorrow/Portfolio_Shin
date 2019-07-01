package Ex2;
//인터페이스는 다중구현도 가능하다.
public class MyTeamOldA implements MyColor, MyDraw, MyInter{

	@Override
	public void draw() {
	System.out.println("A팀이 그림을 그립니다.");	
	}
	
	@Override
	public void paint() {
	System.out.println("A팀이 노란색을 칠합니다.");	
	}
}
