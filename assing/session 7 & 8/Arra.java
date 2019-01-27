import java.util.Scanner;

class Arra
{
public static void main(String args[])
{
 int arr[];
 Scanner sc=new Scanner(System.in);
 System.out.println("enter array size:");
 int n = sc.nextInt(); 
 arr=new int[n];
 
 int i; 
System.out.println("enter the array values:");
 for(i=0;i<n;i++)
 {
   arr[i]=sc.nextInt();
 }
System.out.println("Displaying array values");

 for(i=0;i<n;i++)
 {
   System.out.print(arr[i]);   
}
System.out.print("\n");
}
}
