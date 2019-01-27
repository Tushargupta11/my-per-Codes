                                            /* String Concatenation */


class A6
{
        public static void main(String args[])
        {
                String age="9";
                String s="The age = " + age + " yrs.";      //use + operator
                System.out.println(s);

                String s1="four :" + 2 + 2;                       //not make addition
                System.out.println(s1);

                String s2="four :" + (2 + 2);                    //make addtion,use brackets
                System.out.println(s2);

        }
}
