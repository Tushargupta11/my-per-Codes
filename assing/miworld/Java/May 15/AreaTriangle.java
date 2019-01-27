class AreaTriangle
{
  public static void main(String args[])
   {
    int a=7,b=8,c=9;
    double s,area;
    s=(a+b+c)/2;
    System.out.println(a+" "+b+" "+c+" "+s);
    area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
    System.out.println("The area of triangle is.."+area);
   }
}