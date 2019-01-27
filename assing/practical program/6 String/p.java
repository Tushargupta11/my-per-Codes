class pat
{
int i,j,k;
void patt()
{
for(i=0;i<5;i++)
{
for(j=5;j>i;j--)
{
System.out.print(" ");
}
for(j=0;j<=i;j++)
{
System.out.print(" *");
}
System.out.println();
}
}
}
class p
{
public static void main(String[] arg)
{
pat p1=new pat();
p1.patt();
}
}
