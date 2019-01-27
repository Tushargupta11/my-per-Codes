                                 /* Static variable can refers static context */



class A1
{
        static int x;                                   //static variable

        public static void main(String args[])          //static method
        {
                x=10;
                System.out.print(x);
        }
}
                                    
