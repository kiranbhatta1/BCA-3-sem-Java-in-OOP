class Circle {
  private float radius;

  Circle() {
    radius = 1.0f;
  }

  Circle(float r) {
    radius = r;
  }

  float findArea() {
    return (float) (Math.PI * radius * radius);
  }

  float findCircumference() {
    return (float) (2 * Math.PI * radius);
  }
}
public class ClassObjectAndConstruction_privateVariables_toFindAreaOfCircle {
  public static void main(String[] args) {
    Circle c1 = new Circle(5.0f); 

    System.out.println("Area: " + c1.findArea());
    System.out.println("Circumference: " + c1.findCircumference());
  }
}
