class cmdlnargevenodd
{
        public static void main(String args[])
        {
                
               /*

                int a=Integer.parseInt(args[0]);
                

                if(a%2==0)
                        System.out.print(a + " is" + " Even Number");
                else
                        System.out.print(a + " is" + " Odd Number");
                
              */

                int b=Integer.parseInt(args[0]);

                for(int i=1;i<=b;i++)
                {

                        if(i%2==0)
                                System.out.print("\n" + i + " is Even Number");
                        else
                                System.out.print("\n" + i + " is Odd Number");
                }

             
        }
}
