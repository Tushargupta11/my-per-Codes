import java.util.*;
class DemoForEach
{
    public static void main(String args[])
    {
         int []a=new int[5];
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter 5 Values of array");
         for(int i=0;i<a.length;i++)
         {
              a[i]=sc.nextInt();
         }
        
         System.out.println("Value of array");
         for(int x:a)
         {
              System.out.println(x);
         }
         
    }
}