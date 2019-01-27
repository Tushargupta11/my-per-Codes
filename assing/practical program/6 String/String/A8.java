                             /* string conversion & toString() */


class A7
{
        int a=2;
        int b=3;

        public String toString()                           //automatically invoked when obj of class is created
        {
                return "a" + " multiply by b = " + (a*b);
        }
}

class A8
{
        public static void main(String args[])
        {
                A7 a7=new A7();

                String s="class " + a7;                  //for assign class to string obj,must 1st write some string like "class"
                                                         //if u not write them error must be there.
                System.out.println(s);
        }
}
