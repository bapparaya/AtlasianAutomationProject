package arraypractice;

import java.util.Arrays;

public class WithoutCreatingnewarrayreverseanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,4,8,3,5,7};

		int right=a.length-1;
		int left =0;

		while(left<right){
		int temp=a[left];
		a[left]=a[right];
		a[right]=temp;
		right--;
		left++;

		}
		System.out.println(Arrays.toString(a));
	}

}
