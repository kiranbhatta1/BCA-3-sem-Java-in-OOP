import java.util.Scanner;

public class SwitchArth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number:");
        double num1 = sc.nextDouble();

        System.out.println("Enter Second Number:");
        double num2 = sc.nextDouble();

        System.out.println("Choose an operation:");
        System.out.println("+ for Addition");
        System.out.println("- for Subtraction");
        System.out.println("* for Multiplication");
        System.out.println("/ for Division");
        System.out.println("% for Modulus");

        char choice = sc.next().charAt(0);

        switch (choice) {
            case '+':
                System.out.println("The Addition of two numbers is: " + (num1 + num2));
                break;
            case '-':
                System.out.println("The Subtraction of two numbers is: " + (num1 - num2));
                break;
            case '*':
                System.out.println("The Multiplication of two numbers is: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("The Division of two numbers is: " + (num1 / num2));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            case '%':
                if (num2 != 0) {
                    System.out.println("The Modulus of two numbers is: " + (num1 % num2));
                } else {
                    System.out.println("Modulus by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Please enter a valid operation.");
        }

        sc.close();
    }
}

