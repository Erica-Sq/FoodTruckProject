package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {
	private FoodTruck[] trucks = new FoodTruck[5] 
;
	public static void main(String[] args) {
		FoodTruckApp fta = new FoodTruckApp();
		fta.run();
	}

	Scanner sc = new Scanner(System.in);
	private FoodTruck[] foodTrucks;

	public void run() {
		Scanner sc = new Scanner(System.in);
		String Str = "";
//
//			System.out.println("Enter Food Truck Name");
//			String name = sc.next();
//			
//			System.out.println("Enter food type");
//			String foodType = sc.next();
//			
//			System.out.println("Enter food truck rating from 1-10");
//			int rating= sc.nextInt();
//			
////		do {
//			String[] menuOptions = {"List All FoodTrucks \n", "See FoodTruck avg rating \n", "Display Highest-rated FoodTruck \n", "Type QUIT to quit program"};
//
//			System.out.println("Choose from the following menu:");
//			for (int i=0; i<menuOptions.length; i++) {
//				System.out.println((i + 1) + ". " + menuOptions[i]) ;
//			}		
//			Str = sc.next();
//			System.out.println(FoodTruck.response(Str));
//		} 
//	
//    ArrayList<FoodTruck> foodTrucks = new ArrayList<>();
//
//    System.out.print("Enter the number of food trucks: ");
//    int numFoodTrucks = scanner.nextInt();
//    scanner.nextLine(); // Consume the newline character
//
//    for (int i = 0; i < numFoodTrucks; i++) {
//        System.out.println("Enter information for Food Truck #" + (i + 1) + ":");
//
//        System.out.print("Name: ");
//        String name = sc.nextLine();
//
//        System.out.print("Food Type: ");
//        String foodType = sc.nextLine();
//
//        System.out.print("Rating: ");
//        int rating = sc.nextInt();
//        sc.nextLine(); // Consume the newline character
//
//        // Create a FoodTruck object and add it to the collection
//        FoodTruck truck = new FoodTruck(name, foodType, rating);
//        foodTrucks.add(truck);
//    }
//
//    // Close the scanner when done
//    scanner.close();
//
//    // Display the Food Truck information
//    System.out.println("Food Truck Information:");
//    for (FoodTruck truck : foodTrucks) {
//        System.out.println("Name: " + truck.getName());
//        System.out.println("Food Type: " + truck.getFoodType());
//        System.out.println("Rating: " + truck.getRating());
//        System.out.println();
//    }
////	while (!Str.equals("QUIT"));
////	System.out.println("Thanks for your input.GoodBye.");
////	
////	sc.close();
////	
//	
//	}
////
////	trucks[0] = new FoodTruck ("Fifis Fire Burgers", "American" , 4);
////	trucks[1] = new FoodTruck ( "Dan's Dank Burritos", "Mexican", 2);
////	trucks[2] = new FoodTruck ( "Flying FishFood", "Japanese", 1); 
////	trucks[3] = new FoodTruck ( "The Lunchroom", "Vegan", 3);
////	trucks[4] = new FoodTruck ("Tikas Tiki Table", "Hawaiian", 5);
////
////}

		for (int i = 0; i < trucks.length; i++) {
            System.out.println("Enter information for Food Truck #" + (i + 1) + ":");

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Food Type: ");
            String foodType = sc.nextLine();

            System.out.print("Rating: ");
            int rating = sc.nextInt();
            sc.nextLine(); 
            trucks[i] = new FoodTruck(name, foodType, rating);
        }

        sc.close();

        int totalRating = 0;
        for (FoodTruck truck : foodTrucks) {
            totalRating += truck.getRating();
        }
        double averageRating = (double) totalRating / foodTrucks.length;

        System.out.println("Average Rating for Food Trucks: " + averageRating);
    }
}
			