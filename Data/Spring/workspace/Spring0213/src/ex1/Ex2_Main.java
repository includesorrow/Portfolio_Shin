package ex1;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class Ex2_Main {
	public static void main(String[] args) {
		
	ApplicationContext ctx = new GenericXmlApplicationContext("ex1/ppp.xml");
	Ex2_Map em = ctx.getBean("map2", Ex2_Map.class);
	Map<String, Integer> maps = em.getMap();
	for(Map.Entry<String, Integer> e : maps.entrySet()) {
		System.out.println("Key : " + e.getKey());
		System.out.println("Value : " + e.getValue());
	}
			
	
	}
	
	
	
	
}
