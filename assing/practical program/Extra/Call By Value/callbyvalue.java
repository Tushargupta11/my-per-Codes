                                 /* Call By Value */               



class A3
{
        void meth(int i,int j)
        {
                i=i*10;
                j=j/10;
 	System.out.println("Method Call  :" + i+ "\t" + j);
        }
}

class callbyvalue
{
        public static void main(String args[])
        {
                int a=10;
                int b=20;

                A3 a3=new A3();

                System.out.println("Before Call :" + a + "\t" + b);

                a3.meth(a,b);

                System.out.println("After Call  :" + a + "\t" + b);
        }
}
             
                        
