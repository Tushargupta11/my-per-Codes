interface Student
{
    
    public void display_grade();
    public void attandance();	
}

class PG_Students implements Student
{
    public void display_grade()
    { 
	    System.out.println("Grade=A");
		
    }
	public void attandance()
    {
		System.out.println("Attandance=70%");
	}
}

class UG_Students implements Student
{
    public void display_grade()
    {
		System.out.println("Grade=A+");
	}
	public void attandance()
    {
		System.out.println("Attandance=80%");
	}
}
class S10_21
{
    public static void main(String args[])
    {
        PG_Students obj=new PG_Students();
        UG_Students obj1=new UG_Students();
 
        System.out.println("details of the PG_Students= ");
		obj.display_grade();
		obj.attandance();
        
        System.out.println("Details of the UG_Students= ");
		obj1.display_grade();
		obj1.attandance();
    }
}