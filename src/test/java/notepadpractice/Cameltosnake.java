package notepadpractice;

import java.util.*;

public class Cameltosnake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] price = {1,4,-1,2,8,3};
//		System.out.println(Arrays.toString(price));
//		Arrays.sort(price);
//		System.out.println(Arrays.toString(price));
//		int profit = price[price.length-1]-price[0];
//		System.out.println(profit);
		
		List price = new ArrayList();
		price.add(1);
		price.add(4);
		price.add(-1);
		price.add(2);
		price.add(8);
		price.add(3);
		System.out.println(price);
		Collections.sort(price);
		System.out.println(price);
		int high = (Integer) price.get(price.size()-1); 
int low = (Integer) price.get(0);
		System.out.println(high-low);
		
	}

}
