import javax.swing.*;

class RegForm extends JFrame
{
	JLabel lblHeader, lblStudentName, lblEmailID, lblPassword, lblCity, lblGender, lblHobbies;
	JTextField txtStudentName, txtEmailID;
	JPasswordField jpfPassword;
	JComboBox<String> jcbCity;
	JRadioButton jbMale, jbFemale;
	JCheckBox jbCricket, jbFootball, jbVolleyball;
	JButton btnRegister;
	JTable jt;
	JScrollPane sp;
	String [][]rows={
			{"Kumar", "kumar@gmail.com", "Kumar","Jaipur","Male","Hockey"}
	};
	String []cols={"Name", "Email ID", "Password","City","Gender","Hobbies"};
	public RegForm()
	{
		setLayout(null);
		lblHeader=new JLabel("Student Registration Form");
		lblStudentName=new JLabel("Student Name:");
		lblEmailID=new JLabel("Email ID:");
		lblPassword=new JLabel("Password:");
		lblCity=new JLabel("City:");
		lblGender=new JLabel("Gender:");
		lblHobbies=new JLabel("Hobbies:");
		
		txtStudentName=new JTextField(30);
		txtEmailID=new JTextField(30);
		
		jpfPassword=new JPasswordField(30);
		
		jcbCity=new JComboBox<String>();
		jcbCity.addItem("--SELECT City--");
		jcbCity.addItem("Jaipur");
		jcbCity.addItem("Bikaner");
		jcbCity.addItem("Kota");
		jcbCity.addItem("Pilani");
		jcbCity.addItem("Raipur");
		
		jbMale=new JRadioButton("Male");
		jbFemale=new JRadioButton("Female");
		
		jbCricket=new JCheckBox("Cricket");
		jbFootball=new JCheckBox("Football");
		jbVolleyball=new JCheckBox("Volleyball");
		
		btnRegister=new JButton("Register");
		
		jt=new JTable(rows, cols);
		sp=new JScrollPane(jt);
		
		lblHeader.setBounds(140, 40, 150, 25);
		lblStudentName.setBounds(20, 80, 100, 25);
		txtStudentName.setBounds(140, 80, 270, 25);
		lblEmailID.setBounds(20, 120, 100, 25);
		txtEmailID.setBounds(140, 120, 270, 25);
		lblPassword.setBounds(20, 160, 100, 25);
		jpfPassword.setBounds(140, 160, 270, 25);
		lblCity.setBounds(20, 200, 100, 25);
		jcbCity.setBounds(140, 200, 270, 25);
		lblGender.setBounds(20, 240, 100, 25);
		jbMale.setBounds(140, 240, 80, 25);
		jbFemale.setBounds(230, 240, 80, 25);
		lblHobbies.setBounds(20, 280, 100, 25);
		jbCricket.setBounds(140, 280, 80, 25);
		jbFootball.setBounds(230, 280, 80, 25);
		jbVolleyball.setBounds(330, 280, 80, 25);
		btnRegister.setBounds(140, 320, 100, 25);
		sp.setBounds(20, 360, 400, 300);
		
		add(lblHeader);
		add(lblStudentName);
		add(txtStudentName);
		add(lblEmailID);
		add(txtEmailID);
		add(lblPassword);
		add(jpfPassword);
		add(lblCity);
		add(jcbCity);
		add(lblGender);
		add(jbMale);
		add(jbFemale);
		add(lblHobbies);
		add(jbCricket);
		add(jbFootball);
		add(jbVolleyball);
		add(btnRegister);
		add(sp);
		
		setTitle("Student Registration Form");
		setVisible(true);
		setSize(500, 500);
	}
}
public class SwingReg 
{
	public static void main(String[] args) 
	{
		RegForm rf=new RegForm();
	}
}