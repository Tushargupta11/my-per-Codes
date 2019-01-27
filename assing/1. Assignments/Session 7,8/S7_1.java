import java.util.Scanner;
class S7_2
{
 public static void main(String args[])
 { 
   int arr[];
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter no of elements of array to be sorted");
   int n=sc.nextInt(); 
   arr=new int[n];
   for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt(); 
    }
     for(int i=0;i<n;i++)
    {
         System.out.println("Array elements are "+arr);
    }
  }
}


