package conn;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//Sqlsession객체를 관리하는 SqlSessionFactory를 생성하고
//반환하는 클래스
public class MyGetFactory {
	private static SqlSessionFactory factory;
	static {
		// config.xml 읽어 오도록 설정한다.
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
