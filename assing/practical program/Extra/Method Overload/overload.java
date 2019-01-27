                                /* Method Overloading */



class overload
{
        public static void main(String args[])
        {
                int sum;
                double sum1;

                overload o=new overload();

                sum=o.add(10,20);
                System.out.print(sum);

                sum1=o.add(10.5,20.6);
                System.out.print("\n" + sum1);


        }


        int add(int x,int y)
        {
               return(x+y);
        }

        double add(double x,double y)
        {
               return(x+y);
        }

}
