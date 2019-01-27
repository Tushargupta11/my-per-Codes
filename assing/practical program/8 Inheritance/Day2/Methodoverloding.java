
public class Methodoverloding {
	
	
	      
	      void add(int a,int b )
	      {
	    	    int c = a+b;
	    	    System.out.println(c);
	    	    
	      }
	      
	      void add(float a, float b )
	      {
	    	    float c = a+b;
	    	    System.out.println(c);
	      }

	      void add(String a,String b)
	      {
	    	    
	    	  String s = a.concat(b);
	    	  System.out.println(s);
	      }
	      
	      
	      public static void main(String arg[])
	      {
	    	  Methodoverloding m1 = new Methodoverloding();
	    	  
	    	  m1.add(10, 20);
	    	  m1.add(30.0f, 40.0f);
	    	   m1.add("cdac", "acts");
	    	  
	    	
	    	  
	      }
	      
	      
}
