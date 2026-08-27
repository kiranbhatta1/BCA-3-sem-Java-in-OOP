class Student {
  String name, address;
  int roll;

  Student() {
    name = "DefaultName";
    address = "DefaultAddress";
    roll = 0;
  }

  Student(String name, String address, int roll) {
    this.name = name;
    this.address = address;
    this.roll = roll;
  }

  void display() {
    System.out.println("Name: " + name);
    System.out.println("Address: " + address);
    System.out.println("Roll: " + roll);
  }
}

public class ClassHavingProperty {
  public static void main(String[] args) {
    Student s1 = new Student("Kiran", "KTM", 19);
    s1.display();
  }
}

