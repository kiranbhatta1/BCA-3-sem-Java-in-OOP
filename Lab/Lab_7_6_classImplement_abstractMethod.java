abstract class Animal {
    void sleep() {
        System.out.println("Animal is sleeping");
    }

    abstract void makeSound(); // Abstract method for subclasses to implement
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Animal dog = new Dog(); // Polymorphism
        Animal cat = new Cat();

        dog.makeSound();  // Outputs: Dog barks
        cat.makeSound();  // Outputs: Cat meows
        dog.sleep();      // Outputs: Animal is sleeping
    }
}
