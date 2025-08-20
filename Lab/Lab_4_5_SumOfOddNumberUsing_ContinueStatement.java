public class SumOfOddNumberUsing_ContinueStatement {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 50; i++) { 
            if (i % 2 == 0)
                continue;
            sum += i;
        }
        System.out.println("Sum of odd numbers from 1 to 50 is: " + sum);
    }
}
