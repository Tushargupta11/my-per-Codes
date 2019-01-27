class Combination
{
 public static void main(String args[])
 {
  int i,j,k,l;
  for(l=1;l<=500;l++)
  {
   for(i=0;i<=500;i++)
   {
    for(j=0;j<=500;j++)
    {
     for(k=0;k<=500;k++)
     {
      if((i+j+k)==l)
      {
       System.out.println(i+" + "+j+" + "+k+" = "+l);
      }
     }
    }
   }
  }
 }
}