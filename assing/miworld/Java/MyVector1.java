import java.util.Vector;


public class MyVector1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		v.add(5);
        v.add(5.5);
		v.add(2.7f);
        v.add('d');		
        v.add("hellojava");
        for(int i=0;i<v.size();i++)
        {
        	System.out.println(v);
        }
	}

}