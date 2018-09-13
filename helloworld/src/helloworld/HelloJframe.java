package helloworld;
import java.awt.Graphics;
import javax.swing.JFrame;

public class HelloJframe extends JFrame{
	public HelloJframe() {
		setTitle("Hello alabama");
		setVisible(true);
		setSize(500,500);
	}
	@Override //day la cai gi ?
	public void paint(Graphics g) {
		super.paint(g);
		g.drawString("Hello world",100,100);
	}
	public static void main(String args[]) {
		new HelloJframe();
	}

}
