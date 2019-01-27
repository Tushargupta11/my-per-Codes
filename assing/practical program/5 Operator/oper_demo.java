                                                /* Operator Demo */



class oper_demo
{
        public static void main(String args[])
        {
                int a=5,b=3;
                int c=a*b;
                int d;

                System.out.print("\n Multiplication=" + c);
                System.out.print("\n Multiplication=" + a*b);
                System.out.print("\n Multiplication=" + (a*b));

                float f=a/b;                                              //declare variable when required
                System.out.print("\n Division=" + f);

                float ff=(float)a/b;                                      //type casting
                System.out.print("\n Division=" + ff);

                float fff=(float)3.14;                                    //can't assign float value at the time of declaration
                System.out.print("\n Value of fff=" + fff);
        }
}
                             
                             
