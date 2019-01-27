class for1
{
        public static void main(String args[])
        {
                int i,j,k;

                for(i=1;i<=10;i++)                    //outer loop
                {
                        for(j=5;j<=12;j++)           //inner loop
                        {
                                k=i*j;
 			// System.out.print(k);
                                System.out.print("*");
                                System.out.print("\t");
                        }
                        System.out.print("\n");
                }
        }
}
