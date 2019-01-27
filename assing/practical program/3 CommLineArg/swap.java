class cmdlnargswap
{               
        public static void main(String args[])
        {
                int a=Integer.parseInt(args[0]);
                int b=Integer.parseInt(args[1]);
                int temp;

                System.out.print("\n Before Swapping =" + a + "\t" + b);

                temp=a;
                a=b;
                b=temp;

                System.out.print("\n After Swapping =" + a + "\t" + b);
        }

}
