/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritanceanimal;

/**
 *
 * @author tevy0
 */
public class Cat extends Animal{
	private String color;
	
	public Cat(boolean veg, String food, int legs, String color) {
		super(veg,food,legs);
		this.color = color;
	}
	
	/**
	 * @return String
	 */
	
	public String getColor() {
		return this.color;
	}
	
	/**
	 * 
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 * @Override
	 */
	
	public String toString() {
		String ss = "The color for the cat is " + this.color;
		return ss;
	}
	
	/**
	 * @param ob2
	 * @return boolean
	 */
	public boolean equals(Cat cat2) {
		boolean status = false;
		if(this.color == cat2.color) {
			status = true;
		}
		
		return status;
	}
}