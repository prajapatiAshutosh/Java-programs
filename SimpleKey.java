//Demonstration the key evevt handlers
import java.awt.*;
import java.awt.event.*;


public class SimpleKey extends Frame implements KeyListener {
String msg = "";
String keyState = "";

public SimpleKey(){
addKeyListener(this);
addWindowListener(new MyWindowAdapter());
}

//Handle a key press
public void keyPressed(KeyEvent ke){
keyState = "key Down";
repaint();
}

//Handle a key release
public void keyReleased(KeyEvent ke){
keyState = "key up";
repaint();
}

//Handle key typed
public void keyTyped(KeyEvent ke){
keyState = "key Type";	
msg += ke.getKeyChar();
repaint();
}

//Display keystrokes
public void paint(Graphics g){
g.drawString(msg,20,100);
g.drawString(keyState, 20,50);
}

public static void main(String args[]){
SimpleKey appwin = new SimpleKey();

appwin.setSize(new Dimension(500,400));
appwin.setTitle("Simplekey");
appwin.setVisible(true);
}
}

class MyWindowAdapter extends WindowAdapter{
public void windowClosing(WindowEvent we){
System.exit(0);
}
}



