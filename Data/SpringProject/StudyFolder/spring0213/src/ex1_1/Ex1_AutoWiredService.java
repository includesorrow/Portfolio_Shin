package ex1_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//bean 등록할 객체
public class Ex1_AutoWiredService implements PrintInter {

	// 자동으로 의존관계의 빈들을 묶어주는 어노테이션
	// byName, byType 등등
	// byName은 프로퍼티와 이름이 동일하면 바로 자동으로 빈을 주입해준다.
	// byType은 같은 타입이 있으면 검색해서 자동으로 빈을 주입해준다.
	// @Autowired
	// @Qualifier("hold")
	
	// null을 허용합니다
	// @Autowired(required=false)

//	@Autowired
//	@Qualifier("hold")
	private String name;

	@Override
	public String printName() {
		return "당신의 이름은 : " + name + "입니다.";
	}
	
	@Autowired
	public Ex1_AutoWiredService(@Qualifier("hold") String name) {
		this.name = name;
	}
	
	

}
