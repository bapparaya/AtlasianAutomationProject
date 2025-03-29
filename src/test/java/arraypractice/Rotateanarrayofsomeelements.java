package arraypractice;

import java.util.Arrays;

public class Rotateanarrayofsomeelements {

	public static void main(String[] args) {

		int[] a = { 1, 2, 4, 8, 3, 5 };

		int left = 0;
		int right = a.length - 1;

		while (left < right) {
			int temp = a[left];
			a[left] = a[right];
			a[right] = temp;
			left++;
			right--;
		}

		int leftf = 3;
		int rightf = a.length - 1;

		while (leftf < rightf) {
			int temp2 = a[left];
			a[leftf] = a[rightf];
			a[rightf] = temp2;
			leftf++;
			rightf--;

		}

		System.out.println(Arrays.toString(a));
	}
}
