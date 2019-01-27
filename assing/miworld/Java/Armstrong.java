import java.util.Scanner;
class Armstrong
{
  static int countDigits(int a)
   {
    int count=0;
    while(a!=0)
     {
      a=a/10;
      count++;
     }
     return count;
   }

   static int power(int b,int e)
   {
     int pow=1;
    for(int j=1;j<=e;j++)
     {
       pow=pow*b;
     }
     return pow;
   }



   static void resultant(int base,int pow)
   { 
    int t=base;
    int arm_no=0;
    int r;
    while(base!=0)
    {
      r=base%10;
      arm_no=arm_no+power(r,pow);
      base=base/10;
    }
    if(arm_no==t)
    {
    System.out.println(t+"is armstrong no");  
    }
    else
    System.out.println(t+"is not a armstrong no");   
    
   }

  public static void main(String args[])
  {
   System.out.println("Enter the no to check whether armstrong or not");
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int digit=countDigits(n);
  System.out.println("digits"+digit);
   resultant(n,digit);
   
  }
}

/**1st method
calculate total no of digits with argument with return

2nd
returntype  (base ,exponent)

3rd
armstrong calculation*/