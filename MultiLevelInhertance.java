// Base class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Intermediate class inheriting from Animal
class Mammal extends Animal {
    void run() {
        System.out.println("This mammal can run.");
    }
}

// Derived class inheriting from Mammal
class Dog extends Mammal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class MultiLevelInhertance {
    public static void main(String[] args) {
        // Creating an object of the derived class
        Dog myDog = new Dog();

        // Calling methods from different levels of inheritance
        myDog.eat();  // Inherited from Animal
        myDog.run();  // Inherited from Mammal
        myDog.bark(); // Defined in Dog class
    }
}
