package com.qa.javapractice;

import java.util.HashMap;
import java.util.Map;

public class Hasmappractice {

	public static void returncountofelements(String name, char target) {
		
		//String sname="ramannashanthammamuthurajbapparaya";
		char[] sc = name.toCharArray();
		//char t = 'a';
		
		//int count =1;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char c:sc) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		
		System.out.println(map);
		//System.out.println(map.entrySet());
		System.out.println(map.get(target));

	}
	
	
	
	public static void main(String[] args) {
		returncountofelements("ramannashanthammamuthurajbapparaya", 'n');
	}

}
