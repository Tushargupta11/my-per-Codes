class twodd
{
 public static void main(String args[])
 { 
 int twod[][] = new int[16][32];
 int i,j,k=0;
 for(i=0;i<16;i++)
  {
   for(j=0;j<i+1;j++)
   twod[i][j]=i+j+k;
    k++;
  }

  for(i=0;i<16;i++)
   {
   for(j=0;j<i+1;j++)
   System.out.print(twod[i][j] + " ");
   System.out.println();
}
}
}
