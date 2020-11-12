import java.applet.*; 
import java.awt.*; 
import java.awt.event.*;
import java.util.*;

public class MovingText extends Applet implements KeyListener{
	int Width = 150;
	int Height = 200;
	int code=0;
	public void paint(Graphics g){
		String news = "JAVA";
		g.drawString(news.toString(), Width, Height);
	}
	public void init() 
	{
        this.addKeyListener(this);
	}
	public void keyPressed (KeyEvent e){
		code = e.getKeyCode();
				switch(code){
					case KeyEvent.VK_UP : //bnady 3leha b esm el class msh el object 3lshan el var m3mol static
						Height-=20;
					break;
					case KeyEvent.VK_DOWN:
						Height+=20;
					break;
					case KeyEvent.VK_RIGHT:
						Width+=20;
					break;
					case KeyEvent.VK_LEFT:
						Width-=20;
					break;
				}
				repaint();
	}
	public void keyReleased (KeyEvent e){}
	public void keyTyped (KeyEvent e){}
}