import java.util.Scanner;
public class LargestSmallestTernery{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
  System.out.println("Enter first number");
  int a =in.nextInt();
  System.out.println("Enter second number");
  int b=in.nextInt();
  System.out.println("Enter third number");
  int c=in.nextInt();
   int largest=(a>b)?((a>c)?a:c):(b>c)?b:c);
  int smallest=(a<b)?((a<c)?a:c):(b<c)?b:c);
  System.out.println("Largest:"+largest);
  System.out.println("Smallest:"+smallest);
               }
            }
