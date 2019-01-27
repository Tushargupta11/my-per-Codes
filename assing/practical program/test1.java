class test1
{
        int a,b;

        void display(int a,int b)
        {
                this.a=a;
                this.b=b;

                System.out.println("a=" + a);
                System.out.println("b=" + b);
        }

        public static void main(String args[])
        {
                test1 t=new test1();
                t.display(10,20);
        }
}
