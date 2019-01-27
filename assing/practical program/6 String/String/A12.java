                                /* searching string using indexOf() & lastIndexOf() method */   


class A12
{
        public static void main(String args[])
        {
                String s="Now is the time for all good men" +

                         "to come to the aid of their country";

                System.out.println(s);

                System.out.println("indexOf(t) :"     + s.indexOf('t'));

                System.out.println("lastIndexOf(t) :" + s.lastIndexOf('t'));

                System.out.println("indexOf(the) :"     + s.indexOf("the"));

                System.out.println("lastIndexOf(the) :" + s.lastIndexOf("the"));
        }
}
