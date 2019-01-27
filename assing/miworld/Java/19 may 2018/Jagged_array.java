import java.util.*;
class Jag
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int arr[][]=new int[2][];
  arr[0]=new int[3];
  arr[1]=new int[2];
 int count=0,i,j;
    System.out.println("Enter array element"); 
  for( i =0;i<arr.length;i++)
    {
     for(j =0;j<arr[i].length;j++)   
     arr[i][j]=count++;
    }

System.out.println("Conents of 2D Jagged array"); 
  for( i =0;i<arr.length;i++)
    {
     for(j =0;j<arr[i].length;j++)   
     {System.out.print(arr[i][j]+"\t");}      System.out.println("\n");  
    }

 }
}