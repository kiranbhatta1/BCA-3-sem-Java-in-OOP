import java.util.Scanner;
public class ArithmeticOperations{
  public static void main (String[] args)
                                 {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter first number");
    double num1=sc.nextDouble();
    System.out.println("Enter Second number");
    double num2=sc.nextDouble();
    System.out.println("Addition:" +(num1+num2));
    System.out.println("Subtraction: +(num1-num2));
    System.out.println("Multiplication:" + (num1*num2));
    if(num2!=0){
    System.out.println("Division:" + (num1/num2));
                }else{
      System.out.println("Divison by Zero is not allowed");
                     }
    sc.close();
                                }
                                }
    
  
