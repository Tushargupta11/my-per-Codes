class Cal
 {
  public static void main (String args[])
  { 
   int a=14,b=9, result=0,choice=2;
    switch(choice)
     {
      case 0:
        result=a+b;
	      System.out.println("addition c:");
	      break;
      case 1:
        result=a-b;
	      System.out.println("substraction c:");
        break;
      case 2:
        result=a*b;
 	      System.out.println("multiplication c:");
	      break;
      case 3:
        result=a/b;
	      System.out.println("division c:");
	      break;
      case 4:
        result=a%b;
	      System.out.println("modulas c:");
 	      break;  
     default:
        System.out.println("please select valid option");
       break;
     }
       System.out.print("result: " +result);
  } 
 }
