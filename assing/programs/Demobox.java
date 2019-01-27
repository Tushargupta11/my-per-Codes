class Box
{
double width;
double height;
double depth;
 
double volume()
{
 return width*height*depth;
}
}

class Demobox
{
public static void main(String args[])
{
Box mybox=new Box();
Box mybox1=new Box();
double vol;
mybox.width=10;
mybox.height=20;
mybox.depth=15;

mybox1.width=15;
mybox1.height=25;
mybox1.depth=20;


vol=mybox.volume();
System.out.println("volume is:" +vol);

vol=mybox1.volume();
System.out.println("volume is:" +vol);

}
}