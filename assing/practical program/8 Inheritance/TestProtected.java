class A3
{
        protected int a=10;
}

class A4 extends A3
{
        int b=10;
	
}

class A5 extends A4
{
        int mul;

        void cal()
        {
                mul=a*b;
                System.out.println("Multiplication =" + mul);
        }
}

class TestProtected
{
        public static void main(String args[])
        {
                A5 a5=new A5();
                a5.cal();
        }
}

