class inc
{
 public static void main(String args[])
 {
  double meter,in;
   int counter;
   counter=0;
   for(meter=1;meter<=12;meter++)
    {
     in=meter*39.37;
     System.out.println(meter+"meter is"+in+"in ");
	counter++;
     if(counter==1)
     {
	System.out.println();
        counter =0;
     }
    }
 }
}