package assignment.assignmnet__7.problem__5;

public class Car {
	private int speed;
	private int noOfGear;
	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}
	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	/**
	 * @return the noOfGear
	 */
	public int getNoOfGear() {
		return noOfGear;
	}
	/**
	 * @param noOfGear the noOfGear to set
	 */
	public void setNoOfGear(int noOfGear) {
		this.noOfGear = noOfGear;
	}
	public Car(int speed, int noOfGear) {
		super();
		this.speed = speed;
		this.noOfGear = noOfGear;
	}
	public Car() {
		
	}
	
	public  void display()
	{
		 System.out.println("Car Speed: " + speed + " km/h");
	     System.out.println("Number of Gears: " + noOfGear);
	}
	
	public void drive(int speed, int noOfGear) {
        this.speed = speed;
        this.noOfGear = noOfGear;
        System.out.println("Car is starting with speed: " + speed + " km/h and " + noOfGear + " gears.");
    }
	
	

}
