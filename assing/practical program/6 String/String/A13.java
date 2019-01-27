                /* substring(),concat(),replace() method of string */



class A13
{
        public static void main(String args[])
        {
                String s1="Prajakta Patil";                                  //new string
                
                System.out.println("string :" + s1);

                System.out.println("substring :" + s1.substring(6));

                System.out.println("substring :" + s1.substring(2,8));


                String s2=" Jaipur";                                   //new string

                System.out.println(s1.concat(s2));

                String s3=s1.replace("Prajakta","Prashant");
                System.out.println("string :" + s3);                      //new string
                                                                          
                String s4=s3.replace('B','b');                            //new string
                System.out.println("string :" + s4);


        }
}
