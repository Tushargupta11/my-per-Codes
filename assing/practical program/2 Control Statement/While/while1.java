                                           /* sum of given number */


class while1
{
        public static void main(String args[])
        {
                int num=123;
                int rem,sum=0;
                int temp=num;

                while(num>0)
                {
                        rem=num%10;
                        num=num/10;
                        sum=sum+rem;
                }
                System.out.print("Sum of " + temp + " is=" + sum);
        }
}
