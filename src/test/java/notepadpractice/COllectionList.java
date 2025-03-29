package notepadpractice;

import java.util.ArrayList;
import java.util.List;

public class COllectionList {
	public static void main(String[] args){
		List mylist = new ArrayList();

		mylist.add(100);
		mylist.add(10.44);
		mylist.add('b');
		mylist.add("bapparaya");
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);

		System.out.println(mylist);
		System.out.println(mylist.size());

		mylist.remove(1);
		mylist.set(1,"muthu");
		System.out.println(mylist);
		System.out.println(mylist.size());
		mylist.add(1,"shanthamma");
		System.out.println(mylist);
		System.out.println(mylist.size());
		
		List mylist2 = new ArrayList();
		mylist2.add(null);
		mylist2.add(100);
		System.out.println(mylist2);
		mylist.removeAll(mylist2);
		System.out.println(mylist);
		System.out.println(mylist2);
		

		}
}
