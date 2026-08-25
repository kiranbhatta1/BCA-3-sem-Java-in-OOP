public class DeclareAndInitialize_JaggedArraySum {
    public static void main(String[] args) {
        int[][] jagged = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };

        for (int i = 0; i < jagged.length; i++) {
            int rowSum = 0;
            System.out.println("Row " + (i + 1) + ":");
            
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
                rowSum += jagged[i][j];
            }
            
            System.out.println("| Sum = " + rowSum);
        }
    }
}
