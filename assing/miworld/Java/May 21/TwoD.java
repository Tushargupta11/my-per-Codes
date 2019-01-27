import java.util.Scanner;
class TwoD
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int arr[][]=new int[3][3];
  int i,j;
  System.out.print("Enter the array elements..");
  for(i=0;i<3;i++)
  {
   for(j=0;j<3;j++)
   {
    arr[i][j]=sc.nextInt();
   }
  }
  System.out.println("\nThe elements of array is...");
  for(i=0;i<3;i++)
  {
   for(j=0;j<3;j++)
   {
    System.out.print(" "+arr[i][j]);
   }
  System.out.println();
  }
 }
}