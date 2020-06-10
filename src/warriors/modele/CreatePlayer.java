package warriors.modele;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

import warriors.vue.GUI;

public class CreatePlayer extends AbstractAction {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private GUI fenetre;

	public CreatePlayer(GUI fenetre, String texte){
		super(texte);
		
		this.fenetre = fenetre;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String[] type = {"Guerrier", "Magicien", "Elfe", "Nain"};
		Personnage player;
		
		String name = (String) JOptionPane.showInputDialog(fenetre, "Choississez le nom du joueur :", "Nom du joueur", JOptionPane.INFORMATION_MESSAGE);
		String reponseType = (String) JOptionPane.showInputDialog(fenetre, "Salut à toi " + name + " !", "Type de joueur", JOptionPane.QUESTION_MESSAGE, null, type, type[0]);
		
		switch(reponseType) {
		case "Guerrier" : player = new Guerrier(name); break;
		case "Magicien": player = new Magicien(name); break;
		case "Elfe": player = new Elfe(name); break;
		case "Nain": player = new Nain(name); break;
		default: player = new Guerrier(name); break;
		}
		
		fenetre.getInfo().getPseudo().setText(player.getName() + "Type : " + player.getType());
		fenetre.getInfo().setType(player.getType());
		fenetre.getInfo().getVie().setText("Vie : " + player.drawLife(player.getHealth()));
		fenetre.getInfo().getForce().setText("Force :" + player.drawStrength(player.getStrength()));
		fenetre.getInfo().setPerso(player);
		fenetre.getPlateau().setPlayer(player);
		fenetre.getActionsJoueur().getLancer().setEnabled(true);
		fenetre.repaint();
	}
	
}