package collectioncustomclass;

import java.util.Objects;

public class Employee {

	public int id;
	public String name;
	public String dept;
	
	

	public  Employee(int id,String name,String dept){
		this.id=id;
		this.name=name;
		this.dept=dept;
	}
	
	
	   // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Same memory reference
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    // Override hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
	
}
