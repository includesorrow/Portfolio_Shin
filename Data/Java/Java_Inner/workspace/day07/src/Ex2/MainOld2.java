package Ex2;

public class MainOld2 {
	public static void main(String[] args) {

		MyInter[] mi = new MyInter[2];
		mi[0] = new MyTeamOldA();
		mi[1] = new MyTeamOldB();
		
		for(MyInter e : mi) {
			e.draw();
			e.paint();
			System.out.println("---------------");
		}
				
		MyInter i = new MyTeamOldA();
		i.paint();
		i.draw();
	
	}}
