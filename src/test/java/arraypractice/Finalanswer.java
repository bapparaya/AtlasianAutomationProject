package arraypractice;

import java.util.*;

public class Finalanswer {
	public static void main(String[] args){

//		int[] a={1,2,3,4,5,6,7};
//		int chunksize=2;
//
//		List<int[]> chunck=new ArrayList<int[]>();
//
//		for(int i=0;i<a.length;i+=chunksize){//0,2,4
//		int[] chuckarr= Arrays.copyOfRange(a,i,Math.min(i+chunksize,a.length)); //0-2, 2-4,4-5
//		chunck.add(chuckarr);
//
//		}
//
//		for(int[] arr:chunck){
//
//		System.out.println(Arrays.toString(arr));
//		}
		
		int[] a={1,2,3,4};
		int chunck=2;


		int[] chuck1=Arrays.copyOfRange(a,0,chunck);
		int[] chuck2=Arrays.copyOfRange(a,2,chunck+2);
		System.out.println(Arrays.toString(chuck1));
		System.out.println(Arrays.toString(chuck2));


		}
}
