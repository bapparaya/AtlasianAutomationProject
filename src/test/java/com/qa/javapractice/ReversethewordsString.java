package com.qa.javapractice;

public class ReversethewordsString {

	public static void main(String[] args) {
		String s = "i love india";
		String[] spittedwords = s.split(" ");
		String revstring ="";
		System.out.println("before loop");
		//System.out.println(spittedwords[2]);
		for(int i=spittedwords.length-1;i>=0;i--) {
			revstring = revstring+spittedwords[i] +" ";
			
		}
		System.out.println(revstring);
	}

}
