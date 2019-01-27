import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

class FileChooserDemo extends JFrame implements ActionListener
{
	JMenuBar mb;
	JMenu file,EDIT;
	JMenuItem open;
	JTextArea ta;
	JLabel l;
	public FileChooserDemo()
	{
		ta=new JTextArea(900,900);
		
		mb=new JMenuBar();
		file=new JMenu("File");
		EDIT=new JMenu("Edit");
		open=new JMenuItem("Open File");
		//setContentPane(new JLabel(new ImageIcon("img/DSCN6461.JPG")));
		file.add(open);
		mb.add(EDIT);
		mb.add(file);

		ta.setBounds(40, 40, 1024, 600);
		
		ta.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
		
		open.addActionListener(this);
		add(mb);
	add(ta);
		setJMenuBar(mb);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource()==open)
		{
			JFileChooser jfc=new JFileChooser();
			int j=jfc.showOpenDialog(this);
			if(j==JFileChooser.APPROVE_OPTION)
			{
				File f=jfc.getSelectedFile();
				System.out.println("File Name:"+f.getName());
				String path=f.getPath();
				System.out.println("File Path:"+path);
				try
				{
					BufferedReader br=new BufferedReader(new FileReader(path));
					String str1="", str2="";
					while((str1=br.readLine())!=null)
					{
						str2+=str1+"\n";
					}
					ta.setText(str2);
					br.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
	}
}
public class JFileChooserTest 
{
	public static void main(String[] args) 
	{
		FileChooserDemo fd=new FileChooserDemo();
		fd.setSize(1024, 768);
		fd.setTitle("Note Pad Program");
		fd.setAlwaysOnTop(true);
		fd.setVisible(true);
		fd.setLayout(null);
	}
}