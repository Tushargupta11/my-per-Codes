class cmdlnargfact
{
        public static void main(String args[])
        {
                int a=Integer.parseInt(args[0]);
                int fact=1;

                System.out.print("Factorial of " + a + "=");

                for(int i=a;i>0;i--)
                {       
                        fact=fact*i;
                }

                System.out.print(fact);
        }
}
