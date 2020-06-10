package warriors.modele;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

abstract public class Armes {
	
	private String name;
	private int strength;
	protected Image img;
	
	public Armes() {
		this.name = "Aucune";
	}
	
	public Armes(String name, int strength) {
		this.name = name;
		this.strength = strength;
	}
	
	public String getName() {
		return name;
	}

	public int getStrenth() {
		return strength;
	}
	
	abstract public String getFOR();

	@Override
	public String toString() {
		return "Armes \r Nom:" + name + ", Attaque:" + strength;
	}
	
	public abstract Image getImage();
	

}
