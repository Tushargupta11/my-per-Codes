class Demo
{
int b=10;
Demo()
{
System.out.println("No. is "+b);
}
int  show(int x,int y)
{
int a,b;
a=x;
b=y;
int c=a+b;
//System.out.println("No. is.."+c);
return c;
}
public static void main(String args[])
{
int d;
Demo i=new Demo();
d=i.show(10,20);
System.out.println("No. is..."+d);

}
}