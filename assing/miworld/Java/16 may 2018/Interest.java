import java.util.Scanner;
class Interest
{
 public static void main(String args[])
 { 
   double p,r,t,si,ci;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter values of Principle Rate & Time \n Note: For Compound Interest Time is always 1 year");
   p=sc.nextDouble(); 
   r=sc.nextDouble(); 
   t=sc.nextDouble(); 
   si=(p*r*t)/100.0;
   ci=p*(1.0+(r/100.0));   
  
   System.out.println("Simple Interest:"+si);
   System.out.println("Compound Interest is:"+ci);

 }

}