class Tempe
{
 public static void main(String args[])
 {
  float c=36;
  System.out.println("Celcius to Farehanite conversion :\n" );
  System.out.println("Value of Temperature in c :" +c);
  float f;
  f=((9*c)/5+32);
  System.out.println("\nValue of Temperature in F :"+f);
  System.out.println(" \nFarehanite to Celcius conversion :");
  c=((f-32)*5)/9;
  System.out.println("\nValue of Temperature in F :" +f);
  System.out.println("Value of Temperature in c :" +c);
 }
}