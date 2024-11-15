# Inheritance Animal

## Description
This project demonstrates the use of inheritance in Java through three classes: `Animal`, `Cat`, and `Dog`. The `Animal` class serves as the base class, with `Cat` and `Dog` inheriting its properties and methods. The project highlights dynamic binding, polymorphism, and how to override `toString` and `equals` methods. A `DemoTest` class is included to demonstrate the usage and comparisons of these classes without inheritance.

## Features
- **Animal Class**:
  - Attributes: vegetarian, eats, noOfLegs
  - Methods: isVegetarian, setVegetarian, getEats, setEats, getNoOfLegs, setNoOfLegs, toString
- **Cat Class**:
  - Inherits from `Animal`
  - Additional attribute: color
  - Methods: getColor, setColor, toString, equals
- **Dog Class**:
  - Inherits from `Animal`
  - Additional attribute: breeds
  - Methods: getBreeds, setBreeds, toString, equals
- **DemoTest Class**:
  - Demonstrates polymorphism, dynamic binding, and equality checks for `Cat` and `Dog` objects.

## Class Details

### Animal Class
The `Animal` class includes the following methods:

1. **Constructor**:
    ```java
    public Animal(boolean veg, String food, int legs) {
        this.vegetarian = veg;
        this.eats = food;
        this.noOfLegs = legs;
    }
    ```

2. **isVegetarian**:
    ```java
    public boolean isVegetarian() {
        return this.vegetarian;
    }
    ```

3. **setVegetarian**:
    ```java
    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }
    ```

4. **getEats**:
    ```java
    public String getEats() {
        return this.eats;
    }
    ```

5. **setEats**:
    ```java
    public void setEats(String eats) {
        this.eats = eats;
    }
    ```

6. **getNoOfLegs**:
    ```java
    public int getNoOfLegs() {
        return this.noOfLegs;
    }
    ```

7. **setNoOfLegs**:
    ```java
    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }
    ```

8. **toString**:
    ```java
    @Override
    public String toString() {
        return "\nThe status for judging vegetarian is " + this.vegetarian +
               "\nThe food the animal likes to eat is " + this.eats +
               "\nThe number of legs for the animal is " + this.noOfLegs;
    }
    ```

### Cat Class
The `Cat` class extends `Animal` and includes the following methods:

1. **Constructor**:
    ```java
    public Cat(boolean veg, String food, int legs, String color) {
        super(veg, food, legs);
        this.color = color;
    }
    ```

2. **getColor**:
    ```java
    public String getColor() {
        return this.color;
    }
    ```

3. **setColor**:
    ```java
    public void setColor(String color) {
        this.color = color;
    }
    ```

4. **toString**:
    ```java
    @Override
    public String toString() {
        return "The color for the cat is " + this.color;
    }
    ```

5. **equals**:
    ```java
    public boolean equals(Cat cat2) {
        return this.color.equals(cat2.color);
    }
    ```

### Dog Class
The `Dog` class extends `Animal` and includes the following methods:

1. **Constructor**:
    ```java
    public Dog(boolean veg, String food, int legs, String breeds) {
        super(veg, food, legs);
        this.breeds = breeds;
    }
    ```

2. **getBreeds**:
    ```java
    public String getBreeds() {
        return this.breeds;
    }
    ```

3. **setBreeds**:
    ```java
    public void setBreeds(String breeds) {
        this.breeds = breeds;
    }
    ```

4. **toString**:
    ```java
    @Override
    public String toString() {
        return "The breed for the dog is " + this.breeds;
    }
    ```

5. **equals**:
    ```java
    public boolean equals(Dog dog2) {
        return this.breeds.equals(dog2.breeds);
    }
    ```

### DemoTest Class
The `DemoTest` class demonstrates the use of the `Animal`, `Cat`, and `Dog` classes, showcasing polymorphism and dynamic binding.

```java
package inheritanceanimal;

public class DemoTest {
    public static void main(String[] args) {
        boolean veg = false;
        
        // Polymorphism
        Animal aa = new Animal(veg, "Meat", 4);
        Animal a1 = new Cat(veg, "Fish", 4, "white");
        Animal a2 = new Dog(veg, "Meat", 4, "Akita");
        
        // Dynamic binding or late binding for using the same method in both subclass and superclass
        System.out.println("Info for a lion is the following:\n " + aa.toString() + "\n");
        System.out.println("Info for a cat is the following:\n " + a1.toString() + "\n");
        System.out.println("Info for a dog is the following:\n " + a2.toString() + "\n");
        
        // Equals methods for cat
        Cat cat1 = new Cat(veg, "Fish", 4, "white");
        Cat cat2 = new Cat(veg, "Fish", 4, "white");
        System.out.println("Checking for two cats.");
        boolean check = cat2.equals(cat1);
        
        if (check) {
            System.out.println("The two animals are same\n");
        } else {
            System.out.println("The two animals are not same\n");
        }
        
        // Equals methods for dog
        Dog dog1 = new Dog(veg, "Meat", 4, "Akita");
        Dog dog2 = new Dog(veg, "Meat", 4, "Akita");
        System.out.println("Checking for two dogs.");
        boolean check2 = dog2.equals(dog1);
        
        if (check2) {
            System.out.println("The two animals are same\n");
        } else {
            System.out.println("The two animals are not same\n");
        }
    }
}
```

## License
This project is licensed under the MIT License. See the LICENSE file for details.
