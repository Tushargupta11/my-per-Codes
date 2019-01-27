class A
{
        A()                                                                //not necessary to refer "public"
        {
                System.out.print("Default Constructor");
        }

        public A(int x,int y)
        {
                System.out.print("\nParameterized Constructor:" + (x+y));
        }

}

class test1
{             
        public static void main(String args[])
        {
                A a=new A();
                A a1=new A(100,200);
        }
}



