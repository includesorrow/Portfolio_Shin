package ex1.controller;
// 서블릿의 모든 요청(Thread)을 위임받는 객체 

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

// 싱글톤 처리 


import ex1.model.IndexModel;
import ex1.model.ModelInter;


public class ModelFactory {
	private static ModelFactory factory;
	private Properties prop;
	private ModelFactory() {
		prop = new Properties();
	}

	public static synchronized ModelFactory getFactory() {
		if (factory == null) {
			factory = new ModelFactory();
		}
		return factory;
	}

	public ModelInter getModel(String cmd) {
		ModelInter model = null;
		if (cmd != null) {
			String path ="C:\\bigdataStudy\\spring\\workspace\\jsp0222_mybatis_resultMap\\src\\ex1\\controller\\classinfo.properties";
			try {
				prop.load(new FileReader(path));
				String rPath = prop.getProperty(cmd, "index");
				System.out.println("Key:"+rPath);
				//요청(cmd)에 따른 모델 객체만 Class로 로드
				Class<ModelInter> hClass = 
						(Class<ModelInter>) Class.forName(rPath);
				// 로드된 클래스를 객체로 생성해서 Interface로 반환
				model = hClass.newInstance();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		return model;
	}
}


