class gtl
{
 public static void main(String args[])
 {
  double gal,li;
   int counter;
   counter=0;
   for(gal=1;gal<=10;gal++)
    {
     li=gal*3.14;
     System.out.println(gal+"gal is"+li+"li is");
	counter++;
     if(counter==10)
     {
	System.out.println();
        counter =0;
     }
    }
 }
}