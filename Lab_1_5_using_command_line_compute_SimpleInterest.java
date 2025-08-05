public class SimpleInterest{
  public static void main(String[] args){
if(args.length!=3){
  System.out.println("usage: Java simpleInterest <principle> <rate> <time>"):
    return;
                  }
    double principle=Double.ParseDouble(args[0];
    double rate=Double.ParseDouble(args[1]);
    double time=Double.ParseDouble(args[2]);
    double SimpleInterest=(principle*rate*time)/100;
    System.out.println("Simple Interest: "+ SimpleInterest);
  }
}
                     
