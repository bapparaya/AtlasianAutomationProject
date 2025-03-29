package collectionpractice;
import java.util.*;
import java.util.Map.Entry;

import collectioncustomclass.Employee;

public class Mappractice {

	public static void main(String[] args) {
		
		Map< Employee,Integer> map = new HashMap<Employee,Integer>();
		
//		map.put(1, "bappa");
//		map.put(2, "value1");
//		
//		System.out.println(map);
//		for(Entry<Integer, String> e: map.entrySet()) {
//			if(map.containsKey(e.getKey())) {
//				System.out.println(map.put(e.getKey(), e.getValue()));
//				
//			}
//		}
//		
//		//map.remove(1);
//		System.out.println(map);
//		System.out.println(map.values());
		
		Employee em1 = new Employee(100,"Bappa","QA");
		Employee em2 = new Employee(10,"ppa","Q");
		
		map.put(em1,1);
		map.put(em2,2);
		
		System.out.println(map.get(em1));
		System.out.println(map.get(em2));
		

	}

}
