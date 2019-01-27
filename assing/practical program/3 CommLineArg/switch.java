class cmdlnargswitch
{
        public static void main(String args[])
        {
                int s=Integer.parseInt(args[0]);
                int a=Integer.parseInt(args[1]);
                int b=Integer.parseInt(args[2]);


                switch(s)
                {
                        case 1:
                                System.out.print("Addition =" + (a+b));
                                break;
                        case 2:
                                System.out.print("Substraction =" + (a-b));
                                break;
                        case 3:
                                System.out.print("Multiplication =" + (a*b));
                                break;
                        case 4:
                                System.out.print("Division =" + (a/b));
                                break;
                        default:
                                System.out.print("Invalid First Number");
                                break;
                }
        }
}
                                            
