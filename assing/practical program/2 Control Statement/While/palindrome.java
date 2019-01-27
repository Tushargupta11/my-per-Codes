class palindrome
{
        public static void main(String args[])
        {
                int num=121;
                int rem,rev=0,temp;
                temp=num;

                while(num>0)
                {
                        rem=num%10;
                        num=num/10;
                        rev=rev*10+rem;
                }
                System.out.print("Reverse of " + temp + "=" + rev);

                if(rev==temp)
                {
                        System.out.print("\nPalindrome Number");
                }
                else
                {
                        System.out.print("\nNot Palindrome Number");
                }
        }
}
