import java.util.Scanner;
interface StackOperations
{
	void push();
	void pop();
}
class UserStack
{
	int top=-1;
    int arr[]=new int[5];
    UserStack()
	{
    	arr[0]=0;
		top++;
	}	

    void push()
	{
		System.out.println("Enter element to be pushed");	
	    Scanner sc=new Scanner(System.in);		
		int a=sc.nextInt();
		arr[top+1]=a;
		System.out.println(a+"sucessfully pushed");	
		
	}
   void pop()
	{
		top--;
		System.out.println("element successfully poped");	
	}
}


class S10_5
{
 public static void main(String [] args)
 {
	    UserStack obj=new UserStack();
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter operation to be performed on stack\n1. push\n2. pop");		
		int a=sc.nextInt();
		switch(a)
		{
			case 1:
			obj.push();
			break;
			case 2:
			obj.pop();
			break;
			default :
			System.out.println("Enter valid option");
		}
 
	

 }
}