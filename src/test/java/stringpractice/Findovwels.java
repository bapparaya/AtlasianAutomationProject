package stringpractice;

public class Findovwels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "Bapparaya";
		
		String vowels = "eiou";
		for(int i=0;i<vowels.length();i++) {
			char c=vowels.charAt(i);
			if(s.indexOf(c)!=-1) {
				System.out.println("it is vowel");
			}
		}
	}

}
