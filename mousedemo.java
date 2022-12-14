import java.awt.*;
import java.awt.event.*;

public class mousedemo extends Frame implements MouseListener
{

	public mousedemo()
	{
		addMouseListener(this);
		addWindowListener(new MyWindowAdapter());
	}

	public void mouseClicked(MouseEvent me)
	{
        this.setSize(new Dimension(500,500));
    }

    public void mouseEntered(MouseEvent me)
    {
        this.setSize(new Dimension(1000,1000));
    }

    public void mouseExited(MouseEvent me)
    {
        System.exit(0);
    }

    public void mouseReleased(MouseEvent me)
    {
        
    }
    
    public void mousePressed(MouseEvent me)
    {
       
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