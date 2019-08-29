import java.util.Scanner;
class Main
{
public static void main(String args[])
{
// fill your code
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      float r=in.nextFloat();
      int d=in.nextInt();
      switch(n)
      {
        case 1:
        case 2:
        case 3:System.out.println(""+(r*d));
          break;
        case 4:
        case 5:
        case 6:System.out.println(""+((0.2*r*d)+(r*d)));
          break;
        case 7:
        case 8:
        case 9:
        case 10:
          System.out.println(""+(r*d));
          break;
        case 11:
        case 12:
          System.out.println(""+((0.2*r*d)+(r*d)));
          break;
        default:System.out.println("Invalid Input");
      }
}
}
