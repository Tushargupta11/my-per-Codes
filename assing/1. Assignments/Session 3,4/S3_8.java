import java.util.Scanner;
class S3_8
{
 public static void main(String args[])
 { 
   double p,r,t,si,ci;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter values of Principle Rate & Time \n");
   p=sc.nextDouble(); 
   r=sc.nextDouble(); 
   t=sc.nextDouble(); 
   si=(p*r*t)/100.0;
	r=(1+r/100.0);
        
        for(int i=0;i<t;i++)
          t*=r;
   ci=(p*r)-p;   
  
   System.out.println("Simple Interest:"+si);
   System.out.println("Compound Interest is:"+ci);

 }

}