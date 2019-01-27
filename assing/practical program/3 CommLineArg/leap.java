class cmdlnargleap
{
        public static void main(String args[])
        {
                int a=Integer.parseInt(args[0]);

                if(a%4==0 || a%400==0)
                        System.out.print("Leap Year");
                else
                        System.out.print("Not Leap Year");
        }
}
