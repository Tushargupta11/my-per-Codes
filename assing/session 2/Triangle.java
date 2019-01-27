class Triangle
{
public static void main(String args[])
{
float a=11,b=13,c=15;

float S = a + b + c / 2 ;

double A = ( S * ( S - a ) * ( S - b ) * ( S - c ) );
       A = A * A;

System.out.println("side are :" + a + " " + b + " " + c + " " +S);
System.out.println("area of triangle is :" +A);
}
}