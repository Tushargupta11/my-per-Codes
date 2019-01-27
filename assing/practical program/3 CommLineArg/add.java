
class cmdlnargadd
{
        public static void main(String args[])
        {
                int a,b;

                a=Integer.parseInt(args[0]);
                b=Integer.parseInt(args[1]);
		

		
              System.out.print("\n Total Argument =" + args.length);

                        
            for(int i=0;i<args.length;i++)
                {
                        System.out.print("\t " + args[i]);
                }
               
             System.out.print("\n Addition =" + (a+b));
        }
}
