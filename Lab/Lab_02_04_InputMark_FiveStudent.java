import java.util.Scanner;
 public class MarkCal{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int total=0;
  int []marks=new marks[5];
   for(int i=0;i<5;i++)
     {
 System.out.println("enter marks of subject"+(i+1)+":");
       marks[i]=sc.nextInt();
       total +=marks[i];
     }
  double average=total/5.0;
  System.out.println("Total marks:"+ total);
  System.out.println("Average marks:"+average);
}
  }
