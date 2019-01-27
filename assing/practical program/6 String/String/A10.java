                               /* String Comparison */ 


class A10
{
        public static void main(String args[])
        {
                String s1="sagar";
                String s2="sagar";
                String s3="SAGAR";
                String s4="Sagar";


              /* all of below returns boolean value */


                System.out.println(s1.equals(s2));               //"equals()" consider case-sensitivity
                System.out.println(s1.equals(s3));
                System.out.println(s1.equals(s4));

                System.out.println(s1.equalsIgnoreCase(s3));    //"equalsIgnoreCase()" consider case-sensitivity
                System.out.println(s3.equalsIgnoreCase(s4));
        }
}
