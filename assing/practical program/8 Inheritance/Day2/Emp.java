
public class Emp {
	
	    int empno; 
	    String ename;
	    float sal;
	    float comm;
	    
	    
	   void disp()
	   {
		   
		   System.out.println(empno);
		   System.out.println(ename);
		   System.out.println(sal);
		   System.out.println(comm);
		   
	   }
	   
	   
	   void findcomm()
	   {
		   
		   comm = sal*10;
		   
		   
	   }
	   
	   
	   public static void main(String arg[])
	   {
		   
		   Emp e1 = new Emp();
		   Emp e2 = new Emp();
		   
		   e1.empno=1001;
		   e1.ename="rahul";
		   e1.sal= 3000;
		   
		   e1.findcomm();
		   e1.disp();
		   
		   
		   e2.empno=1002;
		   e2.ename="shan";
		   e2.sal= 4000;
		   
		   
		   
		   
		   System.out.println("");
		   
		   e2.findcomm();
		   e2.disp();
		   
		   
		   
	   }
	    
	

}
