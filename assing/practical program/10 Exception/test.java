class test
{
        public static void main(String args[])
        {
                int a,b,c;
                double d;

                try
                {
                        a=Integer.parseInt(args[0]);
                        b=Integer.parseInt(args[1]);

                        c=a+b;
                        System.out.println("Addition=" + c);

                        d=a/b;
                        System.out.println("Division=" + d);
                }

                catch(ArrayOutofBoundException e)                                                                //if inputs are null 
                {
                        System.out.println("plz give 2 values");
                }

                catch(NumberFormatException e)                                                                 //if inputs are a & b
                {
                        System.out.println("plz give 2 numbers, not characters");
                }

                catch(Exception e)                                                                                          //if inputs are 10 & 0 , b'coz 10 not divide by 0
                {
                        System.out.println("Contact Vendors");
                }


        }
}
