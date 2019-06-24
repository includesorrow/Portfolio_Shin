package collection;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Ex1_ListMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("collection/list.xml");
		
		Ex1_List lists = ctx.getBean("list1", Ex1_List.class);
		List<String> slist = lists.getItems();
		for(String e: slist) {
			System.out.println(e);
		}
		
		System.out.println("");
		
		Ex1_List listf = ctx.getBean("list2", Ex1_List.class);
		List<Float> flist = listf.getItemsf();
		for(Float e: flist) {
			System.out.println(e);
		}
	}
}
