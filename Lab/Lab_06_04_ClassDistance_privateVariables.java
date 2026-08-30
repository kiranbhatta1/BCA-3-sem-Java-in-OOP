class Distance {
    private int feet;
    private int inches;
    Distance(int f, int i) {
        feet = f;
        inches = i;
        normalize();
    }
    void normalize() {
        feet += inches / 12;
        inches = inches % 12;
    }
    Distance addDistance(Distance d) {
        int totalFeet = this.feet + d.feet;
        int totalInches = this.inches + d.inches;
        return new Distance(totalFeet, totalInches);
    }
    void displayDistance() {
        System.out.println(feet + " Feet " + inches + " Inches");
    }
}
public class MyDistance {
    public static void main(String[] args) {
        Distance d1 = new Distance(5, 8);
        Distance d2 = new Distance(3, 11);
        Distance d3 = d1.addDistance(d2);
        System.out.println("Total Distance:");
        d3.displayDistance();
    }
}
