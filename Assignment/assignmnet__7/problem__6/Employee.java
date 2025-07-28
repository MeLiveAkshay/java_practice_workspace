package assignment.assignmnet__7.problem__6;

public abstract class Employee {
	private String name;
	private int empId;
	private double salary;
	
	public Employee(String name,int empId, double salary)
	{
		this.name=name;
		this.empId= empId;
		this.salary=salary;
	}
	
	 abstract void calculateSalary();
	 
	 public void displayDetails() {
	        System.out.println("Employee ID: " + empId);
	        System.out.println("Name: " + name);
	        System.out.println("Salary: ₹" + salary);
	    }

}
