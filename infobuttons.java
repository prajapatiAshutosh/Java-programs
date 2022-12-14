import java.awt.*;
import java.awt.event.*;

public class infobuttons extends Frame implements ActionListener
{
	Button A, B;
	String msg = " ";

	public infobuttons()
	{
		setLayout(new FlowLayout());

		A = new Button("A");
		B = new Button("B");

		add(A);
		add(B);

		A.addActionListener(this);
		B.addActionListener(this);

		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==A)
		{
			msg = "Name: Abu Bagdadi Course: Terrorism Roll no: 0786 College: ISI";
		}
		else
		{
			msg = "Last Semester CGPA: 10.0";
		}
		repaint();
	}

	public void paint(Graphics g)
	{
		g.drawString(msg,150,100);
	}

	public static void main(String[] args) 
	{
		infobuttons ob1 = new infobuttons();
		ob1.setTitle("Informatics Buttons");
		ob1.setSize(new Dimension(700,200));
		ob1.setVisible(true);		
	}
}