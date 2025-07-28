package assignment.assignmnet__10;

public class Employe implements Comparable<Employe> {
	private int id;
	private String name;
	private  float salary;
	public Employe(){
		
	}
	public Employe(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
	    return "Employe { \n"
	        + "id=" + id 
	        + ", name=" + name 
	        + ", salary=" + salary 
	        + ", getId()=" + getId() 
	        + ", getName()=" + getName() 
	        + ", getSalary()=" + getSalary() 
	        + ", getClass()=" + getClass() 
	        + ", hashCode()=" + hashCode() 
	        + ", toString()=" + super.toString() 
	        + "}";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Employe) {
			Employe emp = (Employe) obj;
			if (this.name.equals(emp.name) && this.salary == emp.salary) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.id;
	}

	@Override
	public int compareTo(Employe o) {
		return this.id - o.id;
	}
}
