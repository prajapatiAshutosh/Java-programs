import java.awt.*;
import java.awt.event.*;

public class mousedemo extends Frame implements MouseListener
{
	String msg="";
	int mouseX=0,mouseY=0;

	public mousedemo()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
		addWindowListener(new MyWindowAdapter());
	}

	public void mouseClicked(MouseEvent me)
	{
        mouseX=me.getX();
        mouseY=me.getY();
        msg = "click received";
        repaint();
    }

    public void mouseEntered(MouseEvent me)
    {
        mouseX = 100;
        mouseY = 100;
        msg = "Mouse entered";
        repaint();
    }

    public void mouseExited(MouseEvent me)
    {
        mouseX = 100;
        mouseY = 100;
        msg = "Mouse exited";
        repaint();
    }

	public void paint(Graphics g)
	{
		g.drawString(msg,mouseX,mouseY);
	}

	public static void main(String[] args) 
	{
		mousedemo demo1= new mousedemo();
		demo1.setSize(new Dimension(500,500));
		demo1.setTitle("Mouse events");
		demo1.setVisible(true);
	}

}

class MyWindowAdapter extends WindowAdapter
{
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
}