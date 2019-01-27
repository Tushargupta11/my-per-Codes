                        /* Reverse String & check Palinrome or not */


class strrev
{
        public static void main(String args[])
        {
                String str,str1="";  
                char ch;
                str=args[0];                     //pass string by comm.line arg.

                int len=str.length();            //calculate length of string

                for(int i=len-1;i>=0;i--)
                {
                        ch=str.charAt(i);
                        str1=str1+ch;
                }

                System.out.print("\nReverse String is :");
                System.out.print(str1);

                if(str.equals(str1))
                        System.out.print("\nString is Palindrome");
                else
                        System.out.print("\nString is not Palindrome");
        }
}
