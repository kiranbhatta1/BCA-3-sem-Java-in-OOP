package employee;

public class Employee {
    private int Eid;
    private String Name;
    private String Address;
    private double Salary;

    public Employee(int Eid, String Name, String Address, double Salary) {
        this.Eid = Eid;
        this.Name = Name;
        this.Address = Address;
        this.Salary = Salary;
    }

    public void displayInfo() {
        System.out.println("Employee Id: " + Eid);
        System.out.println("Employee Name: " + Name);
        System.out.println("Employee Address: " + Address);
        System.out.println("Employee Salary: " + Salary);
    }
}
