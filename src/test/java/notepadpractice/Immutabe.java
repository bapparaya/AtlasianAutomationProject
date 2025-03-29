package notepadpractice;

public final class Immutabe {
	
	final private int id;
	final private String name;
	
	public Immutabe(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	

	public int getid() {
		return id;
	}
	public String getName() {
		return name;
	}



}
