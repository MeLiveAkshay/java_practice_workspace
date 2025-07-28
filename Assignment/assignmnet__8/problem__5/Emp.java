package assignment.assignmnet__8.problem__5;

public class Emp
{
	 	private int empId;
	    private String empName;
	    private String designation;
	    private double basic;
	    private double hra;
	    
	    
		public Emp(int empId, String empName, String designation, double basic) throws LowSalException
		{
			
			if(basic<5000)
			{
				throw new LowSalException("\"Basic salary must be at least 5000. Given: " + basic);
			}
			this.empId = empId;
			this.empName = empName;
			this.designation = designation;
			this.basic = basic;
			
			
		
			
			calculateHRA();
		}


		private void calculateHRA()
		{
	        switch (designation.toLowerCase()) {
	            case "manager":
	                hra = 0.10 * basic;
	                break;
	            case "officer":
	                hra = 0.12 * basic;
	                break;
	            case "clerk":
	                hra = 0.05 * basic;
	                break;
	            default:
	                hra = 0;
	                System.out.println("Warning: Invalid designation. HRA set to 0.");
	        }
	    }
		
		
		
		public void printDetails()
		{
	        System.out.println("------ Employee Details ------");
	        System.out.println("Emp ID       : " + empId);
	        System.out.println("Name         : " + empName);
	        System.out.println("Designation  : " + designation);
	        System.out.println("Basic Salary : " + basic);
	        System.out.println("HRA          : " + hra);
	    }
	        
}
