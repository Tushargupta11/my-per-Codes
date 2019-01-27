                                /* not work */


interface I
{
        int a;
        int b;
        void swap1();
        void swap2(A2 a2);
}

class A2 implements I
{
        A2(int x,int y)
        {
                a=x;
                b=y;
        }

        public void swap1()
        {
                int temp;

                System.out.println("Before Swapping :" + a + " " + b);

                temp=a;
                a=b;
                b=temp;

                System.out.println("After Swapping :" + a + " " + b);
        }

        public void swap2(A2 a2)
        {
                int temp;

                System.out.println("Before Swapping :" + a2.a + " " + a2.b);

                temp=a2.a;
                a2.a=a2.b;
                a2.b=temp;

               System.out.println("After Swapping :" + a2.a + " " + a2.b);
        }
}

class interface3
{
        public static void main(String args[])
        {
                A2 a2=new A2(10,20);

                a2.swap1();
                a2.swap2(a2);
        }
}
