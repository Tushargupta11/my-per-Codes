import java.util.Scanner;
class Employee
{
	String name,address;
	int dept_no,age;
	void enterDetail()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of employee");
		name=sc.nextLine();
		System.out.println("Enter address of employee");
		address=sc.nextLine();
		System.out.println("Enter dept_no of employee");
		dept_no=sc.nextInt();
		System.out.println("Enter age of employee");
		age=sc.nextInt();
	}
	void shoeDetail()
	{
		System.out.println("Employee Details\nName of employee="+name);

		System.out.println("Address of employee="+address);

		System.out.println("Dept_no of employee="+dept_no);

		System.out.println("Age of employee="+age);
	}
}

class S10_8
{
	public static void main(String []ar)
	{
		Employee e1=new Employee();
		Employee e2=new Employee();		
		e1.enterDetail();
		e2.enterDetail();
		e1.shoeDetail();
		e2.shoeDetail();
	}
}