package FoodTrucks;

import java.util.Scanner;

public class FoodTruckApp {

	/*
	 * You will create a separate class with a main method that starts the program.
	 * It will have an array to store up to five FoodTruck objects. The main method
	 * of this class is the only static method in the entire project.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		FoodTruck[] foodTrucks = new FoodTruck[5];

		FoodTruckApp foodTruckApp = new FoodTruckApp();
		foodTruckApp.printLaunchScreen();
		
		/*DONE:
		 * User Story #1 The user is prompted to input the name, food type, and rating
		 * for up to five food trucks.
		 * 
		 * TODO: For each set of input, a FoodTruck object is created, its fields set to
		 * the user's input, and it is added to the array. The truck id is not input by
		 * the user, but instead assigned automatically in the FoodTruck constructor
		 * from a static field that is incremented as each truck is created.
		 */

		for (int i = 0; i < foodTrucks.length; i++) {

			FoodTruck truckTemp = new FoodTruck();

			System.out.print("What is the name of the truck you wish to add: ");
			String truckName = sc.nextLine();
			truckTemp.setTruckName(truckName);
			System.out.println();

			/*
			 * DONE: User Story #2 If the user inputs quit for the food truck name, input
			 * ends immediately and the program continues.
			 */

			// TODO add "Quit" "QUIT" "q" "Q"
			if (truckName.equals("quit")) {
				break;
			}

			System.out.print("What type of food does this truck serve: ");
			String foodType = sc.nextLine();
			truckTemp.setFoodType(foodType);
			System.out.println();

			System.out.print("On a scale of 0-5 how many stars will you rate this truck: ");
			double truckRating = sc.nextDouble();
			truckTemp.setTruckRating(truckRating);
			System.out.println();

			if (truckRating > 5 || 0 > truckRating) {
				System.out.println("Please enter a rating 0-5: ");
				truckRating = sc.nextDouble();
				truckTemp.setTruckRating(truckRating);
			}
			foodTrucks[i] = truckTemp;
			sc.nextLine();

			foodTruckApp.printConfirmationMessage();
		} // forLoop

		/*
		 * User Story #3 After input is complete, the user sees a menu from which they
		 * can choose to: List all existing food trucks. See the average rating of food
		 * trucks. Display the highest-rated food truck. Quit the program.
		 */

		boolean keepGoing = true;

		while (keepGoing) {

			foodTruckApp.printMenu();
			int userInput2 = sc.nextInt();

			switch (userInput2) {
			case 1:
				// TODO print existing trucks
				for (int i = 0; i < foodTrucks.length; i++) {
					if (foodTrucks[i] != null) {
						System.out.println(foodTrucks[i]);
					}
				}
				break;

			case 2:
				// TODO print average truck rating
				 foodTruckApp.calculateAverageRating (foodTrucks);
				 break;
			case 3:
				// TODO print highest truck rating
				break;

			case 4:
				System.out.println("Thanks for visiting the Food Truck App!");
				keepGoing = false;
				break;
			}// switch

			/*DONE
			 * User Story #4
			 * After choosing a menu item, the user sees the menu again and can choose
			 * another item until the choose to quit.
			 */
			
		} // whileLoop

	}// mainMethod

	//TODO complete calcave method
	private void calculateAverageRating (FoodTruck[] foodTrucks) {
		
		for (int i = 0; i < foodTrucks.length; i++) {
			
			//double averageRating = truckRating / foodTrucks.length;
			//System.out.println(averageRating);
			}
		
	}

	private void printLaunchScreen() {
		System.out.println("");
		System.out.println("=========== Welcome to the Food Truck App ===========");
		System.out.println("=                                                   =");
		System.out.println("=          Start by adding your first truck!        =");
		System.out.println("=                                                   =");
		System.out.println("=====================================================");
		System.out.println("");
	} // printLaunchScreen Method

	private void printConfirmationMessage() {
		System.out.println("");
		System.out.println("================= The Food Truck App ================");
		System.out.println("=                                                   =");
		System.out.println("=             Your truck has been added!            =");
		System.out.println("=                                                   =");
		System.out.println("=====================================================");
		System.out.println("=                                                   =");
		System.out.println("=        Add another truck or type 'quit'           =");
		System.out.println("=              to continue in the app.              =");
		System.out.println("=                                                   =");
		System.out.println("=====================================================");
		System.out.println("");
	}

	private void printMenu() {
		System.out.println("");
		System.out.println("================= The Food Truck App ================");
		System.out.println("=                                                   =");
		System.out.println("=====================================================");
		System.out.println("=                                                   =");
		System.out.println("=            1. View all existing trucks            =");
		System.out.println("=            2. View average truck rating           =");
		System.out.println("=            3. View highest rated truck            =");
		System.out.println("=            4. Quit the app                        =");
		System.out.println("=                                                   =");
		System.out.println("=====================================================");
		System.out.println("");
	}

}// Class
