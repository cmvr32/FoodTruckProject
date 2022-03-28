package FoodTrucks;

public class FoodTruck {
	// THIS IS A BLUEPRINT

	/*
	 * DONE You will define a FoodTruck class with fields for a unique numeric id, a
	 * name ("TacoRific", "Mediterranean Medic", etc.), food type ("Tacos",
	 * "Falafel", etc.), and a numeric rating.
	 */

	private int truckId;
	private static int truckCount = 0;
	private String truckName;
	private String foodType;
	private double truckRating;

	public FoodTruck() {
	}

	public FoodTruck(String truckName, String foodType, double truckRating) {
		super();
		
		this.truckId = truckCount;
		truckCount = truckCount + 1;
		this.truckName = truckName;
		this.foodType = foodType;
		this.truckRating = truckRating;
	}

	public int getTruckId() {
		return truckId;
	}

	public void setTruckId(int TruckId) {
		this.truckId = TruckId;
	}

	public String getTruckName() {
		return truckName;
	}

	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public double getTruckRating() {
		return truckRating;
	}

	public void setTruckRating(double truckRating) {
		this.truckRating = truckRating;
	}

	public String toString() {
		String output = "Truck Name: " + truckName + " Type of food: " + foodType + " Rating (0-5): " + truckRating
				+ " Truck Id: " + truckId;
		return output;
	}

//	public void displayTruck() {
//		String truckData = this.toString();
//		System.out.println(truckData);
//	}

}
