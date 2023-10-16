package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private static int nextTruckId = 1;
	private int id;
	private String name;
	private String foodType;
	private int rating;
	


	public FoodTruck(String name, String foodType, int rating) {
		this.id = nextTruckId; nextTruckId++;
		this.name = name; 
		this.foodType = foodType;
		this.setRating(rating);
		
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



	public String getFoodType() {
		return foodType;
	}



	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}



	public static int getNextTruckId() {
		return nextTruckId;
	}



	public static void setNextTruckId(int nextTruckId) {
		FoodTruck.nextTruckId = nextTruckId;
	}



	public int getRating() {
		return rating;
	}



	public void setRating(int rating) {
		this.rating = rating;
	}



	public static int[] response(String str) {
		// TODO Auto-generated method stub
		return response(null);
	}



	@Override
	public String toString() {
		return "FoodTruck [getId()=" + getId() + ", getName()=" + getName() + ", getFoodType()=" + getFoodType()
				+ ", getRating()=" + getRating() + "]";
	} 
	

	}