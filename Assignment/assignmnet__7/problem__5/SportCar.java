package assignment.assignmnet__7.problem__5;

public class SportCar extends Car {
	private String AirBallonType;

	/**
	 * @return the airBallonType
	 */
	public String getAirBallonType() {
		return AirBallonType;
	}

	/**
	 * @param airBallonType the airBallonType to set
	 */
	public void setAirBallonType(String airBallonType) {
		AirBallonType = airBallonType;
	}
	
	public void display() {
		super.display();
		 System.out.println("Air Balloon Type: " + AirBallonType);
	}
	
}
