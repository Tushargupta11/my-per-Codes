                                       /* Reverse of given number */


class reverse
{
        public static void main(String args[])
        {
                int num=123;
                int rem,rev=0;
                int temp=num;

                while(num>0)
                {
                        rem=num%10;    
                        num=num/10;
                        //System.out.print(rem);
                        rev=(rev*10)+rem;
                }
                System.out.print(rev);
        }
}
                 
                                 
