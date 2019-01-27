class vowel
{
        public static void main(String args[])
        {
                String str=args[0];
                int count=0;
                int len=str.length();

                for(int i=0;i<=len-1;i++)
                {
                        switch(i)
                        {    
                                case 'a':
                                case 'e':
                                case 'i':
                                case 'o':
                                case 'u':
                                        count++;
                        }               
                }
                
                System.out.print(count);
        }
}
                                           
