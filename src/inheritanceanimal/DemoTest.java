/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritanceanimal;

/**
 *
 * @author tevy0
 */
public class DemoTest {
    	public static void main(String[] args) {
		boolean veg = false;
		//polymorphism
		Animal aa = new Animal(veg, "Meat", 4);
		Animal a1 = new Cat(veg, "Fish", 4, "white");
		Animal a2 = new Dog(veg, "Meat", 4, "Akita");
		
		//dynamic binding or late binding for using the same method in both subclass and superclass
		System.out.println("Info for a lion is the following:\n " + aa.toString() + "\n");
		System.out.println("Info for a cat is the following:\n " + a1.toString() + "\n");
		System.out.println("Info for a dog is the following:\n "+ a2.toString() + "\n");
		
		//equals methods for cat
		/**
		 * when a1 is compared to cat1 or cat2, the equals function will return false,
		 * since a1 belongs to Animal class. We didn't override equals method in Animal class.
		 * When polymorphism occurs, instances can only visit fields in  general class
		 */
		Cat cat1 = new Cat(veg, "Fish", 4, "white");
		Cat cat2 = new Cat(veg, "Fish", 4, "white");
		System.out.println("Checking for two cats.");
		boolean check = cat2.equals(cat1);
		
		if(check) {
			System.out.println("The two animals are same\n");
		}
		else {
			System.out.println("The two animals are not same\n");
		}
		
		
		//equals methods for dog
		Dog dog1 = new Dog(veg, "Meat", 4, "Akita");
		Dog dog2 = new Dog(veg, "Meat", 4, "Akita");
		System.out.println("Checking for two dogs.");
		boolean check2 = dog2.equals(dog1);
		
		if(check2) {
			System.out.println("The two animals are same\n");
		}
		else {
			System.out.println("The two animals are not same\n");
		}
				
	}
}
