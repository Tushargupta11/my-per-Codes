/*armstrong number
1) method of counting the digits with argument with return (Count digits)
2) custom method with two argument first is power and second is base and with return(power)
3) armstrong calculation method that check the number(resultant)*/


import java.util.Scanner;
class Armstrong
{
 int num;
 int countDigits(int n)
 {
  int rem=0,count=0;
  while(n!=0)
  {
   rem=n%10;
   count++;
   n=n/10;
  }
  return count;
 }
 int power(int b,int p)
 {
  int sum=1;
  for(int i=1;i<=p;i++)
  {
   sum=sum*b;
  }
  return sum;
 }
 void resultant(int temp)
 {
  int sum=0,c;
  num=temp;
  c=countDigits(temp);
  while(temp!=0)
  {
   int rem=temp%10;
   sum=sum+power(rem,c);
   temp=temp/10;
  }
  if(num==sum)
  {
   System.out.print("\nThe given number is armstrong number..");
  }
  else
  {
   System.out.print("\nThe given number is not a armstrong number..");
  }
 }
 public static void main(String args[])
 {
  int n;
  Armstrong arm=new Armstrong();
  Scanner sc=new Scanner(System.in);
  System.out.print("\nEnter the number..");
  n=sc.nextInt();
  arm.resultant(n);
 }
}
