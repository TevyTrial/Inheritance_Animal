/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritanceanimal;

/**
 *
 * @author tevy0
 */
public class Animal {
    //attributes
	private boolean vegetarian;
	private String eats;
	private int noOfLegs;
	
	//constructor with arguments;
	public Animal(boolean veg, String food, int legs) {
		this.vegetarian = veg;
		this.eats = food;
		this.noOfLegs = legs;
	}
	
	/**
	 * 
	 * @return boolean
	 */
	public boolean isVegetarian() {
		return this.vegetarian;
	}
	
	/**
	 * 
	 * @param vegetarian
	 */
	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}
	
	/**
	 * 
	 * @return String
	 */
	public String getEats() {
		return this.eats;
	}
	
	/**
	 * 
	 * @param eats
	 */
	public void getEats(String eats) {
		this.eats = eats;
	}
	
	/**
	 * 
	 * @return int
	 */
	public int getNoOfLegs() {
		return this.noOfLegs;
	}
	
	/**
	 * 
	 * @param noOfLegs
	 */
	public void getNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}
	
	/**
	 * @Override toString
	 * @return String
	 */
	
	public String toString() {
		String ssOne = "The status for judging vegeratian is " + this.vegetarian;
		String ssTwo = "The food the animal likes to eat is " + this.eats;
		String ssThree = "The number of legs for the animal is " + this.noOfLegs;
		return "\n" + ssOne + "\n" + ssTwo + "\n" + ssThree;
		
	}
	
	
}
