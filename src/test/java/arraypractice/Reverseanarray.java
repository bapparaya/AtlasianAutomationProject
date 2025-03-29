package arraypractice;

import java.util.Arrays;

public class Reverseanarray {

	public static void main(String[] args) {
		int[] a = { 1, 3, 1 };
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {

			b[a.length - i - 1] = a[i];

		}

		System.out.println(Arrays.toString(b));

		

		System.out.println(Arrays.equals(a,b));

		if(Arrays.toString(a).equals(Arrays.toString(b))){
		System.out.println("array is polindrome");

	}

}
}