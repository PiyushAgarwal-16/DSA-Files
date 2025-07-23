/**
 * Program to demonstrate the purposes of the super keyword in Java
 */
class Animal {
    String name = "Animal";
    
    // Constructor
    Animal() {
        System.out.println("Animal constructor called");
    }
    
    // Method in parent class
    void eat() {
        System.out.println("Animal is eating");
    }
    
    // Method that will be overridden
    void makeSound() {
        System.out.println("Animal makes a sound");
    }

    void helloworld(){
        System.out.println("hello world");
    }
}

class Dog extends Animal {
    String name = "Dog";
    
    // Constructor that calls parent constructor
    Dog() {
        super(); // Calls parent constructor
        System.out.println("Dog constructor called");
    }
    
    // Method that accesses parent's variable
    void displayNames() {
        helloworld();
        System.out.println("Child name: " + name);
        System.out.println("Parent name: " + super.name); // Access parent's variable
    }
    
    // Method that calls parent's method
    void eat() {
        super.eat(); // Call parent's method
        System.out.println("Dog is eating");
    }
    
    // Method that overrides parent's method
    @Override
    void makeSound() {
        super.makeSound(); // Call parent's version
        System.out.println("Dog barks");
    }
}

public class rough1 {
    public static void main(String[] args) {
        System.out.println("Demonstrating uses of super keyword:");
        System.out.println("\n1. Calling parent constructor:");
        Dog dog = new Dog();
        
        System.out.println("\n2. Accessing parent class variable:");
        dog.displayNames();
        
        System.out.println("\n3. Calling parent class method:");
        dog.eat();
        
        System.out.println("\n4. Calling overridden method of parent class:");
        dog.makeSound();
    }
}