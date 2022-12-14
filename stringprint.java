import java.awt.*;
import java.awt.event.*;

public class stringprint extends Frame 
{
	String msg = "This is the message... ";

	public stringprint()
	{
		Color bg = Color.pink;
		setBackground(bg);
		addWindowListener(new MyWindowAdapter());
		repaint();
    }

	public void paint(Graphics g)
	{
        g.drawString(msg, 200, 250);
    }

    public static void main(String[] args) 
	{
		stringprint ob1= new stringprint();
		ob1.setSize(new Dimension(500,500));
		ob1.setTitle("Printing String");
		ob1.setVisible(true);
	}

}

class MyWindowAdapter extends WindowAdapter
{
    public void windowClosing(WindowEvent we)
    {
        System.exit(0);
    }
}