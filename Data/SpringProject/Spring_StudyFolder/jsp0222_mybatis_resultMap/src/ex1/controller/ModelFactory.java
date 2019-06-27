package ex1.controller;
// ������ ��� ��û(Thread)�� ���ӹ޴� ��ü 

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

// �̱��� ó�� 


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
				//��û(cmd)�� ���� �� ��ü�� Class�� �ε�
				Class<ModelInter> hClass = 
						(Class<ModelInter>) Class.forName(rPath);
				// �ε�� Ŭ������ ��ü�� �����ؼ� Interface�� ��ȯ
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


