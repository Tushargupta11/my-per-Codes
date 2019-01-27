import java.util.Scanner;
class MatrixAdd
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int arr1[][]=new int[3][3];
  int arr2[][]=new int[3][3];
  int arr3[][]=new int[3][3];
  int i,j;
  System.out.print("\nEnter the elements of first array...");
  for(i=0;i<3;i++)
  {
   for(j=0;j<3;j++)
   {
    arr1[i][j]=sc.nextInt();
   }
  }
  System.out.print("\nEnter the elements of second array...");
  for(i=0;i<3;i++)
  {
   for(j=0;j<3;j++)
   {
    arr2[i][j]=sc.nextInt();
    arr3[i][j]=arr1[i][j]+arr2[i][j];
   }
  }
  System.out.print("\nThe resultant array is...\n");
  for(i=0;i<3;i++)
  {
   for(j=0;j<3;j++)
   {
    System.out.print("\t"+arr3[i][j]);
   }
  System.out.println();
  }
 }
}