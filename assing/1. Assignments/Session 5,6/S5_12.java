import java.util.Scanner;
class S5_12
{
 public static void main(String args[])
 {
 
       int i,j,k,l;
      for(l=1;l<=5;l++)
      for(k=1;k<l;k++)
      for(j=1;j<k;j++)
      for(i=1;i<j;i++)
      {
            if((i+j+k)==l)
            System.out.println(i+"+"+j+"+"+k+"="+l);
       }
  

 }

}