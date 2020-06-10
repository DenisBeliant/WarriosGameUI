package warriors.modele;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Magicien extends Personnage{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final static String type = "Magicien";
	private final static int HEALTH = 3;
	private final static int STRENGTH = 8;
	private final static int MAX_HEALTH = 6;
	private final static int MAX_STRENGTH = 15;
	protected Image img;
	
	public Magicien(String name) {
		super(type, name, HEALTH, STRENGTH, MAX_HEALTH, MAX_STRENGTH);
		getImage();
	}
	
	public void draw() {
		System.out.println("              o\r\n" + 
				"                   O       /`-.__\r\n" + 
				"                          /  \\�'^|\r\n" + 
				"             o           T    l  *\r\n" + 
				"                        _|-..-|_\r\n" + 
				"                 O    (^ '----' `)\r\n" + 
				"                       `\\-....-/^\r\n" + 
				"             O       o  ) \"/ \" (\r\n" + 
				"                       _( (-)  )_\r\n" + 
				"                   O  /\\ )    (  /\\\r\n" + 
				"                     /  \\(    ) |  \\\r\n" + 
				"                 o  o    \\)  ( /    \\\r\n" + 
				"                   /     |(  )|      \\\r\n" + 
				"                  /    o \\ \\( /       \\\r\n" + 
				"            __.--'   O    \\_ /   .._   \\\r\n" + 
				"           //|)\\      ,   (_)   /(((\\^)'\\\r\n" + 
				"              |       | O         )  `  |\r\n" + 
				"              |      / o___      /      /\r\n" + 
				"             /  _.-''^^__O_^^''-._     /\r\n" + 
				"           .'  /  -''^^    ^^''-  \\--'^\r\n" + 
				"         .'   .`.  `'''----'''^  .`. \\\r\n" + 
				"       .'    /   `'--..____..--'^   \\ \\\r\n" + 
				"      /  _.-/                        \\ \\\r\n" + 
				"  .::'_/^   |                        |  `.\r\n" + 
				"         .-'|                        |    `-.\r\n" + 
				"   _.--'`   \\                        /       `-.\r\n" + 
				"  /          \\                      /           `-._\r\n" + 
				"  `'---..__   `.                  .�_.._   __       \\\r\n" + 
				"           ``'''`.              .'gnv   `'^  `''---'^\r\n" + 
				"                  `-..______..-'");
	}
	
	public Image getImage() {
		try {
			img = ImageIO.read(new File("C:\\Users\\belia\\eclipse-workspace\\warriosGame\\src\\img\\magicienUI.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return img;
	}
	
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