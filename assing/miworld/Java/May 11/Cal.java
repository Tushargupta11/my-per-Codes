class Cal
{
  public static void main(String args[])
  {
  int num1=8,num2=4,result=0,ch=6;
  
    switch(ch)
    {
    case 1:
    result=num1+num2;
    break;
    case 2:
    result=num1-num2;
    break;
    case 3:
    result=num1*num2;
    break;
    case 4:
    result=num1/num2;
    break;
    case 5:
    result=num1%num2;
    break;
    default:
    System.out.println("Enter the valid input");
    }
  System.out.println("Result="+result);
  }
}