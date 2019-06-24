package conn;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//Sqlsession��ü�� �����ϴ� SqlSessionFactory�� �����ϰ�
//��ȯ�ϴ� Ŭ����
public class MyGetFactory {
	private static SqlSessionFactory factory;
	static {
		// config.xml �о� ������ �����Ѵ�.
		String path ="config/config.xml";
		try {
			Reader reader = Resources.getResourceAsReader(path);
			factory = new SqlSessionFactoryBuilder().build(reader);
			closeReader(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	public static SqlSessionFactory getFactory() {
		return factory;
	}
	private static void closeReader(Closeable reader) {
		try {
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
