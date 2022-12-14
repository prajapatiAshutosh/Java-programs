import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyboardDemo implements KeyListener
{
     static String msg = "";
     static String keyState = "";
     static JLabel l1, l2;

public KeyboardDemo()
{
	JFrame jfrm = new JFrame("Keyboard Demo");
		jfrm.setLayout(new FlowLayout());
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setBackground(Color.red);
		jfrm.setSize(500,400);

        jfrm.addKeyListener(this);
        l1 = new JLabel("State of the key will be Displayed here");
		jfrm.add(l1);
		l2 = new JLabel("Message typed will be displayed here");
		jfrm.add(l2);


        jfrm.setVisible(true);
}

	public void keyPressed(KeyEvent ke)
	{
		keyState = "Key Pressed";
	    repaint();
	}
	
	public void keyReleased(KeyEvent ke)
	{
		keyState = "key Released";
		repaint();
	}
	
	public void keyTyped(KeyEvent ke)
	{
		keyState = "key Typed";
		msg+=ke.getKeyChar();
		repaint();
	}
	
	public static void repaint()
	{
		l1.setText(""+keyState);
		l2.setText(""+msg);
	}

	public static void main(String args[]){
		SwingUtilities.invokeLater(
		new Runnable(){
			public void run(){
				new KeyboardDemo();
			}
		}
		
		);		

	}
}


