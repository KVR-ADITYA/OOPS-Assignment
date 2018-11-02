package LoginPage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class FirstFrame extends JFrame{
	private JLabel item1;
	private JTextField item2;
	private JLabel item3;
	private JPasswordField item4;
	private JButton item5;
	private JLabel item6;
	
	
	FirstFrame(){
		super("Hotel_Trivago/Login Page");
		setLayout(new FlowLayout(0,50,5));
		item1 = new JLabel("Enter Username:");
		add(item1);
		item2 = new JTextField("",10);
		add(item2);
		item3 = new JLabel("Enter Password:");
		add(item3);
		item4 = new JPasswordField("",10);
		add(item4);
		item5 = new JButton("Click Here");
		add(item5);
		item6 = new JLabel("to register");
		add(item6);
		
		theHandler h = new theHandler();
		item2.addActionListener(h);
		item4.addActionListener(h);
	}
	private class theHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String u= "";
			String p = "";
			if(e.getSource()==item2)
				u = String.format("%s", e.getActionCommand());
			if(e.getSource()==item4)
				p = String.format("%s", e.getActionCommand());
			if(e.getSource() == item5) {
				SecondFrame f = new SecondFrame();
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f.setSize(350,400);
				f.setVisible(true);	
			}
			JOptionPane.showMessageDialog(null , u);

		}
	}

}
