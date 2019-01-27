import javax.swing.*;
import javax.swing.tree.*;

class TreeDemo
{
	JFrame frame;
	public TreeDemo()
	{
		frame=new JFrame("JTree Demo");
		
		DefaultMutableTreeNode course=new DefaultMutableTreeNode("Courses");
		DefaultMutableTreeNode android=new DefaultMutableTreeNode("Android");
		DefaultMutableTreeNode java=new DefaultMutableTreeNode("Java");
		DefaultMutableTreeNode php=new DefaultMutableTreeNode("PHP");
		
		course.add(android);
		course.add(java);
		course.add(php);
		
		DefaultMutableTreeNode a1=new DefaultMutableTreeNode("Android Batch 1");
		DefaultMutableTreeNode a2=new DefaultMutableTreeNode("Android Batch 2");
		DefaultMutableTreeNode a3=new DefaultMutableTreeNode("Android Batch 3");
		DefaultMutableTreeNode a4=new DefaultMutableTreeNode("Android Batch 4");
		
		android.add(a1);
		android.add(a2);
		android.add(a3);
		android.add(a4);
		
		DefaultMutableTreeNode b1=new DefaultMutableTreeNode("Java Batch 1");
		DefaultMutableTreeNode b2=new DefaultMutableTreeNode("Java Batch 2");
		DefaultMutableTreeNode b3=new DefaultMutableTreeNode("Java Batch 3");
		
		java.add(b1);
		java.add(b2);
		java.add(b3);
		
		DefaultMutableTreeNode c1=new DefaultMutableTreeNode("PHP Batch 1");
		DefaultMutableTreeNode c2=new DefaultMutableTreeNode("PHP Batch 2");
		
		php.add(c1);
		php.add(c2);
		
		JTree jt=new JTree(course);
		
		frame.add(jt);
		frame.setSize(400, 400);
		frame.setVisible(true);
	}
}
public class JTreeTest 
{
	public static void main(String[] args) 
	{
		TreeDemo td=new TreeDemo();
	}
}