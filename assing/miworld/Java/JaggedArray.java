import java.util.Scanner;
class JaggedArray
{
  public static void main(String args[])
  {
    int arr[][]=new int[3][];
    Scanner sc=new Scanner(System.in);
    arr[0]=new int[4];
    arr[1]=new int[3];
    arr[2]=new int[2];
    System.out.println("Enter array element");
    for(int i=0;i<arr.length;i++)
    {
      for(int j=0;j<arr[i].length;j++)
      {
        arr[i][j]=sc.nextInt();
      }
    }
    System.out.println("Array element are");
    for(int i=0;i<arr.length;i++)
    {
      for(int j=0;j<arr[i].length;j++)
      {
       System.out.print(arr[i][j]);
      }
     System.out.println();
    }
  }
}