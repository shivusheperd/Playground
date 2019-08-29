import java.util.Scanner;
class Main
{
public static void main(String args[])
{
// fill your code
      Scanner s=new Scanner(System.in);
      String str=s.next();
      int n=s.nextInt();
      if((str.equals("rear")&&(n==2||n==0))||(str.equals("front")&&n==1))
         System.out.println("Left Handed");
         else
          System.out.println("Right Handed");
}
}