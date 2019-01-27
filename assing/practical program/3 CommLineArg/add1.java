class cmdlnargadd1
{
        public static void main(String args[])
        {
                int sum=0;
                
                System.out.print("\n Total Argument =" + args.length);


                for(int i=0;i<args.length;i++)
                {
                        System.out.print("\t" + args[i]);

                        int c=Integer.parseInt(args[i]);
                        sum=sum+c;
                }
                System.out.print("\n Addition =" + sum);
        }
}
                             
