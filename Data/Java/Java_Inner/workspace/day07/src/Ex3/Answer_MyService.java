package Ex3;

public class Answer_MyService {
	Answer_SelectListModel sm;
	//SelectViewModel»ý¼º
	SelectViewModel svm;
	
	public Answer_MyService() {}
	
	
	public void service(String cmd) {
		if(cmd.equals("1")) {
			sm = new Answer_SelectListModel();
		System.out.println(sm.exec());
		
		}
		else {
			svm = new SelectViewModel();
		System.out.println(svm.execview());
		}
		}
}
