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
		
		if(player != null) {
			this.cases[0].joueur(player.getName(), player.getType() + ".png", player.getPosition(), g);		
			player.setMax(SIZE);
		}
		else this.cases[0].joueur("Joueur", "Default" + ".png", 0, g);		
		
		for(int i = 1; i < 10; i++) {
			//this.cases[player.getPosition() +i].peindreCase(player.getPosition() + i, g);
			if(player != null) {
				if(i + player.getPosition() <= SIZE) this.cases[player.getPosition() +i].paint(i,g);
			}
			else this.cases[i].paint(i,g);
			}
		}

	
	public void setPlayer(Personnage player) {
		this.player = player;
	}
	
	public void createPlateau() {
		
		cases = new Case[SIZE + 1];
		
		this.cases[0] = new Case("Joueur", "", 0);
		
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
			this.cases[i] = new Case(type, type + ".png",i);
		}
		
		this.cases[SIZE] = new Case("Arrivee", "Arrivee" + ".png",SIZE);
	}
	
}