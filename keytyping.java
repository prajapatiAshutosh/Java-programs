import java.awt.*;
import java.awt.event.*;

public class keytyping extends Frame implements KeyListener
{
	char msg;

	public keytyping()
	{
        addKeyListener(this);
        addWindowListener(new MyWindowAdapter());
        setBackground(Color.red);
    }

	public void keyPressed(KeyEvent ke)
	{
	}
	
	public void keyReleased(KeyEvent ke)
	{
	}
	
	public void keyTyped(KeyEvent ke)
	{
		msg = ke.getKeyChar();
		repaint();
	}
	
	public void paint(Graphics g)
	{
		g.drawString("Typed character is: "+msg,170,150);
	}

	public static void main(String args[]){
		keytyping ob1 = new keytyping();
		ob1.setSize(new Dimension(500,400));
		ob1.setTitle("Key Typing");
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