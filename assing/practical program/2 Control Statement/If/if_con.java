class A
{
        void show(int age)
        {
             if(age>=18)
             {
                      System.out.print("Qualify for vote");
             }
             else
             {
                      System.out.print("Not qualify for vote");
             }
        }
        
}

class if_con
{
        public static void main(String arg[])
        {
                A a=new A();
                a.show(20);
        }
}

