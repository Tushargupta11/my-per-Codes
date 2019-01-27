                                /* Addition of 2 complex Number */


class complex
{
        private int a,b;

        public complex()                                                 //default constructor
        {
                a=0;
                b=0;
        }

        public complex(int a,int b)                                     //parameterized constructor
        {
                this.a=a;
                this.b=b;
        }

        public void display()                                          //method
        {
                if(b!=0)                                               //'b' is either +ve/-ve
                {
                        if(a!=0)                                       //first 'a' print then 'b',it may be +ve/-ve
                        {
                                System.out.print("\n" + a);
                        }

                        if(b>0)                                        //'b' must be +ve
                                System.out.print("+" + b + "i");
                        else
                                System.out.print(+ b + "i");           //-ve automatically print
                }
                else
                {
                        System.out.print("Not a Complex Number");      //otherwise
                }
        }


        public complex add(complex t2)                                 //addition of 2 complex no.
        {
                complex t=new complex();
                t.a=a+t2.a;
                t.b=b+t2.b;

                return t;
        }

        public void add(complex t1,complex t2)                        //addition of 2 complex no.
        {
                a=t1.a+t2.a;
                b=t1.b+t2.b;
        }
}                      


class test                                                             //main function
{
        public static void main(String args[])
        {
                complex c1=new complex();                              //object 1 with def.constructor
                complex c2=new complex(3,5);                           //object 2 with para.constructor
                complex c3=new complex(4,-7);                          //object 3 with para.constructor

                c1.display();
                c2.display();
                c3.display();

                complex c4=new complex();
                c4=c2.add(c3);
                c4.display();

                complex c5=new complex();
                c5.add(c2,c3);
                c5.display();
        }
}
