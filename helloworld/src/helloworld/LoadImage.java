package helloworld;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class LoadImage extends JPanel{
	private Image image;
	public LoadImage() {
		ImageIcon imageIcon =new ImageIcon("image/1.jpg");
		image =imageIcon.getImage();
	}
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(image, 100, 100, this);
	}

}
