package warriors.vue;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

import warriors.modele.*;

public class QuickGame extends AbstractAction {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private GUI fenetre;

	public QuickGame(GUI fenetre, String texte){
		super(texte);
		
		this.fenetre = fenetre;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		JOptionPane.showMessageDialog(fenetre, "Vous avez choisi de faire une partie rapide.", "Partie Rapide", JOptionPane.INFORMATION_MESSAGE);
		Personnage player;
		String[] type = {"Guerrier", "Magicien", "Elfe", "Nain"};
		int r = (int) (Math.random() * type.length);
		
		switch(type[r]) {
		case "Guerrier" : player = new Guerrier("Butters"); break;
		case "Magicien": player = new Magicien("Butters"); break;
		case "Elfe": player = new Elfe("Butters"); break;
		case "Nain": player = new Nain("Butters"); break;
		default: player = new Guerrier("butters"); break;
		}
		
		fenetre.getInfo().getPseudo().setText(player.getName() + "Type : " + player.getType());
		fenetre.getInfo().setType(player.getType());
		fenetre.getInfo().getVie().setText("Vie : " + player.drawLife(player.getHealth()));
		fenetre.getInfo().getForce().setText("Force :" + player.drawStrength(player.getStrength()));
		fenetre.getInfo().setPerso(player);
		fenetre.getPlateau().setPlayer(player);
		player.setFrame(fenetre);
		fenetre.getActionsJoueur().getLancer().setEnabled(true);
		fenetre.repaint();
	}
	
}