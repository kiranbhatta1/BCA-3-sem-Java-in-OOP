public class Expression {
public static void main(String[] args){
 int a=9,b=13,c=3;
  double x= a-b/3.0+ c*2-1;
  float y=a-(float)b/(3+c)*(2-1);
  float z=a-((float)b/(3+c)*2)-1;
  System.out.println("x="+x);
  System.out.println("y="+y);
  System.out.println("y="+z);
}
}
  
