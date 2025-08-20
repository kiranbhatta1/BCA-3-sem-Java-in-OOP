import java.util.Scanner;

public class NestedCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();

        if (num % 2 != 0) {
        
            if (num % 3 == 0) {
                System.out.println("Odd & Divisible by 3");
            } else {
                System.out.println("Odd but not divisible by 3");
            }
        } else {
          
            if (num % 3 == 0) {
                System.out.println("Even & Divisible by 3");
            } else {
                System.out.println("Even but not divisible by 3");
            }
        }

        sc.close(); 
    }
}
