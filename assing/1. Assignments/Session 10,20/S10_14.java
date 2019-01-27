import java.util.Scanner;
class Stack
{
    int top=-1;
	int list[]=new int[10];
	void push()
	{
		Scanner sc=new Scanner(System.in);
		top++;
		System.out.println("Enter elements to be pushed in Stack");
		list[top]=sc.nextInt();
		System.out.println("element pushed");
	}
    void pop()
    {	
		System.out.println("element popped="+list[top]);
		top--;
	}
    void compare(Stack a)
	{
		if(list[top]==a.list[a.top])
		{
			System.out.println("top of Stack matched");
		}
		else
		{
			System.out.println("top of Stack not matched");
		}
	}
	
	


}

class S10_14
{
	public static void main(String []ar)
	{
		Stack s1=new Stack();
	    Stack s2=new Stack();
        s1.push();
		s2.push();
		s1.compare(s2);
		
	}
}