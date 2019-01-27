import java.util.Scanner;
class S7_7
{
  public static void main(String args[])
  {
   int arr[];
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter no of elements in the Array");
    int n=sc.nextInt();
   arr=new int[n];
   System.out.println("Enter elements of the Array");
   for(int i=0;i<arr.length;i++)
   {
    arr[i]=sc.nextInt();
   }
  
   System.out.println("Array elements are ");
   for(int i=0;i<arr.length;i++)
   {
       System.out.println(+arr[i]);
   }
   System.out.println("Press\n1.To find the second biggest element of the array  \n2.To find smallest of N numbers");
    int m=sc.nextInt();
    switch(m)
    {
     case 1 :
    {
     for(int i=0;i<n;i++)
    {
     for(int j=i+1;j<n;j++)
     {
     if(arr[i]>arr[j]) 
     {
     int temp;
     temp=arr[i];
     arr[i]=arr[j];
     arr[j]=temp;
     }
       } 
       }
     System.out.println("Second biggest element of the array is="+arr[(n-2)]);
     break;
     }
     case 2:
    {
     for(int i=0;i<n;i++)
    {
     for(int j=i+1;j<n;j++)
     {
     if(arr[i]>arr[j]) 
     {
     int temp;
     temp=arr[i];
     arr[i]=arr[j];
     arr[j]=temp;
     }
       } 
       }
     System.out.println("Smallest of N numbers is="+arr[0]);

     break;
     }
     default :
     System.out.println("Please enter a valid no");   
    }   
  }
}