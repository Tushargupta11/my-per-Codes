class Salary
{
public static void main (String args[])
{
float sal=50000;
 float da=sal*40/100;
 float hre=sal*20/100;
 float gross_sal=sal+hre+da;

System.out.println("dearness allowance is:" +da);
System.out.println("house rent allowance is:" +hre);
System.out.println("gross salary  is:" +gross_sal);
}
}