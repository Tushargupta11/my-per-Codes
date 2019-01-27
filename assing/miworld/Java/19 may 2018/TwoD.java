import java.util.*;
class TwoD
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int a[][]=new int[3][3];
  int b[][]=new int[3][3];
  int i,j;
    System.out.println("Enter array element"); 
  for( i =0;i<3;i++)
    {
     for(j =0;j<3;j++)   
     a[i][j]=sc.nextInt();
    }

System.out.println("Display array element"); 
  for( i =0;i<3;i++)
    {
     for(j =0;j<3;j++)   
     {System.out.print(a[i][j]+"\t");}      System.out.println("\n");  
    }

 }
}