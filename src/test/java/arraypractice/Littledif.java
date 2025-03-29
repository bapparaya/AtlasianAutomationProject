package arraypractice;

import java.util.Arrays;

public class Littledif {

	public static void main(String[] args) {
		int[] a={1,2,3,4,5};

		int chuncsize=2;
		
		int[] chunk =null;
		for(int i=0;i<a.length;i+=chuncsize){

			chunk = Arrays.copyOfRange(a,i,Math.min(i+chuncsize,a.length));
			System.out.println(Arrays.toString(chunk));
		}
		
	}

}
