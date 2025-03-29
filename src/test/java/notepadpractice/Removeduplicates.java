package notepadpractice;

import java.util.HashSet;
import java.util.Set;

public class Removeduplicates {
	public static void main(String[] args){

		int[] a = {1,2,3,2,1};

		Set myset = new HashSet();

		for(int b:a){
		myset.add(b);

		}

		System.out.println(myset);

		}
}