package helloworld;

import javax.swing.JFrame;

public class MainTest extends JFrame{
	public MainTest() {
		setTitle("load image test");
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new LoadImage());
	}
	public static void main(String args[]) {
		new MainTest().setVisible(true);
	}

}
