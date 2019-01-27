class cmdlnargarmstrong
{
        public static void main(String args[])
        {
                int num=Integer.parseInt(args[0]);
                int rem,sum=0;
                int temp=num;

    
                while(num>0)
                {
                        rem=num%10;
                        sum=sum+(rem*rem*rem);
                        num=num/10;
                }

                if(temp==sum)
                {
                        System.out.print("Armstrong Number");
                }
                else
                {
                        System.out.print("Not Armstrong Number");
                }

                
        }
}
