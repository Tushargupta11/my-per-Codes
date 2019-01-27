class power
{
        public static void main(String args[])
        {                             
                int x=Integer.parseInt(args[0]);
                int y=Integer.parseInt(args[1]);

                int p=1;

                for(int i=1;i<=y;i++)
                {
                        p=p*x;
                }


                System.out.print(x + " raise to " + y + " = " + p);
        }
}
