package arraypractice;

import java.util.Arrays;

public class Simplesplit {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,7};
		int mid = a.length/2;
		
		int[] first = Arrays.copyOfRange(a, 0, mid);
		int[] second= Arrays.copyOfRange(a, mid, a.length);

		System.out.println(Arrays.toString(first));
		System.out.println(Arrays.toString(second));
	}

}
