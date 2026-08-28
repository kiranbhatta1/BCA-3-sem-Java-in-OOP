class Box {

    private double width, height, depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;

    double volume() {
        return width * height * depth;
    }


    double surfaceArea() {
        return 2 * (width * height + width * depth + height * depth);
    }
}

public class PrivateVariable_withConstuctionsImplemention {
    public static void main(String[] args) {

        Box b1 = new Box(2, 3, 4);


        System.out.println("Box 1 volume: " + b1.volume());
        // Print surface area
        System.out.println("Box 1 surface area: " + b1.surfaceArea());
    }
}
