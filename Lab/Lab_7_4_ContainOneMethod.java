class Shape {
    void area() {
        System.out.println("Area of shape");
    }
}

class Triangle extends Shape {
    int base, height;

    Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void area() {
        System.out.println("Area of Triangle: " + (0.5 * base * height));
    }
}

class Rectangle extends Shape {
    int length, breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void area() {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }
}

public class ContainOneMethod {
    public static void main(String[] args) {
        Shape triangle = new Triangle(5, 10);
        Shape rectangle = new Rectangle(4, 6);

        triangle.area();
        rectangle.area();
    }
}

    
