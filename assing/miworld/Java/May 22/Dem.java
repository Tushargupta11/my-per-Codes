class Dem
{
static int a=10;
int show(int x,int y)
{
int c=x+y;
return c;

}
public static void main(String args[])
{
 Dem d=new Dem();
 System.out.print(a);
 int res=d.show(20,30);
System.out.print("\nAdiition is.."+res);
}
}