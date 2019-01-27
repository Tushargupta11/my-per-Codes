                               /* Armstrong Number upto Limit */


class cmdlnargarmstrong1
{
        public static void main(String args[])
        {
                int num=Integer.parseInt(args[0]);
                int i=1,a,b,c;

                while(i<=num)
                {
                        a=i%10;                //extract last digit
                        b=i%100;
                        b=(b-a)/10;            //extract second digit
                        c=i/100;               //extract first digit


                        if((a*a*a)+(b*b*b)+(c*c*c)==i)
                                System.out.print("\t" + i);

                        i++;
                }
        }
}
