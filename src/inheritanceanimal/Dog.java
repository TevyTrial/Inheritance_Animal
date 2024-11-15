/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritanceanimal;

/**
 *
 * @author tevy0
 */
public class Dog extends Animal {
	private String breeds;
	
	//constructor with arguments
	public Dog(boolean veg, String food, int legs, String breeds) {
		super(veg,food,legs);
		this.breeds = breeds;
	}
	
	/**
	 * 
	 * @return String
	 */
	public String getBreeds() {
		return this.breeds;
	}
	
	/**
	 * 
	 * @param breeds
	 */
	public void setBreeds(String breeds) {
		this.breeds = breeds;
	}
	
	/**
	 * @return String
	 * @Override
	 */
	public String toString() {
		String ss = "The breed for the dog is " + this.breeds;
		return ss;
	}
	
	/**
	 * 
	 * @param dog2
	 * @return boolean
	 */
	
	public boolean equals(Dog dog2) {
		boolean status = false;
		if(this.breeds.equals(dog2.breeds)) {
			status = true;
		}
		return status;
	}
	
}

