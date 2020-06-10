package warriors.modele;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Epee extends Armes {

	private static final int FORCE = 5;
	private static String name = "Epée";
	private final String FOR = "Guerrier";
	
	public Epee() {
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
			img = ImageIO.read(new File("C:\\Users\\belia\\eclipse-workspace\\warriosGame\\src\\img\\epeeUI.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return img;
	}
	}

}
