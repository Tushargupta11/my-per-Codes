class cal
{
        int a,b;

        cal(int i,int j)
        {
                a=i;
                b=j;
        }

        void mul(cal c)
        {
                c.a=c.a*10;
                c.b=c.b*10;
        }
}

class callbyref
{
        public static void main(String args[])
        {
                cal c1=new cal(10,20);

                System.out.println("Before Call :" + c1.a + "\t" + c1.b);

                c1.mul(c1);

                System.out.println("After Call :" + c1.a + "\t" + c1.b);
        }
}
                             
