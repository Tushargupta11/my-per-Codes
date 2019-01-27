
public class EmpC {
	
	
	 int empno; 
	    String ename;
	    float sal;
	    float comm;
	    
	    
	    EmpC()
	    {
	    	empno = 101;
	    	ename = "rahul";
	    	sal = 3000;
	    	comm = 200;		
	    	
	    }
	    
	    EmpC(int x,String y,float z,float u )
	    {
	    	empno = x;
	    	ename = y;
	    	sal = z;
	    	comm = u;		
	    	
	    }
	    
	    
	    
	    
	    void disp()
		   {
			   
			   System.out.println(empno);
			   System.out.println(ename);
			   System.out.println(sal);
			   System.out.println(comm);
			   
		   }
		   
	    public static void main(String arg[])
		   {
		
	    	
	    	   EmpC e1 = new EmpC();
	    	   e1.disp();
	    	   EmpC e2 = new EmpC(1002,"shan",3000,200);
	    	   System.out.println("");
	    	   e2.disp();
		   
		   		   }
	    
	       
	    			
		   }
	    
	    



