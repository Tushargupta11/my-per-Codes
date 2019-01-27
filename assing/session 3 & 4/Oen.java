import java.util.*;
class Oen
{
public static void main(String args[])
{
int x;
Scanner sc = new Scanner(System.in);
System.out.print("enter the number to check:");
x=sc.nextInt();
if(x%2==0)
{
System.out.println("number is even:" +x);
}
else 
{
System.out.println("number is odd:" +x);
}
}
}