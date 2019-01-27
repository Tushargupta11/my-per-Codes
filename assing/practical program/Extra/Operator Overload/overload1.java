                           /* Constructor Overloading */             




class overload1
{
        public static void main(String args[])
        {
                int a,b,c;

                overload1()
                {
                        a=0;
                        b=0;
                        c=0;
                }

                overload1(int x,int y)
                {
                        a=x;
                        b=y;
                }

                overload1(int x,int y,int z)
                {
                        a=x;
                        b=y;
                        c=z;
                }


                int add()
                {
                        return (a+b+c);
                }

                overload1 o1=new overload1();
                int p=o1.add();
                System.out.print(p);

                overload1 o2=new overload1(1,2);
                int q=o2.add();
                System.out.print(q);
                

                overload1 o3=new overload1(1,2,3);
                int r=o3.add();
                System.out.print(r);
                
        }
}
