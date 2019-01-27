
public class TestInheritance extends Inheritence{
	
	     int y= 20;
	     
	     TestInheritance()
	     {
	     System.out.println("sub class constructor");
	     }
	     
	     TestInheritance(int x)
	     {
	    	 y = x;
	    	 
	     System.out.println("sub class parameter constructor");
	     }
	     
	     
	     
	     void print()
	     {
	    	 System.out.println("sub class");
	    	 System.out.println(y);
	     }
	    
	
	     public static void main(String arg[])
	     {
	    	 
	    	 TestInheritance t1 = new TestInheritance();
	    	 TestInheritance t2 = new TestInheritance(20);
	            	 
	    	 
	    	 
	     }
	

}
