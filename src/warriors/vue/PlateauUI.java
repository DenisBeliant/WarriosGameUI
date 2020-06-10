package warriors.vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class PlateauUI extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SpringLayout layout = new SpringLayout();
	private Case[] cases;
	private int positionJoueur = 0;
	private InfosJoueurUI infosJoueur;
	
	
	public PlateauUI() {
		
		this.setPreferredSize(new Dimension(1000,200));
		this.setLayout(layout);
		cases = new Case[10];
		
		this.cases[0] = new Case(0, "Joueur", "Guerrier.png", positionJoueur);
		
		for(int i = 1; i < 10; i++) {
			this.cases[i] = new Case(i * 80 + (30 * i), "Case vide", "vide.png", positionJoueur + i);
		}
		
	}

	public void paintComponent(Graphics g) {
		
		g.setColor(new Color(141,46,25));
		g.fillRect(5, 5, this.getWidth(), this.getHeight());
		
		for(int i = 1; i < 50; i++) {
			g.setColor(new Color(0,0,0));
			
			g.fillRect(20 * i, 14, 12, 7);
			g.fillRect(20 * i, 182, 12, 7);
		}
		
		for(int i = 0; i < 10; i++) {
			this.cases[i].paint(g);
		}
	}
	
	public void setInfosJoueur(InfosJoueurUI info) {
		this.infosJoueur = info;
	}
}