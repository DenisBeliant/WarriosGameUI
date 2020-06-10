package warriors.modele;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Massue extends Armes{
	
	private static final int FORCE = 3;
	private final String FOR = "Guerrier";
	private static String name = "Massue";

	public Massue() {
		super(name, FORCE);
	}
	
	public int getForce() {
		return this.FORCE;
	}

	public String getFOR() {
		return FOR;
	}
	
	public Image getImage() {
	{
		try {
			img = ImageIO.read(new File("C:\\Users\\belia\\eclipse-workspace\\warriosGame\\src\\img\\epeeUI.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return img;
	}
	}
}
