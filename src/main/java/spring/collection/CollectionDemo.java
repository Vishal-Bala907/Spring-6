package spring.collection;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionDemo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/spring/collection/collection.xml");
		MyCollections collections = context.getBean(MyCollections.class,"collection");
		
		System.out.println(collections.getList().size());
		System.out.println(collections.getSet().size());
		System.out.println(collections.getMap().size());
		
		Map<Integer, String> map = collections.getMap();
		for(int i=1;i<5;i++) {
			System.out.println(map.get(i));
		}
	}
}
