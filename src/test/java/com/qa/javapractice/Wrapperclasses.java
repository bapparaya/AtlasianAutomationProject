package com.qa.javapractice;

public class Wrapperclasses {

	public static void main(String[] args) {
		//String to int,double etc..
		
		String s="1234";
		int i = Integer.parseInt(s);
		System.out.println(i);
		System.out.println(s);
		
		String s2="12.34";
		double d = Double.parseDouble(s2);
		System.out.println(d);
		
		System.out.println(d+i);
		System.out.println(s+s2);
		
		//others to string
		int i2 = 10;
		System.out.println(String.valueOf(i2));
		char c = 'A';
		System.out.println(String.valueOf(c));
	}

}
