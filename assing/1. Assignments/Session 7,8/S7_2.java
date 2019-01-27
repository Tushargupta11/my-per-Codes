import java.util.Scanner;
class S7_2
{
 public static void main(String args[])
 { 
  int arr[];
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter no of elements of array to be sorted");
   int n=sc.nextInt(); 
   arr=new int[n+1];
   for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt(); 
    }
   for(int i=0;i<n;i++)
    {for(int j=i+1;j<n;j++){
     if(arr[i]>arr[j]) 
     {
     int temp;
     temp=arr[i];
     arr[i]=arr[j];
     arr[j]=temp;
     }
}
    }
    System.out.println("Sorted Array elements are"); 
   for(int i=0;i<n;i++)
    {
    System.out.print("\t"+arr[i]); 
    }
  }
}


