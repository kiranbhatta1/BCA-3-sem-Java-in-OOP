class Fruit {
    String name, taste;
    int size;

    Fruit(String name, String taste, int size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    void eat() {
        System.out.println("Fruit: " + name + ", Taste: " + taste);
    }
}

class Apple extends Fruit {
    Apple() {
        super("Apple", "Sweet", 5);
    }

    @Override
    void eat() {
        System.out.println("Apple is sweet and juicy.");
    }
}

class Orange extends Fruit {
    Orange() {
        super("Orange", "Citrus", 4);
    }

    @Override
    void eat() {
        System.out.println("Orange is tangy and refreshing.");
    }
}

public class InheritOverride {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        Fruit orange = new Orange();

        apple.eat();  
        orange.eat(); 
    }
}
