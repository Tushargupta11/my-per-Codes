import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class pan extends JFrame implements ActionListener {
	JLabel nme,email,pass,city,gndr,hbies,test;
	JTextField nme_in,email_in,pass_in;
	JComboBox<String> city_in;
	JRadioButton male,female;
	JRadioButtonMenuItem gndr_in;
	JCheckBoxMenuItem hbies_in;
	JCheckBox cricket,ftball,hockey;
	JButton Rgstr;
	JTable STDET;
	JScrollPane sp;
	String []cols={"Name", "Email ID", "Password","City","Gender","Hobbies"};
	String [][]rows={{"Sourabh", "abc@gmail.com", "123abc456","Jaipur","Male","Football"}};
	
	DefaultTableModel model;
	
	public pan() {   // CONSTRUCTOR
	
		
		
		//LABELS
		nme= new JLabel("Name");
		email = new JLabel("E Mail");
		pass = new JLabel("Password");
		city = new JLabel("City");
		gndr = new JLabel("Gender");
		hbies = new JLabel("Hobbies");
		test= new JLabel("TESTING");
		
		//TEXTFIELDS
		nme_in = new JTextField();
		email_in = new JTextField();
		pass_in = new JTextField();
		
		//combobox for city
		city_in=new JComboBox<String>();
		city_in.addItem("--SELECT City--");
		city_in.addItem("Jaipur");
		city_in.addItem("Bikaner");
		city_in.addItem("Kota");
		city_in.addItem("Pilani");
		city_in.addItem("Raipur");
		
		
		   
	    
        //radiobutton
		male=new JRadioButton("Male");
		
		female=new JRadioButton("Female");
		
		//checkbox
		cricket=new JCheckBox("Cricket");
		ftball=new JCheckBox("Football");
		hockey=new JCheckBox("Hockey");
		
		//table
		STDET = new JTable(rows,cols);		
		sp = new JScrollPane(STDET);
		
		//submit button
		Rgstr = new JButton();
		
		//table model
		model=new DefaultTableModel();
		
		

		//bounds
		Rgstr=new JButton("Register");
		nme.setBounds(30, 20, 60, 30);
		email.setBounds(30, 60, 60, 30);
		pass.setBounds(30, 100, 60, 30);
		city.setBounds(30, 140, 60, 30);
		gndr.setBounds(30, 180, 60, 30);
		hbies.setBounds(30, 220, 60, 30);
		nme_in.setBounds(150, 20, 120, 30);
		email_in.setBounds(150, 60, 120, 30);
		pass_in.setBounds(150, 100, 120, 30);
		city_in.setBounds(150, 140, 120, 30);
		male.setBounds(150, 180, 60, 30);
		female.setBounds(220, 180, 80, 30);
		cricket.setBounds(150, 220, 80, 30);
		hockey.setBounds(240, 220, 80, 30);
		ftball.setBounds(330, 220, 80, 30);
		Rgstr.setBounds(150, 300, 100, 60);
		test.setBounds(350, 300, 100, 60);
		sp.setBounds(100,390, 700, 300);
		
		//adding elements to frame
		add(nme);
		add(nme_in);
		add(email);
		add(email_in);
		add(pass);
		add(pass_in);
		add(city);
		add(gndr);
		add(hbies);
		add(city_in);
		add(male);
		add(female);
		add(hockey);
		add(ftball);
		add(cricket);
		add(Rgstr);
		add(sp);
		add(test);
		
		//listeners
		Rgstr.addActionListener(this);
		
		setTitle("Student Please Enter Your details");
		setSize(900, 900);
		setVisible(true);
		setLayout(null);
		getContentPane().setBackground(Color.white);
	}	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		//    String data1 = nme_in.getText();
		  //  String data2 = email_in.getText();
		   // String data3 = pass_in.getText();
		   

		    //String [] rows = { data1, data2, data3 };

		    //DefaultTableModel model1 = (DefaultTableModel) STDET.getModel();

		   // model1.addRow(rows);
		
		   DefaultTableModel dm = new DefaultTableModel(0, 0);
		    String header[] = new String[] { "Name", "Email ID", "Password","City","Gender","Hobbies" };
		    dm.setColumnIdentifiers(header);
		    STDET.setModel(dm);
	        String cty= String.valueOf(city_in.getSelectedItem());
	      // for (int count = 1; count <= 10; count++) {
		        Vector<Object> data = new Vector<Object>();
		        data.add(nme_in.getText());
		        data.add(email_in.getText());
		        data.add(pass_in.getText());
		        
		        //city output
		        if(cty.equals("Jaipur"))
		        {
		        data.add("Jaipur");
		        } else if(cty.equals("Bikaner"))
		        {
		        	data.add("Bikaner");
		        } else if (cty.equals("Kota")) 
		        {
		        	data.add("kota");
				} else if (cty.equals("Pilani"))
				{
		        	data.add("kota");
				} else if (cty.equals("Raipur"))
				{
		        	data.add("Raipur");
				}
		        
		        //gender output
		        if(male.isSelected()==true)
		        {
		        data.add("Male");
		        } else if(female.isSelected()==true)
		        {
		        	data.add("Female");
		        }

		        //hobies
		        if(cricket.isSelected()==true)
		        {
		        data.add("Cricket");
		        } else if(hockey.isSelected()==true)
		        {
		        	data.add("Hockey");
		        } else if(ftball.isSelected()==true)
		        {
		        	data.add("Football");
		        }
//		        data.add("Pause");
//		        data.add("Status");
//		        System.out.println("test :- " + count);
		        dm.addRow(data);
		       dm.setValueAt(data, 2,0);
		    }


		    
	

	private boolean getSelectedItem() {
		// TODO Auto-generated method stub
		return false;
	}

	public static void main(String[] args) {
		new pan();

	}

}
