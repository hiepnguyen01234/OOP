package dev.codenmore.tilegame.gfx;

import java.awt.image.BufferedImage;

public class Assets {
	public static BufferedImage player,stone,tree,grass,dirt;
	
	public static void init() {
		SpriteSheet sheet =new SpriteSheet(ImageLoader.loadImage("/textures/1.jpg"));
	}

}
