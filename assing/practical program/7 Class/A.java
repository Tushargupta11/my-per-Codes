                        /* Static variable cannot refers to non-static context */


class A
{
        int x;                                        //non-static context

        public static void main(String args[])        //static method
        {
                x=0;                                  //cannot accessed
                System.out.print(x);
        }
}
