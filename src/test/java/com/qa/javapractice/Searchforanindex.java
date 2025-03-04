package com.qa.javapractice;

public class Searchforanindex {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6};
		int b=5;
		for(int i=0;i<a.length;i++) {
			if(b==a[i]) {
				System.out.println(i);
			}
			
		}
		System.out.println("element not found in the array");
			
			
	}

}
