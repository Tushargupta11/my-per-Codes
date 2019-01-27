class S3_9
{
  public static void main(String args[])
  {
   int x=2,y=3;
   System.out.println("Before Swaping\na="+x);  
   System.out.println("b="+y);  
   y = (x * y) / (x = y);
   System.out.println("After Swaping\na="+x);  
   System.out.println("b="+y);  
  }
}