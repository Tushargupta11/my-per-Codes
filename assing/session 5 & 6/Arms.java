import java.util.Scanner;
class Arms
{
public static void main(String args[])
{
int x,sum=0,x1,x2,x3;
System.out.println("Insert number to check ");
System.out.println("Whether number is Armstrong number of not");
Scanner sc=new Scanner(System.in);
x=sc.nextInt();
x1=(x/100)%10;  
x2=(x/10)%10;  
x3=x%10;
sum=(x1*x1*x1)+(x2*x2*x2)+(x3*x3*x3);
if(sum!=x)
{
System.out.println("number is not armstrong ");
}
else
{
System.out.println("number is  armstrong");
}
}
}

