import java.util.Scanner;
import java.lang.Math;
class Main
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a1=9,a2=11,a3;
      System.out.print(a1+" ");
       System.out.print(a2+" ");
      for(int i=1;i<n-1;i++)       
      {a3=a1+a2;
       a1=a2;
       a2=a3;
       System.out.print(a3+" ");
      }
	}
}