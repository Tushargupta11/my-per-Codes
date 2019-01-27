import java.util.Scanner;
class Leap 
{
  public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any year:");
        int y = sc.nextInt();
        boolean count = false;
        if(y % 400 == 0)
        {
            count = true;
        }
        else if (y % 100 == 0)
        {
            count = false;
        }
        else if(y % 4 == 0)
        {
            count = true;
        }
        else
        {
            count = false;
        }
        if(count)
        {
            System.out.println("Year "+y+" is a Leap Year");
        }
        else
        {
            System.out.println("Year "+y+" is not a Leap Year");
        }
    }
}