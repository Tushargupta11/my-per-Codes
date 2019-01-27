                        /* one string obj assign to another string obj  */                


class A2
{
        public static void main(String args[])
        {
                char ch[]={'J','A','V','A'};                          //char array

                String s1=new String(ch);                    //obj 1

                String s2=new String(s1);                    //obj 2

                System.out.println(s1);
                System.out.println(s2);
        }
}
