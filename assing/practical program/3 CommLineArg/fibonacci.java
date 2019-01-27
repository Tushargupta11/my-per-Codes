class cmdlnargfibo
{
        public static void main(String args[])
        {
                int a=Integer.parseInt(args[0]);
                int n1=1;
                int n2=1;
                int sum=0;

                System.out.print(n1 + "\t" + n2);

                for(int i=2;i<a;i++)
                {
                        sum=sum+i;
                        System.out.print("\t" + sum);
                }
        }
}
