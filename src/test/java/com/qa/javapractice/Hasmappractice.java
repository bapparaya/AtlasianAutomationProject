package com.qa.javapractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Hasmappractice {

	public static void returncountofelements(String name, char target) {
		
		//String sname="ramannashanthammamuthurajbapparaya";
//		char[] sc = name.toCharArray();
//		//char t = 'a';
//		
//		//int count =1;
//		Map<Character, Integer> map = new HashMap<Character, Integer>();
//		
//		for(char c:sc) {
//			if(map.containsKey(c)) {
//				map.put(c, map.get(c)+1);
//			}else {
//				map.put(c, 1);
//			}
//		}
//		
//		System.out.println(map);
//		//System.out.println(map.entrySet());
//		System.out.println(map.get(target));
		
 Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		
		map.put(100, "bappa");
		map.put(101, "muthu");
		map.put(103, "shanthamma");
		map.put(104, "ramji");
		map.put(null, "xyz");
		map.put(null, "pqr");
		map.put(105, null);
		map.put(105, null);
		map.put(106, null);
		
		System.out.println(map);
		System.out.println(map.get(104));
		System.out.println(map.entrySet());
		System.out.println(map.containsKey(105));
		System.out.println(map.put(101, "raj"));
		System.out.println(map);

	}
	
	
	
	public static void main(String[] args) {
		returncountofelements("ramannashanthammamuthurajbapparaya", 'n');
	}

}
