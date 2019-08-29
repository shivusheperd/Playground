import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      float x, y, profit, loss;
      Scanner s=new Scanner(System.in);
      x=s.nextFloat();
      y=s.nextFloat();
      profit= 12*y-x;
      loss= x-12*y;
      if(profit>0){
        System.out.printf("Profit : Rs.%.2f",profit);}
      else if(loss>0){
        System.out.printf("Loss : Rs.%.2f",loss);}
      else{
        System.out.println("No profit nor loss");}
    }
}