package warriors.modele;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import warriors.modele.*;

public abstract class Personnage extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String type;
	protected String name;
	public Armes arme;
	private int health;
	private int maxStrength;
	private int strength;
	private int maxHealth = 100;
	private int position = 0;
	private int maxPlateau;
	protected Image img;
	/**
	private String image; Commentée car non utilisée
	*/ 
	abstract public void draw();
	
	public Personnage() {

		this.type = "Inconnu";
	};
	
	public Personnage(String name, int health, int strength) {
		this.name = name;
		this.health = health;
		this.strength = strength;
	}
	
	public void setMax(int MAX) {
		maxPlateau = MAX;
	}
	
	public Personnage(String type, String name, int health, int strength, int maxStrength, int maxHealth) {
		
		this.type = type;
		this.name = name;
		this.health = health;
		this.strength = strength;
		this.maxHealth = maxHealth;
		this.maxStrength = maxHealth;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		if(health + this.health <= maxHealth) this.health += health;
		else this.health = maxHealth;
	}

	public int getPosition() {
		return position;
	}
	
	/** Setters qui vérifie si le personnage ne dépasse pas le plateau **/
	public void setPosition(int position) throws PersonnageHorsPlateauException {
		
			if(this.position + position >= this.maxPlateau + 1 || this.position + position <= 0) {
				this.position = maxPlateau;
				throw new PersonnageHorsPlateauException();
			}
			else
			{
				this.position += position;
				
			}
	}
	

	public void setArme(Armes arme) {
		this.arme = arme;
	}

	public int getMaxStrength() {
		return maxStrength;
	}

	public int getMaxHealth() {
		return maxHealth;
	}
	
	public String drawLife(int health) {
		
		String heart = "";

		for(int i = 0; i < health; i++) {
			heart += "♥";
		}
		return heart;
	}
	
	public String drawStrength(int max) {
		
		String strength = "";

		for(int i = 0; i < max; i++) {
			strength += "☩";
		}
		return strength;
	}

	@Override
	public String toString() {
		return "Personnage Type: " + type + "\rNom: " + name + "\rAttaque: " + strength + "\rVie: " + health
				+ "\rForce Max: " + maxStrength + "\rVie Max: " + maxHealth + "\rPosition: " + position;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		if(this.img != null) {
			g2d.drawImage(this.img, 0, 0, Color.white, null);
		}
		if(this.arme != null) {
			if(this.arme.getImage() != null) {
				g2d.drawImage(this.arme.getImage(), 0, 0, null, null);
			}
		}
		
		g2d.setColor(Color.BLACK);
		g2d.setFont(new Font( "SansSerif", Font.BOLD, 20 ));
		g2d.drawString(this.name, 10, 20);

	}

	
}

