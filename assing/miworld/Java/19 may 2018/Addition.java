import java.util.*;
class Addition
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int a[][]=new int[3][3];
  int b[][]=new int[3][3];

    System.out.println("Enter elements of 1st array"); 
  for(int i =0;i<3;i++)
    {
     for(int j =0;j<3;j++)   
     a[i][j]=sc.nextInt();
    }

System.out.println("Display 1st array elements"); 
  for(int i =0;i<3;i++)
    {
     for(int j =0;j<3;j++)   
     {System.out.print(a[i][j]+"\t");}      System.out.println("\n");  
    }

    System.out.println("Enter elements of 2nd array"); 
  for(int i =0;i<3;i++)
    {
     for(int j =0;j<3;j++)   
     b[i][j]=sc.nextInt();
    }

System.out.println("Display 2nd array elements"); 
  for(int i =0;i<3;i++)
    {
     for(int j =0;j<3;j++)   
     {System.out.print(b[i][j]+"\t");}      System.out.println("\n");  
    }
System.out.println("Addition of two arrays"); 
  for(int i =0;i<3;i++)
    {
     for(int j =0;j<3;j++)   
     {System.out.print((a[i][j]+b[i][j])+"\t");}      System.out.println("\n");  
    }
 }
}