import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class jbuttoncolor implements ActionListener
{
	JFrame jfrm;
	JLabel jlab;
    JButton Red, Blue;

	public jbuttoncolor()
	{
		jfrm = new JFrame("JButtonColor");
		jfrm.setLayout(new FlowLayout());
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setBackground(Color.red);
		jfrm.setSize(500,400);

		Red = new JButton("Red");
		Blue = new JButton("Blue");

		jfrm.add(Red);
		jfrm.add(Blue);

		Red.addActionListener(this);
		Blue.addActionListener(this);

		jlab = new JLabel("Background color set to white");
		jfrm.add(jlab);

		jfrm.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==Red)
		{
			jfrm.setBackground(Color.red);
			jlab.setText("Background color set to Red");
		}
		else
		{
			jfrm.setBackground(Color.blue);
			jlab.setText("Background color set to Blue");
		}
	}

	public static void main(String[] args) 
	{
		SwingUtilities.invokeLater(
		new Runnable(){
			public void run(){
				new jbuttoncolor();
			}
		}
		
		);		
	}
}