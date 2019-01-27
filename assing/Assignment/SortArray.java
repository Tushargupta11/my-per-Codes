import java.util.Scanner;
class SortArray
{
 public static void main(String args[])
 {
  int i,j,arr[],n;
  arr=new int[10];
  Scanner sc=new Scanner(System.in);
  System.out.print("\nEnter the size of array (max. 10)..");
  n=sc.nextInt();
  System.out.print("\nEnter the elements of array.."); 
  for(i=0;i<n;i++)
  { 
   arr[i]=sc.nextInt();
  }
  int temp;
  for(i=0;i<n-1;i++)
  {
   for(j=0;j<n-i-1;j++)
   {
   if(arr[j]>arr[j+1])
   {
    temp=arr[j];
    arr[j]=arr[j+1];
    arr[j+1]=temp;
   }
   }
  }
  System.out.print("\nThe sorted array is...");
  for(i=0;i<n;i++)
  {
   System.out.print("\t"+arr[i]);
  }
 }
}