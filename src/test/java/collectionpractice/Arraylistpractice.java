package collectionpractice;
import java.util.*;

import collectioncustomclass.Employee;

public class Arraylistpractice {

	public static void main(String[] args) {
		//it wont allow duplicates
		//it will preserve the order of insertion
		//to overcome the problem of arrays(size is fixed in nature) arraylist is defined and also arrays canot be worked with xutome class objects
		
		/*List arr = new ArrayList();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		
		List arr2 = new ArrayList();
		arr2.add('a');
		arr2.add('b');
		arr2.add('c');
		arr2.add('d');
		
		
//		for(Object o:arr) {
//			System.out.println(o);
//		}
//		System.out.println(arr.get(3));
//		System.out.println(arr);
		
		arr.addAll(arr2);
		System.out.println(arr);
		
		arr.retainAll(arr2);
		System.out.println(arr);
		arr.remove(2);
		System.out.println(arr);*/
		
		
		Employee emp1 = new Employee(100,"Bappa","QA");
		Employee emp2 = new Employee(101,"Muthu","DEV");
		Employee emp3 = new Employee(103,"Shanth","Admin");
		Employee emp4 = new Employee(104,"Ram","PO");
		
		List<Employee> emp = new ArrayList<Employee>();
		
		emp.add(emp1);
		emp.add(emp2);
		emp.add(emp3);
		emp.add(emp4);
		
		System.out.println(emp);
		for(Employee e:emp) {
			System.out.println(e.id+" "+e.name+" "+e.dept);
		}
		
		
		
		
		

	}

}
