import java.awt.*;
import java.awt.event.*;

public class buttoncolor extends Frame implements ActionListener
{
	Button Red, Blue;

	public buttoncolor()
	{
		setLayout(new FlowLayout());

		Red = new Button("Red");
		Blue = new Button("Blue");

		add(Red);
		add(Blue);

		Red.addActionListener(this);
		Blue.addActionListener(this);

		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==Red)
		{
			this.setBackground(Color.red);
		}
		else
		{
			this.setBackground(Color.blue);
		}
	}

	public static void main(String[] args) 
	{
		buttoncolor ob1 = new buttoncolor();
		ob1.setTitle("Button Color");
		ob1.setSize(new Dimension(250,200));
		ob1.setVisible(true);		
	}
}