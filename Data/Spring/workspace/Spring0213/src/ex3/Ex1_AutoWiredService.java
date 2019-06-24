package ex3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//지금 이걸 BEAN으로 등록할 객체
public class Ex1_AutoWiredService  implements PrintInter{
/*
 * 자동으로 의존관계의 빈들을 묶어주는 어노테이션
 * byName, byType등
 * byname은 프로퍼티와 이름이 동일하면 바로 자동으로 빈을 주입해준다.
 * bytype은 같은 타입이 있으면 검색해서 자동으로 빈을 주입해준다.
 * @Autowired
 * @Qualifier("hold")
 * null을 허용합니다
 * @Autowired(required=false)
 */
	@Autowired(required=false)
	//false 	//NULL 허용
	@Qualifier("hold")
	private String name;
	//현재 초기화도 안했고 setter로 넣어주지도 않음.
	/*Autowired
	 * byname = id랑 id에 있는 이름이랑 주입받을려고 하는 String name
	 * 원래는 ref로 참조해야함. 
	 * byname = id랑 id에 있는 이름이랑 주입받을려고 하는 String name
	 * AutoWried는 name이 이름이 같으므로 그냥 주입시켜주겠다.
	 * 
	 * 얘는 IF{ IF{} } 이런식으로 구분함. 
	 * 원하는 타입을 찾았는데 타입이 여러개가 있으면 난 몰라요 라고 답변함
	 * Qualifier("hold"를 입력해야 함.
	 */
	@Override
	public String printName() { 
		return "당신의 이름은 :" + name + "입니다.";
	}
	
//	@Autowired
//	public Ex1_AutoWiredService(@Qualifier("hold") String name)
//	{
//		this.name=name;
//	}
	//주석처리해도 들어간다
}
