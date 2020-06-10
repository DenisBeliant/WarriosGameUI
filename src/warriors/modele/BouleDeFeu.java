package warriors.modele;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class BouleDeFeu extends Armes {

	private static final int FORCE = 7;
	private static String name = "BouleDeFeu";
	private final String FOR = "Magicien";
	
	public BouleDeFeu() {
		super(name, FORCE);
	}

	public int getForce() {
		return FORCE;
	}

	public String getFOR() {
		return FOR;
	}
	
	public Image getImage() {
	{
		try {
			img = ImageIO.read(new File("C:\\Users\\belia\\eclipse-workspace\\warriosGame\\src\\img\\boule-de-feuUI.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return img;
	}
	}
}
