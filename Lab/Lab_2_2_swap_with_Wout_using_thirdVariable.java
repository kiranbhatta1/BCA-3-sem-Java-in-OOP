import java.util.Scanner;
public class SwapVariable{
  public Static void main(String[] args){
Scanner in=new Scanner(System.in);
    System.out.println("eneter first number(a)");
    int a= in.nextInt();
    System.out.println("enter second number(b)");
    int b=in.nextInt();
    // using with third variable
    int temp=a;
    a=b;
    b=temp;
    System.out.println("After swapping (withV-temp):a="+a+",b="+b);
    //without using third variable
  a=a+b;
  b=a-b;
  a=a-b;
  System.out.println("After sawpping (withOUT- temp):a="+a+",b="+b);
                                        }
                      }
    
