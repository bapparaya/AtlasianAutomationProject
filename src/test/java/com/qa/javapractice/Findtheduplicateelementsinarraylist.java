package com.qa.javapractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Findtheduplicateelementsinarraylist {

	public static void main(String[] args) {
		List ls = new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(20);
		ls.add(40);
		ls.add(10);
		
		System.out.println(ls);
		
		Set st = new HashSet();
		
		for(int i=0;i<ls.size();i++) {
			if(!st.add(ls.get(i))) {
				System.out.println(ls.get(i)+" it is a duplicate number");
			}else {
				st.add(ls.get(i));
			}
		}
		
System.out.println(st);
System.out.println(ls);
	}

}
