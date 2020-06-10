package warriors.vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.SpringLayout;

import warriors.modele.Personnage;

public class PlateauUI extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SpringLayout layout = new SpringLayout();
	private Case[] cases;
	private int positionJoueur = 0;
	private Personnage player;
	private final int SIZE = 64;
	
	
	public PlateauUI() {
		
		this.setPreferredSize(new Dimension(1000,200));
		this.setLayout(layout);

	}

	public void paintComponent(Graphics g) {
		
		g.setColor(new Color(141,46,25));
		g.fillRect(5, 5, this.getWidth(), this.getHeight());
		
		for(int i = 1; i < 50; i++) {
			g.setColor(new Color(0,0,0));
			
			g.fillRect(20 * i, 14, 12, 7);
			g.fillRect(20 * i, 182, 12, 7);
		}
		
		if(player != null) this.cases[0].joueur(0, player.getName(), player.getType() + ".png", positionJoueur, g);		
		else this.cases[0].joueur(0, "Joueur", "Default" + ".png", positionJoueur, g);		
		
		for(int i = 1; i < 10; i++) {
			this.cases[i].paint(g);
		}
	}
	
	public void setPlayer(Personnage player) {
		this.player = player;
	}
	
	public void createPlateau() {
		
		cases = new Case[SIZE];
		
		if(player != null) this.cases[0] = new Case(0, player.getName(), player.getType() + ".png", positionJoueur);
		else this.cases[0] = new Case(0, "Joueur", "", 0);
		
		for(int i = 1; i < SIZE; i++) {
			int r = (int) (Math.random()*3);
			String type;
			switch(r) {
			case 0: type = "Vide"; break;
			case 1: type = "Ennemi"; break;
			case 2: type = "Potions"; break;
			case 3: type = "Arme"; break;
			default: type = "Vide";
			}
			this.cases[i] = new Case(i * 80 + (30 * i), type, type + ".png", positionJoueur + i);
		}
	}
	
}