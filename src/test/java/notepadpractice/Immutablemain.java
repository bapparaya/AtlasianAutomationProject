package notepadpractice;

public class Immutablemain {

	public static void main(String[] args) {
		Immutabe im = new Immutabe(10,"bappa");
		int id = im.getid();
		String name = im.getName();
		System.out.println(id);
		System.out.println(name);

	}

}
