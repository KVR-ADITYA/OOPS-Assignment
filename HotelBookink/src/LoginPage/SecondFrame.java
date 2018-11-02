package LoginPage;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class SecondFrame extends JFrame {
	private JLabel name;
	private JTextField name1;
	private JLabel dob;
	private JTextField dob1;
	private JLabel address;
	private JTextField address1;
	private JLabel email;
	private JTextField email1;
	private JLabel username;
	private JTextField username1;
	private JLabel password;
	private JPasswordField password1;
	private JLabel cpassword;
	private JPasswordField cpassword1;
	private JButton confirm;

	
	public SecondFrame() {
		super("Hotel_Trivago/Create_username Page");
		setLayout(new FlowLayout(0,50,5));
		name = new JLabel("Enter Name:");
		add(name);
		name1 = new JTextField("",10);
		add(name1);
		dob = new JLabel("Enter DOB. :");
		add(dob);
		dob1 = new JTextField("",10);
		add(dob1);
		address = new JLabel("Enter ADDRESS:");
		add(address);
		address1 = new JTextField("",40);
		add(address1);
		email = new JLabel("Enter E-mail:");
		add(email);
		email1 = new JTextField("",10);
		add(email1);
		username = new JLabel("Enter username:");
		add(username);
		username1 = new JTextField("",10);
		add(username1);
		password = new JLabel("Enter Password:");
		add(password);
		password1 = new JPasswordField("",10);
		add(password1);
		cpassword = new JLabel("Enter Password:");
		add(cpassword);
		cpassword1 = new JPasswordField("",10);
		add(cpassword1);
		confirm = new JButton("Confirm");
		add(confirm);
		theHandler h = new theHandler();
		confirm.addActionListener(h);
		name1.addActionListener(h);
		dob1.addActionListener(h);
		address1.addActionListener(h);
		username1.addActionListener(h);
		email1.addActionListener(h);
		password1.addActionListener(h);
		cpassword1.addActionListener(h);
		
	}
	private class theHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String nam= "";
			String dat = "";
			String ad= "";
			String emai = "";
			String usernam = "";
			String passwor = "";
			String cpasswor = "";
			if(e.getSource()==name1) {
				nam = String.format("%s", e.getActionCommand());	
			}
			if(e.getSource()==email1) {
				emai = String.format("%s", e.getActionCommand());
			}
			if(e.getSource()==address1) {
				ad = String.format("%s", e.getActionCommand());
			}
			if(e.getSource()==dob1) {
				dat = String.format("%s", e.getActionCommand());
			}
			if(e.getSource()==username1) {
				usernam = String.format("%s", e.getActionCommand());
			}
			if(e.getSource() == confirm) {
				FirstFrame f = new FirstFrame();
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f.setSize(350,400);
				f.setVisible(true);	
			}
			

		}
	}

}

