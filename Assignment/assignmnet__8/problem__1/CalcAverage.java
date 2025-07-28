package assignment.assignmnet__8.problem__1;

public class CalcAverage {
	public double avgFirstN(int n) {
		if (n<=0) throw new IllegalArgumentException("n must be natural number eg . 1,2 ,3,4 ");
		double sum =n*(n+1)/2;
		return sum/n;
		
	}
	public static void main(String[] args) {
		CalcAverage average=new CalcAverage();
		int n = Integer.parseInt(args[0]);
		try {
			
			System.out.println("Average of first " + n + " natural numbers: "+average.avgFirstN(n));
		}
		catch(Exception exception) {
			exception.printStackTrace();
			
		}
		
	}
		

}
