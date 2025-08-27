class Animal {
    void makeSound() {
        System.out.println("Animals Make Sound");
    }
}

// Single-Level Inheritance
class Dog extends Animal {
    void bark() {
        System.out.println("Dog Bark");
    }
}

// Multi-level Inheritance
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weep!");
    }
}

// Hierarchical Inheritance
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class TypesOfInheritance {
    public static void main(String[] args) {
        System.out.println("Single-Level Inheritance:");
        Dog d = new Dog();
        d.makeSound();
        d.bark();

        System.out.println("Multi-level Inheritance:");
        Puppy p = new Puppy();
        p.makeSound();
        p.bark();
        p.weep();

        System.out.println("Hierarchical Inheritance:");
        Cat c = new Cat();
        c.makeSound();
        c.meow();
    }
}
