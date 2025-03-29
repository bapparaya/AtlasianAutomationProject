package arraypractice;

public class Avarageofallelementsin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,3,4,5};

		//int sum=0;
		int count=0;

		for(int b:a){

		//sum = sum+b;
		if(b%2==0) {
			
			count++;
			
		}
		}

		//int average = sum/a.length;

		//System.out.println(average);
		System.out.println(count);

	}

}
