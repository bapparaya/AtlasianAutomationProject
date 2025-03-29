package com.qa.javapractice;


public class Exceptionhandling {

	public static void main(String[] args) {
	    
		
//		//checked exception
//		System.out.println("programs starts");
//		
//		Thread.sleep(2000);
//		
//		System.out.println("programe ends");
		
		///unchecked exception
		int[] a = {1,2,3};
		System.out.println(" this is array reading start");
		try {
		System.out.println(a[4]);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("this is array reading ends");

	}

}
