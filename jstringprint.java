import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class jstringprint implements ActionListener
{
	JTextField t1;
    JLabel l1;

	public jstringprint()
	{
		JFrame jfrm = new JFrame("Swing string print");
		jfrm.setLayout(new FlowLayout());
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setBackground(Color.pink);
		jfrm.setSize(500,400);

		t1 = new JTextField();
		t1.addActionListener(this);
		jfrm.add(t1);

		l1 = new JLabel("Your text wll be displayed here");
		jfrm.add(l1);

        jfrm.setVisible(true);

    }

	public void actionPerformed(ActionEvent ae)
	{
        l1.setText(t1.getText());
    }

    public static void main(String[] args) 
	{
		SwingUtilities.invokeLater(
		new Runnable(){
			public void run(){
				new jstringprint();
			}
		}
		
		);	
	}

}
