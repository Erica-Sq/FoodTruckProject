package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {
	private FoodTruck[] trucks = new FoodTruck[5];
	private Scanner sc = new Scanner(System.in);
	private Object name;

	public static void main(String[] args) {
		FoodTruckApp fta = new FoodTruckApp();
		fta.run();
	}

	public void run() {
		createTrucks();
		mainMenu();

	}

	public void createTrucks() {
		for (int i = 0; i < trucks.length; i++) {
			System.out.println("Enter information for Food Truck #" + (i + 1) + ":  Or Quit for Foodtruck Name");

			System.out.print("Name: ");
			String name = sc.nextLine();

			if (name.equalsIgnoreCase("Quit")) {
				break;
			}

			System.out.print("Food Type: ");
			String foodType = sc.nextLine();

			System.out.print("Rating: ");
			int rating = sc.nextInt();
			sc.nextLine();
			FoodTruck newTruck = new FoodTruck(name, foodType, rating);
			trucks[i] = newTruck;
			System.out.println();
		} 
		
	}

	

	public void calculateAvg() {
		double sum = 0;
		double length = 0;
		double average = 0;
		for (int i = 0; i < trucks.length; i++) {
			if (trucks[i] != null) {
				sum += trucks[i].getRating();

			}
		}
		for (int i = 0; i < trucks.length; i++) {
			if (trucks[i] != null) {
				length++;
			}
		}
		average = sum / length;
		System.out.println("Avg Rating: " + average);

	}

	public void highestRating() {
		int maximum = 0;
		String mobile = "";

		for (int i = 0; i < trucks.length; i++) {
			if (trucks[i] != null) {

				if (maximum < trucks[i].getRating()) {
					maximum = trucks[i].getRating();
					mobile = trucks[i].getFoodType();
				}

			}

		}
		System.out.println();
		System.out.println("Highest Rated: " + mobile);
	}

	public void mainMenu() {
		System.out.println("1: List all existing food trucks \n 2: See the avg rating of food trucks \n"
				+ " 3: Display the highest-rated food truck \n 4: Quit program");
		int choice = sc.nextInt();

		switch (choice) {

		case 1:
			createTrucks();
			mainMenu();

			break;

		case 2:
			calculateAvg();
			mainMenu();

			break;

		case 3:
			highestRating();
			mainMenu();

			break;
		case 4:
			System.out.println("See you later!");

			break;

		default:
			System.err.println("input not recognized");
			mainMenu();

		}
 
	}
	
}
