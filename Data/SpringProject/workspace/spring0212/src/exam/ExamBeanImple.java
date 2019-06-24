package exam;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ExamBeanImple implements ExamBeanInter, ApplicationContextAware {

	private ExamTypeInter eti;
	private ApplicationContext ctx;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		ctx = applicationContext;
	}
	
	@Override
	public void callExecutebean(String condition) {
		eti = ctx.getBean(condition,ExamTypeInter.class);
	}

	@Override
	public String getMessageBean() {
		return eti.message();
	}

}
