import java.util.Scanner;
class Sc
 {
 public static void main(String args[])
 {
	double p,r,t;
	double SI=0,CI=0;
 
	System.out.println("To calculate Simple Interest and Compound Interest");
	System.out.println(" ");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter principle value:");
	p=sc.nextDouble();
	System.out.println("enter rate of interest:");
	r=sc.nextDouble();
	System.out.println("enter time period:");
	t=sc.nextDouble();

	SI=(p*r*t)/100;
	System.out.println("Simple Interest is:" +SI);
        System.out.println(" ");
	
	CI=p*(1+r/100)*t;
	System.out.println("Compound Interest is :" +CI);
 }
 }