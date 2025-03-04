package com.qa.javapractice;

import java.util.Arrays;

public class Maxandminarray {

	public static void main(String[] args) {
		int[] a = {2,1,5,9,6,3,4};
		System.out.println(a[a.length-1]);
		Arrays.sort(a);
		System.out.println(a[a.length-1]);
		int even =0;
		int odd=0;
		for(int b:a) {
			if(b%2==0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println(even);
		System.out.println(odd);

	}

}
