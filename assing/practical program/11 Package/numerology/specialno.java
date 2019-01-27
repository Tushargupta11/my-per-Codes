package numerology;

public class specialno
{
        public void add(int num)
        {
                int rem,sum=0;

                while(num>0)
                {
                        rem=num%10;
                        sum=sum+rem;
                        num=num/10;
                }
                System.out.println("Addition :" + sum);
        }
}                       
