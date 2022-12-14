import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class jinfobuttons implements ActionListener
{
	JButton A, B;
	JLabel l1;

	public jinfobuttons()
	{
		JFrame jfrm = new JFrame("Swing Informatic Buttons");
		jfrm.setLayout(new FlowLayout());
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setBackground(Color.red);
		jfrm.setSize(500,400);

		A = new JButton("A");
		B = new JButton("B");

		jfrm.add(A);
		jfrm.add(B);

		A.addActionListener(this);
		B.addActionListener(this);

		l1 = new JLabel("Information will be displayed here");
		jfrm.add(l1);

		jfrm.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==A)
		{
			l1.setText("Name: Abu Bagdadi Course: Terrorism Roll no: 0786 College: ISI");
		}
		else
		{
			l1.setText("Last Semester CGPA: 10.0");
		}
	}

	public static void main(String[] args) 
	{
		SwingUtilities.invokeLater(
		new Runnable(){
			public void run(){
				new jinfobuttons();
			}
		}
		
		);		
	}
}