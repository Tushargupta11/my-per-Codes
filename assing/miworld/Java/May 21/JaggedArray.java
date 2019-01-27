class JaggedArray
{
 public static void main(String args[])
 {
  //making of jagged array
  int arr[][]=new int[2][];
  
  //first row has 3 columns
  arr[0]=new int[3];
 
  //second row has 2 columns
  arr[1]=new int[2];
  
  //intialization of array
  int c=0;
  for(int i=0;i<arr.length;i++)
  {
   for(int j=0;j<arr[i].length;j++)
   {
    arr[i][j]=c++;
   }
  }
   for(int i=0;i<arr.length;i++)
  {
   for(int j=0;j<arr[i].length;j++)
   {
    System.out.print(" "+arr[i][j]);
   }
  System.out.println();
  }
 }
}