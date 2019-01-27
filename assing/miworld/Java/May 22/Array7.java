import java.util.Scanner;
class Array7
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int arr[]=new int[5];
  int i,b=0,s,b2=0,b3=0;
  System.out.print("\nEnter he five elements of the array...");
  for(i=0;i<5;i++)
  {
   arr[i]=sc.nextInt();
   if(b<arr[i])
   {
    b=arr[i];
   }
  }
  s=arr[0];
  for(i=0;i<5;i++)
  {
   if(arr[i]<b)
   {
    if(b3<arr[i])
    {
     b2=arr[i];
     b3=b2;
    }
   }
   
   if(s>arr[i])
   {
    s=arr[i];
   }
  }
  System.out.print("\nThe biggest number is.."+b);
  System.out.print("\nThe smallest number is.."+s);
  System.out.print("\nThe second biggest number is.."+b2);
 }
}