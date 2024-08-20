// Parent class (Base class)
class Animal {
    // Method in the parent class
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class (Derived class) inherits from Animal
class Dog extends Animal {
    // Method in the child class
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Inherit {
    public static void main(String[] args) {
        // Create an object of the child class
        Dog myDog = new Dog();

        // Call methods from both the parent and child class
        myDog.eat();  // Inherited method from Animal class
        myDog.bark(); // Method from Dog class
    }
}
