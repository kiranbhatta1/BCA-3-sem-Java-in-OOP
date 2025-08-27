public class FactorialAndFibonacci {

    static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of " + num + " is: " + factorial(num));
        System.out.println(num + "th Fibonacci number is: " + fibonacci(num));
    }
}
